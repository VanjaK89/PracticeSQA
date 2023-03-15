package DemoTestPackage;

public class FaultOne {

    public static int numZero(int[] x) {
        int count = 0;
        if (x.length == 0)
            return 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 0) {
                count++;
            }
        }
        return count;
    }
}
