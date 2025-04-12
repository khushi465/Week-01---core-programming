
import java.util.*;

public class P10 {

    public String[] createArray() {
        String suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String ranks[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        String deck[] = new String[numOfCards];
        int index = 0;
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                deck[index] = ranks[j] + " of " + suits[i];
                index++;
            }
        }
        return deck;
    }

    public String[] shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = (int) (Math.random() * (deck.length) - i) + i;
            String temp = "";
            temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    public String[][] distribute(String[] deck, int x, int n) {
        if (n % x == 0) {
            int r = 0;
            String[][] game = new String[x][n / x];
            for (int i = 0; i < x; i++) {
                int k = 0;
                for (int j = r; j < r + n / x; j++) {
                    game[i][k] = deck[j];
                    k++;
                }
                r += n / x;
            }
            return game;
        } else {
            return null;
        }
    }

    public void display(int x, int n) {
        String deck[] = createArray();
        String newDeck[] = shuffleDeck(deck);
        String game[][] = distribute(newDeck, x, n);
        for (int i = 0; i < game.length; i++) {
            System.out.println("Player " + (i + 1));
            for (int j = 0; j < game[0].length; j++) {
                System.out.println(game[i][j]);

            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of people");
        int x = sc.nextInt();
        System.out.println("Enter number of cards to  be distributed");
        int n = sc.nextInt();
        P10 obj = new P10();
        obj.display(x, n);

    }
}
