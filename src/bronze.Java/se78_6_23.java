package bronze.Java;

public class se78_6_23 {
    public static void main(String[] args) {
        int n = ClassA.getNumber();
        System.out.println(n);
    }
}

class ClassA {
    public static int number = 0;
    public static int getNumber() {
        return number;
    }
}