
public class Card{

    //One of the four valid suits for this card
    private Suit mySuit;

    //The number of hits card where Ace = 1, Jack = 11, ...
    private int myNumber;

    /*
    Card constructor
    param aSuit : The suit of the card
    parama aNumber : The number of the card
    */
    public Card(Suit aSuit, int aNumber) {

        this.mySuit = aSuit;

        if (aNumber >= && aNumber <=13) {
            this.myNumber = aNumber;
        } else {
            System.err.println(aNumber + " is not a valid Card number");
            System.exit(1);
        }
    }
    
}