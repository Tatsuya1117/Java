public class Piyota {
    String name;

    void setName(String name) {
        this.name = name;
    }
    String getName() {
        return this.name;
    }
}

public class test01 {
    public static void main(String[] args) {
        Piyota p = new Piyota();

        System.out.println(p.getName());

        System.out.println("Hello World");
    }
}