package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int row = 1; row <= height; row++) {
            for (int col = 1; col <= height; col++) {
                if ((col >= row && col <= height - row + 1) || (col <= row && col >= height - row + 1)) {
                    System.out.print('8');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
