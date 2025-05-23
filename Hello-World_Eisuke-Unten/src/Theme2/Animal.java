package Theme2;

public class Animal {

	// フィールド（メンバ変数）
	// フィールド はデータを保持する変数
	private String name;
	private double length;
	private int speed;

	// セッター　　戻り値を返さない
	// setter は値を設定するメソッド
	// this はフィールドと引数を区別するために使用
	public void setName(String name) {
		this.name = name;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	// ゲッター  戻り値を返す
	// getter は値を取り出すメソッド
	public String getName() {
		return this.name;
	}

	public double getLength() {
		return this.length;
	}

	public int getSpeed() {
		return this.speed;
	}
}

// 	下記がコンソールに出力されるように作成してください
// 	※thisとsetterとgetterとフィールドを使ってください
// 	
//  動物名：ライオン
//	体長：2.1m
//	速度：80km/h