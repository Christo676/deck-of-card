package com.whizzcode.data.mapper;

import com.google.common.truth.Truth;
import com.whizzcode.data.database.public_.tables.records.DecksCardsRecord;
import com.whizzcode.data.model.CardModel;
import com.whizzcode.data.model.DeckCardModel;
import org.junit.Before;
import org.junit.Test;

public class DeckCardMapperTest {

  @Before
  public void init() {
    this.setupMock();
  }

  private void setupMock() {}

  @Test
  public void given_when_then() {
    final DecksCardsRecord decksCardsRecord = new DecksCardsRecord();
    decksCardsRecord.setCardId(1);
    decksCardsRecord.setDeckId(1);
    decksCardsRecord.setDrawn(true);
    decksCardsRecord.setPosition(7);

    final DeckCardModel deckCardModel = DeckCardMapper.toDeckCardModel(decksCardsRecord);

    Truth.assertThat(deckCardModel).isNotNull();
    Truth.assertThat(deckCardModel.getCardId()).isEqualTo(decksCardsRecord.getCardId());
    Truth.assertThat(deckCardModel.getDeckId()).isEqualTo(decksCardsRecord.getDeckId());
    Truth.assertThat(deckCardModel.getDrawn()).isEqualTo(decksCardsRecord.getDrawn());
    Truth.assertThat(deckCardModel.getPosition()).isEqualTo(decksCardsRecord.getPosition());
  }
}
