package logic;

//処理クラス
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message {
	private String greeting;
	private String comment;
	private String culture;
	private String dateTime;

	public Message() {
		// コンストラクタでフィールドに値を代入
		// this を使って フィールドに値を代入
		this.greeting = "こんにちは！ここは日本です！";
		this.comment = "この寿司はうまい";
		this.culture = "寿司は和食です";

		// 現在日時を取得して整形
		//現在日時は LocalDateTime.now() を使う
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		this.dateTime = "今の現在日時は" + now.format(formatter) + "です";
	}

	public void printMessages() {
		System.out.println(this.greeting);
		System.out.println(this.comment);
		System.out.println(this.culture);
		System.out.println(this.dateTime);
	}

}
/*

下記がコンソールに出力されるように作成してください

	こんにちは！ここは日本です！
	この寿司はうまい
	寿司は和食です
	今の現在日時は2023/03/09 10:23:39です

【条件】
	・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
	・適切なファイルにフィールドで変数を必要な数作ってください。
	・thisを使って作成してください。
	・日時は今日の日付を取得してください。
	
*/
