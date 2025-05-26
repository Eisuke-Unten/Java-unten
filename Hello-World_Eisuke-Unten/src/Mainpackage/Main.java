package Mainpackage;

import java.util.Scanner;

import Statuspackage.CharacterStatus;

public class Main {
	public static void main(String[] args) {
		// ユーザーからの入力を受け取るための準備((System.inはキーボード入力（標準入力))
		Scanner sc = new Scanner(System.in); 

		System.out.print("あなたの名前を入力してください：");
		// ユーザーが入力した1行分の文字列を読み取る
		String name = sc.nextLine(); 

		CharacterStatus status = new CharacterStatus(name);

		System.out.println("\nこんにちは「" + status.getName() + "」さん");
		System.out.println("ステータス");
		System.out.println("HP：" + status.getHp());
		System.out.println("MP：" + status.getMp());
		System.out.println("攻撃力：" + status.getAttack());
		System.out.println("素早さ：" + status.getSpeed());
		System.out.println("防御力：" + status.getDefense());

		System.out.println("\nさあ冒険に出かけよう！");
		sc.close();
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