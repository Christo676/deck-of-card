package com.whizzcode.business.service;

import com.whizzcode.business.component.PokerDealer;
import com.whizzcode.business.domain.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PokerService {

  private final PokerDealer pokerDealer;

  @Autowired
  public PokerService(final PokerDealer pokerDealer) {
    this.pokerDealer = pokerDealer;
  }

  @Transactional
  public void shuffle(final Integer deckId) {
      this.pokerDealer.shuffle(deckId);
  }

  @Transactional
  public Card draw(final Integer deckId) {
    return this.pokerDealer.dealOneCard(deckId);
  }

  @Transactional
  public Integer makeDeck() {
    return this.pokerDealer.makeDeck();
  }
}
