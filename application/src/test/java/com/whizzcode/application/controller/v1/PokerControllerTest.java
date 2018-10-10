package com.whizzcode.application.controller.v1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.truth.Truth;
import com.whizzcode.application.dto.CardDto;
import com.whizzcode.business.domain.Card;
import com.whizzcode.business.service.PokerService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PokerControllerTest {

  @Mock private PokerService mockPokerService;
  @InjectMocks private PokerController pokerController;

  private ObjectMapper objectMapper;

  @Before
  public void init() {
    this.objectMapper = new ObjectMapper();
    this.setupMock();
  }

  private void setupMock() {}

  @Test
  public void givenValidDeckId_whenDrawCard_thenReturnOkWithDto() throws IOException {
    final Card card =
        this.objectMapper.readValue(
            PokerControllerTest.class.getResourceAsStream("/card/card.json"), Card.class);
    final Integer deckId = 1;

    when(mockPokerService.draw(anyInt())).thenReturn(card);

    final ResponseEntity<CardDto> responseEntity = pokerController.drawCard(deckId);

    verify(mockPokerService, times(1)).draw(deckId);

    final HttpStatus httpStatus = responseEntity.getStatusCode();
    final CardDto cardDto = responseEntity.getBody();

    Truth.assertThat(httpStatus).isEqualTo(HttpStatus.OK);

    Truth.assertThat(cardDto).isNotNull();
    Truth.assertThat(cardDto.getCardId()).isEqualTo(card.getCardId());
    Truth.assertThat(cardDto.getRank()).isEqualTo(card.getRank());
    Truth.assertThat(cardDto.getSuit()).isEqualTo(card.getSuit());
  }

  @Test
  public void givenValidDeckId_whenMakeDeck_thenReturnCreatedWIthDeckId() {
    final Integer deckId = 1;
    when(mockPokerService.makeDeck()).thenReturn(deckId);

    final ResponseEntity<Integer> responseEntity = pokerController.makeDeck();

    verify(mockPokerService, times(1)).makeDeck();

    final HttpStatus httpStatus = responseEntity.getStatusCode();
    final Integer id = responseEntity.getBody();

    Truth.assertThat(httpStatus).isEqualTo(HttpStatus.CREATED);

    Truth.assertThat(id).isEqualTo(deckId);
  }

  @Test
  public void givenValidDeckId_whenShuffle_thenReturnNoContent() {
    final Integer deckId = 1;

    final ResponseEntity<Void> responseEntity = pokerController.shuffle(deckId);

    verify(mockPokerService, times(1)).shuffle(deckId);

    final HttpStatus httpStatus = responseEntity.getStatusCode();
    Truth.assertThat(httpStatus).isEqualTo(HttpStatus.NO_CONTENT);
  }
}
