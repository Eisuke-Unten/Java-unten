package self_introduction;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("鈴木", "太郎");
		Person person2 = new Person("山田", "花子");

		// 問題4 CarとBicycleのインスタンスを作成
		Car car = new Car();
		Bicycle bicycle = new Bicycle();

		// 所有者をセット（Personからフルネームを取得）
		car.setOwner(person1.getFullName());
		bicycle.setOwner(person2.getFullName());

		// 問題5 確認出力
		System.out.println("車の所有者: " + car.getOwner());
		System.out.println("自転車の所有者: " + bicycle.getOwner());

		// 問題10
		person1.buy(car);
		person2.buy(bicycle);

	}

}
