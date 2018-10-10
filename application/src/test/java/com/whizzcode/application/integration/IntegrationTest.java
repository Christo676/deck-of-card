package com.whizzcode.application.integration;

import com.google.common.truth.Truth;
import com.whizzcode.application.dto.CardDto;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@ActiveProfiles("test")
public class IntegrationTest {

  @LocalServerPort int serverPort;

  private RestTemplate restTemplate;

  @Before
  public void init() {
    this.restTemplate = new RestTemplate();
    this.setupMock();
  }

  private void setupMock() {}

  @Test
  public void givenDeckId_whenShuffle_thenReturnNoContent() {
      final String createUrl = UriComponentsBuilder.fromHttpUrl("http://localhost:" + serverPort + "/api/v1/poker/decks").toUriString();
      final ResponseEntity<Integer> responseEntity = this.restTemplate.exchange(createUrl, HttpMethod.POST, null, Integer.class);
      final Integer deckId = responseEntity.getBody();

      final String shuffleUrl = UriComponentsBuilder.fromHttpUrl("http://localhost:" + serverPort +"/api/v1/poker/decks/" + deckId + "/shuffle").toUriString();
      final ResponseEntity<Void> shuffleResponseEntity = this.restTemplate.exchange(shuffleUrl, HttpMethod.PUT, null, Void.class);

      final HttpStatus httpStatus = shuffleResponseEntity.getStatusCode();
      Truth.assertThat(httpStatus).isEqualTo(HttpStatus.NO_CONTENT);
  }

  @Test
  public void givenDeckId_whenDraw_thenReturnCard() {
      final String createUrl = UriComponentsBuilder.fromHttpUrl("http://localhost:" + serverPort + "/api/v1/poker/decks").toUriString();
      final ResponseEntity<Integer> responseEntity = this.restTemplate.exchange(createUrl, HttpMethod.POST, null, Integer.class);
      final Integer deckId = responseEntity.getBody();

      final String drawUrl = UriComponentsBuilder.fromHttpUrl("http://localhost:" + serverPort +"/api/v1/poker/decks/" + deckId + "/cards/draw").toUriString();
      final ResponseEntity<CardDto> drawResponseEntity = this.restTemplate.exchange(drawUrl, HttpMethod.PUT, null, CardDto.class);

      final HttpStatus httpStatus = drawResponseEntity.getStatusCode();
      final CardDto cardDto = drawResponseEntity.getBody();

      Truth.assertThat(httpStatus).isEqualTo(HttpStatus.OK);
      Truth.assertThat(cardDto).isNotNull();
  }

  @Test
  public void givenRequestMakeDeck_whenMakeDeck_thenCreateDeckAndReturnDeckId() {
    final String url = UriComponentsBuilder.fromHttpUrl("http://localhost:" + serverPort + "/api/v1/poker/decks").toUriString();
    final ResponseEntity<Integer> responseEntity =
        this.restTemplate.exchange(url, HttpMethod.POST, null, Integer.class);

    final HttpStatus httpStatus = responseEntity.getStatusCode();
    final Integer deckId = responseEntity.getBody();

    Truth.assertThat(httpStatus).isEqualTo(HttpStatus.CREATED);
    Truth.assertThat(deckId).isNotNull();
  }
}
