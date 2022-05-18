package example;

public class UseCatSample2 {

	public static void main(String[] args) {
		Cat tama = new Cat();
		Cat mike = new Cat();
		
		tama.setName("タマ");
		tama.setAge(3);
		mike.setName("みけ");
		mike.setAge(4);
		tama.introduceMyself();
		mike.introduceMyself();
	}

}
