public class Table {
    private final int[] positions = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public Table() {
    }

    public int getPosition(int i) {
        return positions[i];
    }

    public void setPosition(int i) {
        positions[i] = 1000;
    }

    public void printTable() {

        for (int k = 1; k <= 9; k+=3) {
            System.out.println("---------");
            for (int i = k - 1; i < k + 2; i++) {
                System.out.print(" " + positions[i] + " ");
            }
            System.out.println();
        }
        System.out.println("---------");
    }

}

