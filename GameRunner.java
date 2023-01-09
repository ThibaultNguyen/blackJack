
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
        
    }
}