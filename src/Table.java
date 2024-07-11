public class Table {
    private final String[] positions = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public Table() {
    }

    public int getPosition(int i) {
        return Integer.parseInt(positions[i]);
    }

    public void setPosition(int i, String player) {
        positions[i] = player;
    }

    public void printTable() {
        int[] positions = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int k = 1; k <= 9; k+=3) {
            System.out.println("---------");
            for (int i = k - 1; i < k + 2; i++) {
                System.out.print(" " + positions[i] + " ");
            }
            System.out.println();
        }
        System.out.println("---------");
    }

    public void printNewTable() {
        for (int k = 1; k <= 9; k+=3) {
            System.out.println("---------");
            for (int i = k - 1; i < k + 2; i++) {
                System.out.print(" " + positions[i] + " ");
            }
            System.out.println();
        }
        System.out.println("---------");
    }

    public boolean verifyGame() {

       if (positions[0].equals(positions[4]) && positions[4].equals(positions[8])) {
           return true;
       }
        if (positions[3].equals(positions[4]) && positions[4].equals(positions[5])) {
            return true;
        }
        if (positions[6].equals(positions[4]) && positions[4].equals(positions[2])) {
            return true;
        }
        if (positions[0].equals(positions[1]) && positions[1].equals(positions[2])) {
            return true;
        }
        if (positions[6].equals(positions[7]) && positions[7].equals(positions[8])) {
            return true;
        }
        if (positions[0].equals(positions[3]) && positions[3].equals(positions[6])) {
            return true;
        }
        if (positions[1].equals(positions[4]) && positions[4].equals(positions[7])) {
            return true;
        }
        if (positions[2].equals(positions[5]) && positions[5].equals(positions[8])) {
            return true;
        }
        return false;
    }
}

