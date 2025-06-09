package self_introduction1_31;

public class Person1_31 {

	public String name;
	public int age;
	public double height;
	public double weight;
	 // Java1_31 問題1
	public static int count = 0;

	// コンストラクタ（引数付き）
	Person1_31(String name, int age, double height, double weight) {

		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	// Java1_31 問題2	
		Person1_31.count++;
	}

	// bmi を計算して返すメソッド
	public double bmi() {
		return weight / (height * height);
	}

	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.println("BMIは" + Math.floor(this.bmi()) + "です");
	// Java1_30 問題10
		System.out.println("合計" + count + "人です");
	}

	// Java1_31 問題4 問題5
	public static void printCount() {
		System.out.println("合計" + count + "人です");
	}
}
