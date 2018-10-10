package com.whizzcode.business.component;

import com.whizzcode.business.domain.Card;

public interface Dealer {

    void shuffle(final Integer deckId);

    Card dealOneCard(final Integer deckId);
}