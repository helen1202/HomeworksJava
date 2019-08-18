package homeworks.hw1;

public class Assignment_1_1 {

    //
    public static void expressionLong(long x, long y, long z, long n) {
        long longResult = x + (y - 100) * z / n;
        System.out.printf("Long expression:%nx+(y - 100)*z/n = %d%n", longResult);
    }
    
    public static void expressionInt(int x, int y, int z, int n) {
        int intResult = (x - (50 + y * z) * n) + x;
        System.out.printf("Int expression:%n(x-(50+y *z)*n)+x = %d%n", intResult);
    }

    public static void expressionFloat(float x, float y, float z, float n) {
        float floatResult = x * (y / (z - 1) + 555) - n;
        System.out.printf("Float expression:%nx*(y/(z-1)+555)-n = %f%n", floatResult);

    }

    public static void expressionDouble(double x, double y, double z, double n) {
        double doubleResult = -x / y + z * (n + 1);
        System.out.printf("Double expression:%n-x/y+z*(n+1) = %f%n", doubleResult);
    }

    public static void main(String[] args) {
        expressionLong(1034624562L, 126260, 10L, 10);
        expressionInt(1002566, 52625465, 245640, 32562);
        expressionFloat(999.6f, 56.809f, 48.54f, 22.1f);
        expressionDouble(1000.65452221d, 36.99d, 6777.00001d, 2.809d);
    }
}
