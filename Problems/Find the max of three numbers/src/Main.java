    public static int getNumberOfMaxParam(int a, int b, int c) {
        if (a >= b && a >= c) {
            return 1;
        } else if (a < b && b >= c) {
            return 2;
        } else {
            return 3;
        }
    }
