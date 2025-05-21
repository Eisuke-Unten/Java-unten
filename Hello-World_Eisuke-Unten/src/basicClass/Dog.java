package basicClass;

public class Dog {

	// Q1：フィールドに動物の名前の変数を定義してください。
	//String name; = 動物の名前を保存する文字列型の変数。
	String name;

	// Q2：フィールドに動物の数の変数を定義してください。
	//int count; → 動物の数を保存する整数型の変数。
	int count;

	// Q3：Q1で作成した変数に「犬」を代入するコンストラクタを作成してください。

	// 引数なしのコンストラクタ。name に「犬」を代入。
	public Dog() {
		
	// this を付けるのは「明示的にフィールドに代入している」
		this.name = "犬";
	}

	// Q4：Q2で作成した変数に引数を代入するコンストラクタを作成してください。
	//引数ありのコンストラクタ。count に受け取った値を代入。
	public Dog(int count) {
		this.count = count;
	}
}
