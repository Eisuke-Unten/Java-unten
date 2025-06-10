package self_introduction;

public class Person {
	public String firstName;
	public String lastName;

	// コンストラクタ（引数付き）
	public Person(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}

	/*
	 * フルネームを返すメソッド
	 * @return 苗字　名前
	 */
	public String getFullName() {
		return firstName + " " + lastName;
	}

	/*
	 *問題6 Personクラスにインスタンスメソッド「buy」を定義
	 *メソッド名：buy
	 *所属クラス：Person
	 *仮引数：car（実際にはVehicle型やそのサブクラスで受ける）
	 *処理内容：carの所有者にこのPersonインスタンスのフルネームをセット
	 *this.getFullName() → 「このPersonのフルネーム」
	 *setOwner(...) → Vehicleクラスの所有者にその値をセット
	 */
	public void buy(Car car) {
		car.setOwner(this.getFullName());
		// 問題8 「〇〇が購入しました」と出力する処理を追加
		System.out.println(this.getFullName() + "が購入しました");
	}

	// 問題9 引数の型が異なるbuyメソッドを定義 （仮引数：bicycle）
	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.getFullName());
		System.out.println(bicycle.getOwner() + "が購入しました");
	}

}
