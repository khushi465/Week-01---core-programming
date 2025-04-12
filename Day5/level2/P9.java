
import java.util.*;

public class P9 {

    public int computerChoice() {
        int choice = (int) (Math.random() * 3);
        // 0 is rock, 1 paper, 2 scissors
        return choice;
    }

    public int findWinner(int user, int computer) {

        int winner;
        // if(user!=computer){
        //     if(user==0){
        //         if(computer==1)
        //         winner = "computer";
        //         else
        //         winner="user";
        //     }
        //     if(user==1){
        //         if(computer==2)
        //         winner = "computer";
        //         else
        //         winner="user";
        //     }
        //     else{
        //         if(computer==0)
        //         winner="computer";
        //         else
        //         winner="user";
        //     }
        // }
        if (user != computer) {
            if ((user + 1) % 3 == computer) {
                winner = 0;
            } else {
                winner = 1;
            }
        } else {
            winner = -1;
        }
        return winner;
    }

    public double[][] findAverage(int n, int[] user, int[] computer) {
        double[][] arr = new double[n][2];
        int computerCount = 0, userCount = 0;
        for (int i = 0; i < n; i++) {
            int winner = findWinner(user[i], computer[i]);
            if (winner == 0) {
                computerCount++;
            } else if (winner == 1) {
                userCount++;
            }
        }
        double computerAverage = (double) computerCount / n;
        double computerPercentage = computerAverage * 100;
        double userAverage = (double) userCount / n;
        double userPercentage = userAverage * 100;
        //0=average, 1=percentage
        double[][] avgAndPercent = {{computerAverage, computerPercentage}, {userAverage, userPercentage}};
        return avgAndPercent;
    }

    public void display(int n, int user[], int computer[]) {
        System.out.println("User\t\tComputer\t\tWinner");
        String a[] = {"Rock", "Paper", "Scissors"};

        for (int i = 0; i < n; i++) {
            int w = findWinner(user[i], computer[i]);
            String winner;
            if (w == 0) {
                winner = "Computer";
            } else if (w == 1) {
                winner = "User";
            } else {
                winner = "Draw";
            }
            System.out.println(a[user[i]] + "\t\t" + a[computer[i]] + "\t\t" + winner);
        }
        double[][] avgAndPercent = findAverage(n, user, computer);
        System.out.println("Computer Average: " + avgAndPercent[0][0]);
        System.out.println("Computer Percentage: " + avgAndPercent[0][1]);
        System.out.println("User Average: " + avgAndPercent[1][0]);
        System.out.println("User Percentage: " + avgAndPercent[1][1]);

    }

    public static void main(String[] args) {
        P9 obj = new P9();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of games");
        int n = sc.nextInt();
        System.out.println("Enter user choice in 'r', 'p' or 's'");
        char u[] = new char[n];
        int user[] = new int[n];
        int computer[] = new int[n];
        for (int i = 0; i < n; i++) {
            u[i] = sc.next().charAt(0);
            if (u[i] == 'r') {
                user[i] = 0;
            } else if (u[i] == 'p') {
                user[i] = 1;
            } else if (u[i] == 's') {
                user[i] = 2;
            } else {
                System.out.println("Invalid input");
                i--;
                continue;
            }
            computer[i] = obj.computerChoice();
        }
        obj.display(n, user, computer);
    }
}
