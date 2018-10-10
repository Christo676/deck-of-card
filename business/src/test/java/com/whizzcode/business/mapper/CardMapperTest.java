package com.whizzcode.business.mapper;

import com.google.common.truth.Truth;
import com.whizzcode.business.domain.Card;
import com.whizzcode.data.model.CardModel;
import com.whizzcode.data.model.DeckCardModel;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CardMapperTest {

    @Before
    public void init() {
        this.setupMock();
    }

    private void setupMock() {}

    @Test
    public void given_whenToCard_then() {
        final CardModel cardModel = new CardModel();
        cardModel.setCardId(1);
        cardModel.setRank(2);
        cardModel.setSuit("SPADE");

        final Card card = CardMapper.toCard(cardModel);

        Truth.assertThat(card).isNotNull();
        Truth.assertThat(card.getCardId()).isEqualTo(cardModel.getCardId());
        Truth.assertThat(card.getRank()).isEqualTo(cardModel.getRank());
        Truth.assertThat(card.getSuit()).isEqualTo(cardModel.getSuit());
    }

    @Test
    public void given_whenToDeckCardModels_then() {
        final Integer deckId = 1;
        final List<Integer> cardIds = Arrays.asList(1,2,3,4);

        final List<DeckCardModel> deckCardModels = CardMapper.toDeckCardModels(deckId, cardIds);

        Truth.assertThat(deckCardModels).isNotNull();
        Truth.assertThat(deckCardModels).isNotEmpty();
        Truth.assertThat(deckCardModels).hasSize(4);
    }
}
