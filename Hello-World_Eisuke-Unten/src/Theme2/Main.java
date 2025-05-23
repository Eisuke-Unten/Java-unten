package Theme2;

public class Main {

	public static void main(String[] args) {
		// Animalクラスのインスタンスを生成
		Animal lion = new Animal();

		// setterでデータを設定
		lion.setName("ライオン");
		lion.setLength(2.1);
		lion.setSpeed(80);

		// getterでデータを取得し、コンソールに出力
		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getLength() + "m");
		System.out.println("速度：" + lion.getSpeed() + "km/h");

	}

}

//	下記がコンソールに出力されるように作成してください
//	※thisとsetterとgetterとフィールドを使ってください
//	
//動物名：ライオン
//体長：2.1m
//速度：80km/h