package com.whizzcode.data.mapper;

import com.whizzcode.data.database.public_.tables.records.DecksCardsRecord;
import com.whizzcode.data.model.DeckCardModel;
import org.jooq.Result;


import java.util.ArrayList;
import java.util.List;

public final class DeckCardMapper {

  public static DeckCardModel toDeckCardModel(final DecksCardsRecord decksCardsRecord) {
    if (decksCardsRecord == null) {
      return null;
    }
    final DeckCardModel deckCardModel = new DeckCardModel();
    deckCardModel.setDrawn(decksCardsRecord.getDrawn());
    deckCardModel.setPosition(decksCardsRecord.getPosition());
    deckCardModel.setDeckId(decksCardsRecord.getDeckId());
    deckCardModel.setCardId(decksCardsRecord.getCardId());
    return deckCardModel;
  }

  public static List<DeckCardModel> toDeckCardModels(final Result<DecksCardsRecord> result) {
    final List<DeckCardModel> deckCardModels = new ArrayList<>();

    if (result == null) {
      return deckCardModels;
    }

    for (final DecksCardsRecord decksCardsRecord : result) {
      final DeckCardModel deckCardModel = toDeckCardModel(decksCardsRecord);
      deckCardModels.add(deckCardModel);
    }
    return deckCardModels;
  }
}
