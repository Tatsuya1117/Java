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
