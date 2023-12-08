package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int row = 0; row < cathetusLength; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print('8');
            }
            System.out.println();
        }
    }
}
