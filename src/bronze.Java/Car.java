package bronze.Java;

class Car {
	public static int Price = 0;
	public String Company;
	public String Name;
	public String Color;
	public int tire;
	public int age;
	public double height, weight;

	Car(String Company, String Name, String Color, int age, double height, double weight) {
		Car.Price++;
		this.Company = Company;
		this.Name = Name;
		this.Color = Color;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	Car(String Company, String Name, String Color, int tire, int age, double height, double weight) {
		Car.Price++;
		this.Company = Company;
		this.Name = Name;
		this.Color = Color;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.tire = tire;
	}
	public String Company() {
		return this.Company + " " + this.Name;
	}
	public double TotalAmount() {
		return this.weight * height;
	}
	public void printDate() {
		System.out.println(" ");
		System.out.println("車は" + this.Company() + "です。");
		System.out.println("製造から" + this.age + "年、経過しています。");
		System.out.println("タイヤは" + this.tire + "本あります。");
		System.out.println("車両の重さは" + Math.round(this.TotalAmount()) + "tです。");
	}
	public static void printCount() {
		System.out.println("値段は" + Car.Price + "台です。");
	}

}
