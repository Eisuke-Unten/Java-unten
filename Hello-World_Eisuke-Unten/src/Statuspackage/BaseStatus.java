package Statuspackage;

    // スーパークラス
public class BaseStatus {
	// フィールドを定義
	protected int hp; // HP（体力）
	protected int mp; // MP（魔力）
	protected int attack; // 攻撃力
	protected int speed; // 素早さ
	protected int defense; // 防御力

	// protectedは↓
	// 同じクラス からアクセスできる
	// サブクラス（継承先） からアクセスできる
	// 同じパッケージ内の他のクラス からもアクセスできる

	public BaseStatus() {
	// Math.random() は 0.0 以上 1.0 未満のランダムな小数を返す
		this.hp = (int) (Math.random() * 1000);
		this.mp = (int) (Math.random() * 1000);
		this.attack = (int) (Math.random() * 1000);
		this.speed = (int) (Math.random() * 1000);
		this.defense = (int) (Math.random() * 1000);
	}

	public int getHp() {
		return hp;
	}

	public int getMp() {
		return mp;
	}

	public int getAttack() {
		return attack;
	}

	public int getSpeed() {
		return speed;
	}

	public int getDefense() {
		return defense;
	}
	
}

/*

名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

*/