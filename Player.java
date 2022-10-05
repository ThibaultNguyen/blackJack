
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
}