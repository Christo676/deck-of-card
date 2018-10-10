package com.whizzcode.data.dao;

import com.whizzcode.data.database.public_.tables.records.DecksRecord;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.whizzcode.data.database.public_.tables.Decks.DECKS;

@Repository
public class DeckDao {

  private final DSLContext jooq;

  @Autowired
  public DeckDao(final DSLContext jooq) {
    this.jooq = jooq;
  }

  public Boolean exists(Integer deckId) {
    final DecksRecord decksRecord =
        this.jooq.selectFrom(DECKS).where(DECKS.DECK_ID.eq(deckId)).fetchOne();
    return decksRecord != null;
  }

  public Integer create() {
    final Integer deckId =
        this.jooq.insertInto(DECKS).defaultValues().returning(DECKS.DECK_ID).fetchOne().getDeckId();
    return deckId;
  }
}
