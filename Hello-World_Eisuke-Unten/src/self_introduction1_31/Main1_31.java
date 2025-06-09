package self_introduction1_31;

public class Main1_31 {

	public static void main(String[] args) {
		Person1_31 person1 = new Person1_31("鈴木太郎", 20, 1.7, 60);
		
		// Java1_30 問題10
		person1.print();
		// Java1_31 問題3
		System.out.println("\n合計" + Person1_31.count + "人です");
		// Java1_31 問題6
		Person1_31.printCount();
	}

}
