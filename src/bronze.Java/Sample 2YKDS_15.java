package bronze.Java;

public class Sample2_15 {

	public static void main(String[] args) {
		int a = 3;
		for(int i = 0; i < 3; i++) {
			int total = 0;
			total += a;
			System.out.println(total); // ここに持ってくるのが正解
		}
		// System.out.println(total); ここだとコンパイルエラー
	}

}
