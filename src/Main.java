import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Tic-Tac-Toe");

        Table table = new Table();
        table.printTable();

        int count = 0;

        while (true) {
            if (count % 2 == 0) {
                System.out.print("X: ");
            } else {
                System.out.print("0: ");
            }

            count++;
            int s = scanner.nextInt();
            switch (s) {
                case 1:
                    if (count % 2 == 0 && table.getPosition(s - 1) == s) {
                        table.setPosition(s);
                        table.printTable();
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
            }
        }

    }

}
