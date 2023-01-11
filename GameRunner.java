
import java.util.Scanner

public class GameRunner {

    public static void main(String[] args) {

        //iniatialize
        Scanner sc = new Scanner (System.in);
        Deck theDeck = new Deck(1, true);

        //init hte player objects
        Player me = new Player("Thibault");
        Player dealer = new Player("Dealer");

        //Deal the first two cards
        me.addCard(theDeck.dealNextCard());
        dealer.addCard(theDeck.dealNextCard());
        me.addCard(theDeck.dealNextCard());
        dealer.addCard(theDeck.dealNextCard());

        //print initial hands
        System.out.println("Cards are dealt\n");
        me.printHand(true);
        dealer.printHand(false);
        System.out.println("\n");

        // flags fro when each player is finished hitting
        boolean meDone = false;
        boolean dealerDone = false;
        String ans;

        while (!meDone || !dealerDone) {

            
        }
        
    }
}