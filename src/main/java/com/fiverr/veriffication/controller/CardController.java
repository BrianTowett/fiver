package com.fiverr.veriffication.controller;

import com.fiverr.veriffication.model.Card;
import com.fiverr.veriffication.service.CardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/verify")
@CrossOrigin(origins = "*")
public class CardController {
    private final CardService cardService;
    public CardController(CardService cardService) { this.cardService = cardService; }

    @PostMapping("/card")
    public ResponseEntity<Card> submitCard(@RequestBody Card card) {
        return ResponseEntity.ok(cardService.saveCard(card));
    }
    @GetMapping("/cards")
    public ResponseEntity<List<Card>> getAllCards() {
        return ResponseEntity.ok(cardService.getAllCards());
    }

}
