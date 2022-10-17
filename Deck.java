
//implementation of a deck of cards

import java.util.Random;

public class Deck {

    /*
     * Array of cards in the deck
     * top card is in the first index
     */
    private Card[] myCards;

    //number of cards currently in the deck
    private int numCards;

    /*
     * Constructor with a default of one deck
     * 52 cards and no shuffling
     */
    public Deck{

        // Call the other constructor,
        // Defining one deckwithout shuffling

        this(1, false);

    }

    /*
     * Constructor defining the deck
     * How many sets of 52 cards
     * Need to be shuffled
    
     * numDecks = the number of individual decks in this deck
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

                // for each number
                for (int n = 1; n <= 13; n++) {

                    // add a new card to the deck
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

        // init random number generator
        Random rng = new Random();

        // temporary card
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

    /*
    * Deal the next card from the top of the deck
    * @return the dealt card
    */

    public Card dealNextCard() {

        // get the top card
        Card top = this.myCards[0];
        
        // shift all the subsequent cards to the left by one index
        for (int c = 1; c < this.numCards; c++) {
            this.myCards[c-1] = this.myCards[c];
        }
        this.myCards[this.numCards-1] = null;

        // decrement the number of cards in our deck
        this.numCards--;

        return top;
    }

    /*
     * Print the top cards in the deck
     * @param numToPrint the number of cards from the top of the deck to print
     */

    public void printDeck(int numToPrint) {

        for (int c = 0; c < numToPrint; c++) {
            System.out.printf("% d/%d %s\n", c+1, this.numCards,
            this.myCards, this.myCards[c].toString());
        }
        System.out.printf("\t[%d other]\n", this.numCards-numToPrint);
    }

}