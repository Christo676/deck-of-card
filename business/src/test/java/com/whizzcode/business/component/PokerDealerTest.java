package com.whizzcode.business.component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.truth.Truth;
import com.whizzcode.business.domain.Card;
import com.whizzcode.business.exception.DeckNotFound;
import com.whizzcode.data.dao.CardDao;
import com.whizzcode.data.dao.DeckCardDao;
import com.whizzcode.data.dao.DeckDao;
import com.whizzcode.data.model.CardModel;
import com.whizzcode.data.model.DeckCardModel;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PokerDealerTest {

  @Mock private DeckDao mockDeckDao;
  @Mock private DeckCardDao mockDeckCardDao;
  @Mock private CardDao mockCardDao;
  @InjectMocks PokerDealer pokerDealer;

  private ObjectMapper objectMapper;

  @Before
  public void init() {
    this.objectMapper = new ObjectMapper();
    this.setupMock();
  }

  private void setupMock() {}

  @Test
  public void givenValidDeckId_whenShuffle_thenDeckCardPositionChanged() throws IOException {
    final List<DeckCardModel> originalDeckCardModels =
        this.objectMapper.readValue(
            PokerDealerTest.class.getResourceAsStream("/deck/deckCardModels.json"),
            new TypeReference<List<DeckCardModel>>() {});

    final List<DeckCardModel> testDeckCardModels =
        this.objectMapper.readValue(
            PokerDealerTest.class.getResourceAsStream("/deck/deckCardModels.json"),
            new TypeReference<List<DeckCardModel>>() {});

    final Integer id = 1;

    when(mockDeckDao.exists(id)).thenReturn(true);
    when(mockDeckCardDao.readAllDrawableCard(id)).thenReturn(testDeckCardModels);

    this.pokerDealer.shuffle(id);

    boolean hasChanged = false;
    for (final DeckCardModel testModel : testDeckCardModels) {
      final Integer cardId = testModel.getCardId();
      final Integer deckId = testModel.getDeckId();

      final DeckCardModel originalModel =
          originalDeckCardModels
              .stream()
              .filter(o -> o.getDeckId().equals(deckId) && o.getCardId().equals(cardId))
              .findFirst()
              .orElse(null);

      if (!originalModel.getPosition().equals(testModel.getPosition())) {
        hasChanged = true;
        break;
      }
    }

    Truth.assertThat(hasChanged).isTrue();
  }

  @Test(expected = DeckNotFound.class)
  public void givenNotExistingDeckId_whenShuffle_thenThrowDeckNotFoundException() {
    final Integer id = 1;
    when(mockDeckDao.exists(anyInt())).thenReturn(false);
    this.pokerDealer.shuffle(id);
  }

  @Test
  public void givenDrawableCardLeft_whenDealOneCard_thenReturnCard() {
    final Integer id = 1;
    final Integer cardId = 2;

    final DeckCardModel deckCardModel = new DeckCardModel();
    deckCardModel.setDrawn(false);
    deckCardModel.setPosition(2);
    deckCardModel.setCardId(cardId);
    deckCardModel.setDeckId(id);

    final CardModel cardModel = new CardModel();
    cardModel.setSuit("Hearth");
    cardModel.setCardId(cardId);
    cardModel.setRank(5);

    when(mockDeckDao.exists(id)).thenReturn(true);
    when(mockDeckCardDao.readNextDrawableCard(id)).thenReturn(deckCardModel);
    when(mockCardDao.read(cardId)).thenReturn(cardModel);

    final Card card = this.pokerDealer.dealOneCard(id);

    Truth.assertThat(card).isNotNull();
    Truth.assertThat(card.getCardId()).isEqualTo(cardId);
  }

  @Test
  public void givenNoCardLeft_whenDealOneCard_thenReturnNull() {
    final Integer id = 1;

    when(mockDeckDao.exists(id)).thenReturn(true);
    when(mockDeckCardDao.readNextDrawableCard(id)).thenReturn(null);

    final Card card = this.pokerDealer.dealOneCard(id);

    Truth.assertThat(card).isNull();
  }
}
