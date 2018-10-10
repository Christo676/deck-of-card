package com.whizzcode.data.mapper;

import com.whizzcode.data.database.public_.tables.records.CardsRecord;
import com.whizzcode.data.model.CardModel;

public final class CardMapper {
  private CardMapper() {}

  public static CardModel toCardModel(final CardsRecord cardsRecord) {
      if (cardsRecord == null) {
          return null;
      }
      final CardModel cardModel = new CardModel();
      cardModel.setCardId(cardsRecord.getCardId());
      cardModel.setRank(cardsRecord.getRank());
      cardModel.setSuit(cardsRecord.getSuit());
      return cardModel;
  }
}