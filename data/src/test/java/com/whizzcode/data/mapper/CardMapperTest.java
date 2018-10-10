package com.whizzcode.data.mapper;

import com.google.common.truth.Truth;
import com.whizzcode.data.database.public_.tables.records.CardsRecord;
import com.whizzcode.data.model.CardModel;
import org.junit.Before;
import org.junit.Test;

public class CardMapperTest {

    @Before
    public void init() {
        this.setupMock();
    }

    private void setupMock() {}

    @Test
    public void given_when_then(){
        final CardsRecord cardsRecord = new CardsRecord();
        cardsRecord.setCardId(1);
        cardsRecord.setRank(1);
        cardsRecord.setSuit("HEARTH");

        final CardModel cardModel = CardMapper.toCardModel(cardsRecord);

        Truth.assertThat(cardModel).isNotNull();
        Truth.assertThat(cardModel.getCardId()).isEqualTo(cardsRecord.getCardId());
        Truth.assertThat(cardModel.getRank()).isEqualTo(cardsRecord.getRank());
        Truth.assertThat(cardModel.getSuit()).isEqualTo(cardsRecord.getSuit());
    }

}
