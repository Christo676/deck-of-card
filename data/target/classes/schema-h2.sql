DROP ALL OBJECTS;

CREATE TABLE IF NOT EXISTS CARDS (
   card_id INT(52) NOT NULL AUTO_INCREMENT PRIMARY KEY,
   suit VARCHAR(10) NOT NULL,
   rank INT(14) NOT NULL
);

CREATE TABLE IF NOT EXISTS DECKS (
   deck_id INT(100) NOT NULL AUTO_INCREMENT PRIMARY KEY
);

CREATE TABLE IF NOT EXISTS DECKS_CARDS (
   deck_id INT(100) NOT NULL,
   card_id INT(52) NOT NULL,
   position INT(52) NOT NULL,
   drawn BOOLEAN DEFAULT FALSE,
   foreign key (deck_id) references DECKS(deck_id),
   foreign key (card_id) references CARDS(card_id)
);