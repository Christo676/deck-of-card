package com.whizzcode.data.dao;

import com.whizzcode.data.database.public_.tables.records.DecksCardsRecord;
import com.whizzcode.data.mapper.DeckCardMapper;
import com.whizzcode.data.model.DeckCardModel;
import org.jooq.DSLContext;

import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.whizzcode.data.database.public_.Tables.DECKS_CARDS;


@Repository
public class DeckCardDao {

  private final DSLContext jooq;

  @Autowired
  public DeckCardDao(final DSLContext jooq) {
    this.jooq = jooq;
  }

  public String create(final DeckCardModel deckCardModel) {
    this.jooq
        .insertInto(DECKS_CARDS, DECKS_CARDS.DECK_ID, DECKS_CARDS.CARD_ID, DECKS_CARDS.POSITION)
        .values(deckCardModel.getDeckId(), deckCardModel.getCardId(), deckCardModel.getPosition())
        .execute();
    return null;
  }

  public void create(final List<DeckCardModel> deckCardModels) {
    if (deckCardModels != null) {
      for (final DeckCardModel deckCardModel : deckCardModels) {
        this.create(deckCardModel);
      }
    }
  }

  public DeckCardModel readNextDrawableCard(final Integer deckId) {
    final DecksCardsRecord decksCardsRecord = this.jooq
            .selectFrom(DECKS_CARDS)
            .where(DECKS_CARDS.DECK_ID.eq(deckId))
            .and(DECKS_CARDS.DRAWN.eq(false))
            .orderBy(DECKS_CARDS.POSITION.asc())
            .limit(1)
            .fetchOne();
    return DeckCardMapper.toDeckCardModel(decksCardsRecord);
  }

  public List<DeckCardModel> readAllDrawableCard(final Integer deckId) {
    final Result<DecksCardsRecord> result =
        this.jooq
            .selectFrom(DECKS_CARDS)
            .where(DECKS_CARDS.DECK_ID.eq(deckId))
            .and(DECKS_CARDS.DRAWN.eq(false))
            .fetch();
    return DeckCardMapper.toDeckCardModels(result);
  }

  public void update(final DeckCardModel model) {
    this.jooq
        .update(DECKS_CARDS)
        .set(DECKS_CARDS.POSITION, model.getPosition())
        .set(DECKS_CARDS.DRAWN, model.getDrawn())
        .where(DECKS_CARDS.CARD_ID.eq(model.getCardId())
                .and(DECKS_CARDS.DECK_ID.eq(model.getDeckId())))
        .execute();
  }

  public void update(final List<DeckCardModel> models) {
    if (models != null) {
      for (final DeckCardModel model : models) {
        this.update(model);
      }
    }
  }
}
