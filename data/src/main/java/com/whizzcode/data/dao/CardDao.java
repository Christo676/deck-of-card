package com.whizzcode.data.dao;

import com.whizzcode.data.database.public_.Tables;
import com.whizzcode.data.database.public_.tables.records.CardsRecord;
import com.whizzcode.data.mapper.CardMapper;
import com.whizzcode.data.model.CardModel;
import org.jooq.DSLContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CardDao {

  private static final Logger logger = LoggerFactory.getLogger(CardDao.class);

  private final DSLContext jooq;

  @Autowired
  public CardDao(final DSLContext jooq) {
    this.jooq = jooq;
  }

  public List<Integer> readAllCardId() {
    return this.jooq
        .select()
        .from(Tables.CARDS)
        .fetch()
        .getValues(Tables.CARDS.CARD_ID, Integer.class);
  }

  public CardModel read(final Integer cardId) {
    final CardsRecord cardsRecord = this.jooq.selectFrom(Tables.CARDS)
                .where(Tables.CARDS.CARD_ID.eq(cardId))
                .fetchOne();
    return CardMapper.toCardModel(cardsRecord);
  }
}
