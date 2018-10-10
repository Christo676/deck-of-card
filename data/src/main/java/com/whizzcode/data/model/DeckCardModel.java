package com.whizzcode.data.model;

public class DeckCardModel {

  private Integer deckId;
  private Integer cardId;
  private Integer position;
  private Boolean isDrawn;

  public DeckCardModel() {}

  public Integer getDeckId() {
    return deckId;
  }

  public void setDeckId(Integer deckId) {
    this.deckId = deckId;
  }

  public Integer getCardId() {
    return cardId;
  }

  public void setCardId(Integer cardId) {
    this.cardId = cardId;
  }

  public Integer getPosition() {
    return position;
  }

  public void setPosition(Integer position) {
    this.position = position;
  }

  public Boolean getDrawn() {
    return isDrawn;
  }

  public void setDrawn(Boolean drawn) {
    isDrawn = drawn;
  }
}
