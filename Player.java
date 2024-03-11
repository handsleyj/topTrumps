public class Player {
    private Card[] deck;
    private String name;
    private int maxSize;
    private int curSize;
    private int curCard;

    public Player(String s, int deckSize) {
        this.name = s;
        deck = new Card[deckSize];
        this.maxSize = deckSize;
        this.curSize = 0;
        this.curCard = 0;
    }

    public void addCard(Card c) {
        int i = 0;
        while ((this.deck[i] != null) && (i != this.maxSize)) {
            i++;
        }
        if (i != maxSize) {
            this.deck[i] = c;
            this.curSize++;
        }
    }

    public void removeCard(Card c) {
        for (int i = 0; i < curSize; i++) {
            if (this.deck[i] == c) {
                this.deck[i] = null;
                this.curSize--;
            }
        }
    }

    public int getCardCount() {
        return this.curSize;
    }

    public String getPlayerName() {
        return this.name;
    }

    public void nextCard() {
        if (this.curSize > 1) {
            while ((this.deck[this.curCard + 1] == null)) {
                this.curCard++;
                if ((this.curCard + 1) >= this.maxSize) {
                    this.curCard = 0;
                } 
            }
            this.curCard++;
        }
    }

    public Card getCurrentCard() {
        return deck[this.curCard];
    }

    public boolean hasWon() {
        if (this.curSize == this.maxSize) {
            return true;
        }
        return false;
    }
}
