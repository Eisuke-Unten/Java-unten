package basicClass;

//日付＋時間のデータ型を使うため
import java.time.LocalDateTime;
//日付や時間をフォーマット（整形）するため
import java.time.format.DateTimeFormatter;

public class Animal {

	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		//Q3 のコンストラクタ
		//Dog dog1 = new Dog(); → 名前だけを持つ Dog オブジェクトを作成（名前は「犬」）。
		Dog dog1 = new Dog();
		System.out.println("動物の名前：" + dog1.name);

		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		// Q4 のコンストラクタ
		//Dog dog2 = new Dog(5); → 名前「犬」、数「5」の Dog オブジェクトを作成。
		Dog dog2 = new Dog(5);
		System.out.println("動物の数：" + dog2.count);

		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください

		//LocalDateTime.now() → 現在の日時を取得。
		LocalDateTime now = LocalDateTime.now();

		//DateTimeFormatter.ofPattern(...) → 日時の表示形式を指定。
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String formattedDateTime = now.format(formatter);
		System.out.println("現在の日時：" + formattedDateTime);

	}

}
