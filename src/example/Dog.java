public class Dog {
	private String name;
	private int age;
	private boolean hungry;
	
	public void eat() {
		System.out.println("ご飯を食べるよ！おいしいわん");
		System.out.println("お腹がいっぱいになったわん");
		hungry = false;
	} 
	
	public void eat(String food) {
		System.out.println(food + "を食べるよ！おいしいわん");
		System.out.println(food + "を食べてお腹がいっぱいになったわん");
		hungry = false;
	}
	
	public boolean isHungry() {
		return hungry;
	}
	
	// 引数なしバージョン
		public void playToy() {
			System.out.println("おもちゃで遊ぶよ。楽しいわん");
			System.out.println("遊んでお腹が減ったわん");
			hungry = true;
		}
		// ちょっと拡張した引数が入ったバージョン
		public void playToy(String toy) {
			System.out.println(toy + "で遊ぶよ。楽しいわん");
			System.out.println("遊んでお腹が減ったわん");
			hungry = true;
		}
	
		public void setName(String dogName) {
			name = dogName;
		}
		
		public String getName() {
			return name;
		}
		
		public void setAge(int dogAge) {
			age = dogAge;
		}
		
		public int getAge() {
			return age;
		}
		
		public void introduceMyself() {
			System.out.println("名前は" + getName() + "です、" + getAge() + "歳です。" );
		}
	
}