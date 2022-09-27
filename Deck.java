
import java.util.Random;

public class Deck {

    //Array of cards in the deck
    private Card[] myCards;

    //number of cards currently in the deck
    private int numCards;

    //constructor with default deck 52 cards and no shuffling
    public Deck{

        this(1, false);

    }

    /*constructor defining the deck
    *how many sets of 52 cards
    *need to be shuffled
    
    *numDecks = the number of individual decks in this deck
    *shuffle = whether to shuffle the cards
    */
    public Deck(int numDecks, boolean shuffle) {

        this.numCards = numDecks * 52;
        this.myCards = new Card[this.numCards];

        // init card index
        int c = 0;

        //for each deck
        for (int d = 0; d < numDecks; d++) {

            //for each suit
            for (int s = 0; s < 4; s++) {

                //for each number
                for (int n = 1; n <= 13; n++) {

                    //add a new card to the deck
                    this.myCards[c] = new Card(Suit.values()[s], n);
                    c++;
                }
            }
        }

        //shuffle if necessary
        if (shuffle) {
            this.shuffle();
        }

    }

    public void shuffle() {}

}