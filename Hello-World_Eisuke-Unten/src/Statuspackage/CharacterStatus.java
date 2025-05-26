package Statuspackage;

    //サブクラス

public class CharacterStatus extends BaseStatus {
	private String name;

	public CharacterStatus(String name) {
	// スーパークラスのステータス初期化
		super(); 
		this.name = name;
	}

	// getName() 他のクラスから name の中身を見たいときに使う
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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