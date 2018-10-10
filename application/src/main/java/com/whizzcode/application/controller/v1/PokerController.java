package com.whizzcode.application.controller.v1;

import com.whizzcode.application.dto.CardDto;
import com.whizzcode.application.mapper.CardMapper;
import com.whizzcode.business.domain.Card;
import com.whizzcode.business.service.PokerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/poker")
public class PokerController {

  private static final Logger logger = LoggerFactory.getLogger(PokerController.class);

  private final PokerService pokerService;

  @Autowired
  public PokerController(final PokerService pokerService) {
    this.pokerService = pokerService;
  }

  @PostMapping(value = "/decks", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Integer> makeDeck() {
    final Integer deckId = this.pokerService.makeDeck();
    return ResponseEntity.status(201).body(deckId);
  }

  @PutMapping(value = "/decks/{deckId}/shuffle", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<Void> shuffle(@PathVariable("deckId") final Integer deckId) {
    this.pokerService.shuffle(deckId);
    return ResponseEntity.noContent().build();
  }

  @PutMapping(value = "decks/{deckId}/cards/draw", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<CardDto> drawCard(@PathVariable("deckId") final Integer deckId) {
    final Card card = this.pokerService.draw(deckId);

    if (card == null) {
      return ResponseEntity.noContent().build();
    }

    final CardDto cardDto = CardMapper.toCardDto(card);
    return ResponseEntity.ok(cardDto);
  }
}
