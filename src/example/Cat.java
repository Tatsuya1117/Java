package example;

public class Cat {
	String name;
	int age;
	boolean hungry;

	private void printMessage(String message) {
		System.out.println(name + "> " + message);
	}

	public void eat() {
		// System.out.println(name + " > ご飯を食べるよ!おいしいにゃ-");
		// System.out.println(name + "> お腹がいっぱいになったにゃー");
		printMessage("ご飯を食べるよ！おいしいにゃー");
		printMessage("お腹がいっぱいになったにゃー");
		hungry = false;
	}

	public boolean isHungry() {
		return hungry;
	}
	
	public void playToy(String toy) {
		// System.out.println(name + "> " + toy + "で遊ぶよ。楽しいにゃー");
		// System.out.println(name + "> 遊んでお腹が減ったにゃー");
		printMessage(toy + "で遊ぶよ。楽しいにゃー");
		printMessage("遊んでお腹が減ったにゃー");
		hungry = true;
	}
	
	public void setName(String catName) {
		name = catName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int catAge) {
		age = catAge;
	}
	
	public int getAge() {
		return age;
	}
	
	public void introduceMyself() {
		// String n = getName();
		// int a = getAge();
		// System.out.println("名前は" + n + "です、" + a + "歳です。");
		printMessage("名前は" + getName() + "です、" + getAge() + "歳です。" );
	}
}
