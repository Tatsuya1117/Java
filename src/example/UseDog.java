package default;

public class UseDog {

	public static void main(String[] args) {
		Dog mame = new Dog();
		mame.name = "まめ";
		mame.eat();
		mame.playToy("ボール");
		boolean h = mame.isHungry();
		if(h == true) {
			System.out.println("お腹がすいてるわん");
		} else {
			System.out.println("お腹はすいてないわん");
		}

	}

}
