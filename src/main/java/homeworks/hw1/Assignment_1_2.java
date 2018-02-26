package homeworks.hw1;

public class Assignment_1_2 {
    public static void result (int number){
        while (number !=0) {
            System.out.println(number%10);
            number /= 10;
        }
    }
    public static void main(String[] args) {
        result(98765);
    }
}
