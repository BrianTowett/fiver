package com.fiverr.veriffication.service;

import com.fiverr.veriffication.model.Card;
import com.fiverr.veriffication.repository.CardRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

@Service
public class CardService {

    private final CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public Card saveCard(Card card) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("h.mma EEEE", Locale.ENGLISH);
        String formattedTime = LocalDateTime.now().format(formatter).toLowerCase();

        card.setFormattedCreatedAt(formattedTime);

        return cardRepository.save(card);
    }
    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }
}
