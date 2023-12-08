package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int center = sideLength / 2 + sideLength % 2;
        for (int row = 1; row <= sideLength; row++) {
            for (int col = 1; col<=sideLength; col++) {
                if (row == center || col == center) {
                    System.out.print('8');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
