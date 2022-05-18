package example;

public class Cat {
	private String name;
	private int age;
	private boolean hungry;
	private int boring;
	// private int sleepiness; まだ

	private void printMessage(String message) {
		System.out.println(name + "> " + message);
	}
	// 引数なしバージョン
	public void eat() {
		printMessage("ご飯を食べるよ！おいしいにゃー");
		printMessage("お腹がいっぱいになったにゃー");
		hungry = false;
	}
	// ちょっと拡張した引数が入ったバージョン
	public void eat(String food) {
		printMessage(food + "を食べるよ！おいしいにゃー");
		printMessage("お腹がいっぱいになったにゃー");
		hungry = false;
	}

	public boolean isHungry() {
		return hungry;
	}
	
	// 引数なしバージョン
	public void playToy() {
		printMessage("おもちゃで遊ぶよ。楽しいにゃー");
		printMessage("遊んでお腹が減ったにゃー");
		hungry = true;
	}
	// ちょっと拡張した引数が入ったバージョン
	public void playToy(String toy) {
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

	// 「退屈ゲージ」を実装。気分に応じて数値とメッセージが変わる。
	public void boring() {
		int b = boring; 
		for(b = 0; b < 10; b++) {
			if(boring == 0) {
				printMessage("気分は、" + boring + "です。" + "退屈の極みです。");
			} else if(boring == 1) {
				printMessage("気分は、" + boring + "です。" + "退屈の極みの1歩手前です。");
			} else {
				printMessage("遊んで欲しいのにゃー!");
			}
		}
	}
}
