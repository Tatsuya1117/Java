package example;

public class Cat {
	String name;
	boolean hungry;

	void eat() {
		System.out.println(name + " > ご飯を食べるよ!おいしいにゃ-");
	}

	boolean isHungry() {
		return true;
	}
	
	void playToy(String toy) {
		System.out.println(name + "> " + toy + "で遊ぶよ。楽しいにゃー");
	}
}
