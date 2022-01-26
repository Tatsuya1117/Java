package bronze.Java;

// Aを継承したBの挙動の確認
class A {
	public void test() {
		System.out.println("A");
	}
}

class B extends A {
	public void test() {
		System.out.println("B");
	}
}

class C extends B {
	public void test() {
		System.out.println("C");
	}
}


public class ABtest_00 {

	public static void main(String[] args) {
		A a = new B();
		a.test();
		B b = new C();
		b.test();
	}

}
class Main {
	public static void main(String[] args) {
	  Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
	  person1.printData();
	  
	  Person person2 = new Person("John", "Smith", 65, 1.75, 80.0);
	  person2.printData();
	  
	  // printCountメソッドを呼び出してください
	  Person.printCount();
	  
	}
  }
  