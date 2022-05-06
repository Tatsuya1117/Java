package example2;

import example.Cat;

public class PublicAccessSample {

	public static void main(String[] args) {
		Cat tama = new Cat();
		tama.setName("タマ");
		
		// System.out.println(tama.getName());
		// tama.setAge(3);
		// System.out.println(tama.getAge());
		
		tama.setAge(3);
		tama.playToy("ボール");
		tama.introduceMyself();
	}

}
