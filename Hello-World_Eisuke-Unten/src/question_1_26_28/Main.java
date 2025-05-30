package question_1_26_28;

import java.util.Scanner;

public class Main {

	//動物の情報を表す設計図
	static class Animal {
		//動物の名前・体長・速度・学名の情報を持つデータの入れ物（オブジェクト）
		String name;
		double length;
		int speed;
		String scientificName;

		//コンストラクタ  オブジェクトが作られるときに値をセット
		Animal(String name, double length, int speed) {
			this.name = name;
			this.length = length;
			this.speed = speed;
			this.scientificName = getScientificName(name);
		}

		// 学名を返すメソッド
		private String getScientificName(String name) {
			switch (name) {
			case "ライオン":
				return "パンテラ レオ";
			case "ゾウ":
				return "ロキソドンタ・サイクロティス";
			case "パンダ":
				return "アイルロポダ・メラノレウカ";
			case "チンパンジー":
				return "パン・トゥログロディテス";
			case "シマウマ":
				return "チャップマンシマウマ";
			case "インコ":
				return "不明";
			default:
				return "不明";
			}
		}

		// 表示メソッド
		void printInfo() {
			System.out.println("動物名：" + name);
			System.out.println("体長：" + length + "m");
			System.out.println("速度：" + speed + "km/h");
			System.out.println("学名：" + scientificName);
			System.out.println(); // 改行
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("コンソールに文字を入力してください");
		String input = scanner.nextLine(); // 例: ライオン:2.1:80,ゾウ:3.2:40, ...

		//（カンマ）で区切って、各動物のデータをバラバラに分けて配列にする
		String[] animalDataList = input.split(",");

		for (String data : animalDataList) {
			String[] parts = data.split(":");
			//文字列のまま
			String name = parts[0];
			//文字列→小数に変換
			double length = Double.parseDouble(parts[1]);
			//文字列→整数に変換
			int speed = Integer.parseInt(parts[2]);

			Animal animal = new Animal(name, length, speed);
			animal.printInfo();
		}
		scanner.close();
	}

}

/*

	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
	ライオン:2.1:80,
	ゾウ:3.2:40,
	パンダ:1.9:30,
	チンパンジー:0.94:25,
	シマウマ:2.4:65,
	インコ:0.1:50
	
	コンソール出力結果
	
	コンソールに文字を入力してください
	動物名：ライオン
体長：2.1m
速度：80km/h
学名：パンテラ レオ

動物名：ゾウ
体長：3.2m
速度：40km/h
学名：ロキソドンタ・サイクロティス

動物名：パンダ
体長：1.9m
速度：30km/h
学名：アイルロポダ・メラノレウカ

動物名：チンパンジー
体長：0.94m
速度：25km/h
学名：パン・トゥログロディテス

動物名：シマウマ
体長：2.4m
速度：65km/h
学名：チャップマンシマウマ

動物名：インコ
体長：0.1m
速度：50km/h
学名：不明


*/
