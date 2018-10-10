package com.whizzcode.business.mapper;

import com.whizzcode.business.domain.Card;
import com.whizzcode.data.model.CardModel;
import com.whizzcode.data.model.DeckCardModel;

import java.util.ArrayList;
import java.util.List;

public final class CardMapper {

  private CardMapper() {}

  public static List<Card> toCards(final List<CardModel> cardModels) {
    final List<Card> cards = new ArrayList<>();

    if (cardModels == null) {
      return cards;
    }

    for (final CardModel cardModel : cardModels) {
      final Card card = toCard(cardModel);
      cards.add(card);
    }
    return cards;
  }

  public static Card toCard(final CardModel cardModel) {
    if (cardModel == null) {
      return null;
    }
    final Card card = new Card();
    card.setCardId(cardModel.getCardId());
    card.setSuit(cardModel.getSuit());
    card.setRank(cardModel.getRank());
    return card;
  }

  public static List<DeckCardModel> toDeckCardModels(final Integer deckId, final List<Integer> cardIds) {
    final List<DeckCardModel> deckCardModels = new ArrayList<>();

    if (deckId == null || cardIds == null || cardIds.isEmpty()) {
      return deckCardModels;
    }

    for (int i = 0; i < cardIds.size(); i++) {
      final DeckCardModel deckCardModel = new DeckCardModel();
      deckCardModel.setCardId(cardIds.get(i));
      deckCardModel.setDeckId(deckId);
      deckCardModel.setPosition(i + 1);
      deckCardModel.setDrawn(false);

      deckCardModels.add(deckCardModel);
    }

    return deckCardModels;
  }
}
