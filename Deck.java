
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

    public void shuffle() {

        //init random number generator
        Random rng = new Random();

        //temporary card
        Card temp;

        int j;
        for (int i = 0; i < this.numCards; i++) {

            //get a random card t oswap i's value with
            j = rng.nextInt(this.numCards);

            //do swap
            temp = this.myCards[i];
            this.myCards[i] = this.myCards[j];
            this.myCards[j] = temps;
            
        }
    }

    public Card dealNextCard() {

        Card top = this.myCards[0];

        for (int c = 1; c < this.numCards; c++) {
            this.myCards[c-1] = this.myCards[c];
        }
        this.myCards[this.numCards-1] = null;

        this.numCards--;

        return top;
    }

    public void printDeck(int numToPrint) {

        for (int c = 0; c < numToPrint; c++) {
            System.out.printf("% d/%d %s\n", c+1, this.numCards,
            this.myCards, this.myCards[c].toString());
        }
        System.out.printf("\t[%d other]\n", this.numCards-numToPrint);
    }

}