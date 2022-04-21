package example;

public class Cat {
	String name;
	int age;
	boolean hungry;

	void eat() {
		System.out.println(name + " > ご飯を食べるよ!おいしいにゃ-");
		System.out.println(name + "> お腹がいっぱいになったにゃー");
		hungry = false;
	}

	boolean isHungry() {
		return hungry;
	}
	
	void playToy(String toy) {
		System.out.println(name + "> " + toy + "で遊ぶよ。楽しいにゃー");
		System.out.println(name + "> 遊んでお腹が減ったにゃー");
		hungry = true;
	}
	
	void setName(String catName) {
		name = catName;
	}
	
	String getName() {
		return name;
	}
	
	void setAge(int catAge) {
		age = catAge;
	}
	
	int getAge() {
		return age;
	}
	
	void introduceMyself() {
		String n = getName();
		int a = getAge();
		System.out.println("名前は" + n + "です、" + a + "歳です。");
	}
}
