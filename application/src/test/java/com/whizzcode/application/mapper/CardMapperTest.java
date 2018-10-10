package com.whizzcode.application.mapper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.truth.Truth;
import com.whizzcode.application.controller.v1.PokerControllerTest;
import com.whizzcode.application.dto.CardDto;
import com.whizzcode.business.domain.Card;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class CardMapperTest {

  private ObjectMapper objectMapper;

  @Before
  public void init() {
    this.objectMapper = new ObjectMapper();
    this.setupMock();
  }

  private void setupMock() {}

  @Test
  public void givenCardObject_whenToCardDto_thenMapData() throws IOException {
    final Card card =
        this.objectMapper.readValue(
            PokerControllerTest.class.getResourceAsStream("/card/card.json"), Card.class);
    final CardDto cardDto = CardMapper.toCardDto(card);

    Truth.assertThat(cardDto).isNotNull();
    Truth.assertThat(cardDto.getCardId()).isEqualTo(card.getCardId());
    Truth.assertThat(cardDto.getRank()).isEqualTo(card.getRank());
    Truth.assertThat(cardDto.getSuit()).isEqualTo(card.getSuit());
  }
}
