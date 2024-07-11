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

            if (table.verifyGame()) {
                if (count % 2 == 0) {
                    System.out.print("0 is the winner!");
                } else {
                    System.out.print("X is the winner!");
                }
                break;
            }
            if (count % 2 == 0) {
                System.out.print("X: ");
            } else {
                System.out.print("0: ");
            }

            int s = scanner.nextInt();
            switch (s) {
                case 1:
                    if (count % 2 == 0 && table.getPosition(s - 1) == s) {
                        table.setPosition(s - 1, "X");
                        table.printNewTable();
                    }
                    if (count % 2 != 0 && table.getPosition(s - 1) == s) {
                        table.setPosition(s - 1, "0");
                        table.printNewTable();
                    }
                    break;
                case 2:
                    if (count % 2 == 0 && table.getPosition(s - 1) == s) {
                        table.setPosition(s - 1, "X");
                        table.printNewTable();
                    }
                    if (count % 2 != 0 && table.getPosition(s - 1) == s) {
                        table.setPosition(s - 1, "0");
                        table.printNewTable();
                    }
                    break;
                case 3:
                    if (count % 2 == 0 && table.getPosition(s - 1) == s) {
                        table.setPosition(s - 1, "X");
                        table.printNewTable();
                    }
                    if (count % 2 != 0 && table.getPosition(s - 1) == s) {
                        table.setPosition(s - 1, "0");
                        table.printNewTable();
                    }
                    break;
                case 4:
                    if (count % 2 == 0 && table.getPosition(s - 1) == s) {
                        table.setPosition(s - 1, "X");
                        table.printNewTable();
                    }
                    if (count % 2 != 0 && table.getPosition(s - 1) == s) {
                        table.setPosition(s - 1, "0");
                        table.printNewTable();
                    }
                    break;
                case 5:
                    if (count % 2 == 0 && table.getPosition(s - 1) == s) {
                        table.setPosition(s - 1, "X");
                        table.printNewTable();
                    }
                    if (count % 2 != 0 && table.getPosition(s - 1) == s) {
                        table.setPosition(s - 1, "0");
                        table.printNewTable();
                    }
                    break;
                case 6:
                    if (count % 2 == 0 && table.getPosition(s - 1) == s) {
                        table.setPosition(s - 1, "X");
                        table.printNewTable();
                    }
                    if (count % 2 != 0 && table.getPosition(s - 1) == s) {
                        table.setPosition(s - 1, "0");
                        table.printNewTable();
                    }
                    break;
                case 7:
                    if (count % 2 == 0 && table.getPosition(s - 1) == s) {
                        table.setPosition(s - 1, "X");
                        table.printNewTable();
                    }
                    if (count % 2 != 0 && table.getPosition(s - 1) == s) {
                        table.setPosition(s - 1, "0");
                        table.printNewTable();
                    }
                    break;
                case 8:
                    if (count % 2 == 0 && table.getPosition(s - 1) == s) {
                        table.setPosition(s - 1, "X");
                        table.printNewTable();
                    }
                    if (count % 2 != 0 && table.getPosition(s - 1) == s) {
                        table.setPosition(s - 1, "0");
                        table.printNewTable();
                    }
                    break;
                case 9:
                    if (count % 2 == 0 && table.getPosition(s - 1) == s) {
                        table.setPosition(s - 1, "X");
                        table.printNewTable();
                    }
                    if (count % 2 != 0 && table.getPosition(s - 1) == s) {
                        table.setPosition(s - 1, "0");
                        table.printNewTable();
                    }
                    break;
            }
            count++;
            if (count == 9) {
                System.out.println("Draw!");
                break;
            }
        }

    }

}
