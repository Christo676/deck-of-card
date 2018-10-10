package com.whizzcode.business.component;

import com.whizzcode.business.domain.Card;
import com.whizzcode.business.exception.DeckNotFound;
import com.whizzcode.business.mapper.CardMapper;
import com.whizzcode.data.dao.CardDao;
import com.whizzcode.data.dao.DeckCardDao;
import com.whizzcode.data.dao.DeckDao;
import com.whizzcode.data.model.CardModel;
import com.whizzcode.data.model.DeckCardModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class PokerDealer implements Dealer {

  private final DeckDao deckDao;
  private final DeckCardDao deckCardDao;
  private final CardDao cardDao;

  @Autowired
  public PokerDealer(final DeckDao deckDao, final DeckCardDao deckCardDao, final CardDao cardDao) {
    this.deckDao = deckDao;
    this.deckCardDao = deckCardDao;
    this.cardDao = cardDao;
  }

  public void shuffle(final Integer deckId) {
    final Boolean exists = this.deckDao.exists(deckId);

    if (!exists) {
      throw new DeckNotFound(String.format("The deck with the deckId %s was not found.", deckId));
    }

    final List<DeckCardModel> deckCardModels = this.deckCardDao.readAllDrawableCard(deckId);

    final Random random = new Random();
    final int size = deckCardModels.size();

    for (int i = size; i > 1; i--) {
      final int randomNumber = random.nextInt(i);

      final DeckCardModel model = deckCardModels.get(i - 1);
      final DeckCardModel randomModel = deckCardModels.get(randomNumber);

      final Integer position = model.getPosition();
      model.setPosition(randomModel.getPosition());
      randomModel.setPosition(position);
    }

    this.deckCardDao.update(deckCardModels);
  }

  public Card dealOneCard(final Integer deckId) {
    final Boolean exists = this.deckDao.exists(deckId);

    if (!exists) {
      throw new DeckNotFound(String.format("The deck with the deckId %s was not found.", deckId));
    }

    final DeckCardModel deckCardModel = this.deckCardDao.readNextDrawableCard(deckId);

    if (deckCardModel != null) {
      deckCardModel.setDrawn(true);
      this.deckCardDao.update(deckCardModel);

      final CardModel cardModel = this.cardDao.read(deckCardModel.getCardId());
      return CardMapper.toCard(cardModel);
    } else {
      return null;
    }
  }

  public Integer makeDeck() {
    final Integer deckId = this.deckDao.create();
    final List<Integer> cardIds = this.cardDao.readAllCardId();
    final List<DeckCardModel> deckCardModels =
        CardMapper.toDeckCardModels(Integer.valueOf(deckId), cardIds);
    this.deckCardDao.create(deckCardModels);
    return deckId;
  }
}
