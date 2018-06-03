package lab4;

public class ExportArray {

    public ExportArray(){

    }

    public void print(int from, int to) {
        IntRandom intRandom = new IntRandom();
        int[][] array = this.TwoDArray(10);

        for(int i = 0; i < array.length; ++i) {
            for(int j = 0; j < array[i].length; ++j) {
                array[i][j] = intRandom.Random(from, to);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

    }

    public int[][] TwoDArray(int line) {
        int[][] array = new int[2][line];
        return array;
    }
}