package lab4;

import java.util.Random;

public class IntRandom {
    public IntRandom() {
    }

    public int Random(int from, int to) {
        Random random = new Random();
        int result = from + random.nextInt(to - from);
        return result;
    }
}
