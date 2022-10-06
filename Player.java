
public class Player {

    private String name;


    //The cards in player's hand
    private Card[] hand = new Card[10];

    //The number of cards in the player's hand
    private int numCards;

    //Player constructor
    public Player(String aName) {
        this.name = aName;

        this.emtyHand();
    }

    public void emptyHand() {

        for (int c = 0; c < 10; c++) {
                this.hand[c] = null;
        }
        this.numCards = 0;
    }

    public boolean addCard (Card aCard) {

        if (this.numCards == 10) {
            System.err.printf("%s's hand already has 10 cards; " + "cannot add another\n", this.name);
            System.exit(1);
        }

        this.hand[this.numCards] = aCard;
        this.numCards++;

        return (this.getHandSum() <= 21);
    }
}