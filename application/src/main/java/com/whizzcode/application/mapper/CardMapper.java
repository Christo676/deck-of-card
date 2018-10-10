package com.whizzcode.application.mapper;

import com.whizzcode.application.dto.CardDto;
import com.whizzcode.business.domain.Card;

import java.util.ArrayList;
import java.util.List;

public final class CardMapper {

  private CardMapper() {}

  public static CardDto toCardDto(final Card card) {
    if (card == null) {
      return null;
    }
    final CardDto cardDto = new CardDto();
    cardDto.setCardId(card.getCardId());
    cardDto.setSuit(card.getSuit());
    cardDto.setRank(card.getRank());
    return cardDto;
  }

  public static List<CardDto> toCardDtos(final List<Card> cards) {
    final List<CardDto> cardDtos = new ArrayList<>();

    if (cards == null || cards.size() == 0) {
      return cardDtos;
    }

    for (final Card card : cards) {
      final CardDto cardDto = toCardDto(card);
      cardDtos.add(cardDto);
    }
    return cardDtos;
  }


}
