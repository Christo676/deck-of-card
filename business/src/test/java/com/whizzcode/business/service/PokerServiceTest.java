package com.whizzcode.business.service;

import com.google.common.truth.Truth;
import com.whizzcode.business.component.PokerDealer;
import com.whizzcode.business.domain.Card;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PokerServiceTest {

  @Mock private PokerDealer mockPokerDealer;
  @InjectMocks private PokerService pokerService;

  @Before
  public void init() {
    this.setupMock();
  }

  private void setupMock() {}

  @Test
  public void givenValidDeckIdAndDrawableCardLeft_whenDraw_thenReturnCard() {
    final Integer deckId = 1;

    final Card card = new Card();
    card.setCardId(2);
    card.setSuit("SPADE");
    card.setRank(5);

    when(mockPokerDealer.dealOneCard(deckId)).thenReturn(card);

    final Card resultCard = this.pokerService.draw(deckId);

    verify(mockPokerDealer, times(1)).dealOneCard(deckId);

    Truth.assertThat(resultCard).isNotNull();
  }

  @Test
  public void given_whenMakeDeck_thenMakeDeck() {
    this.pokerService.makeDeck();

    verify(mockPokerDealer, times(1)).makeDeck();
  }

  @Test
  public void given_whenShuffle_thenShuffleDeck() {
    final Integer deckId = 1;
    this.pokerService.shuffle(deckId);

    verify(mockPokerDealer, times(1)).shuffle(deckId);
  }
}
