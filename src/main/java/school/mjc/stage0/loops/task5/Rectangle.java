package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
        for (int row = 0; row < height; row++) {
            for (int col = 0; col<length; col++) {
                if (row == 0 || row == height - 1 || col == 0 || col == length - 1) {
                    System.out.print('8');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }
}
