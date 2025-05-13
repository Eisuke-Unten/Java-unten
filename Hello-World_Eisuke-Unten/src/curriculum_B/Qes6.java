package curriculum_B;

import java.util.Random; //←ランダムな台数などを出力したいときに必要な準備

public class Qes6 {

	public static void main(String[] args) {
		String input = "パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイ、その他商品";
		String[] items = input.split("、");//split("、") は、文字列を全角の「、」で分割するメソッド
		//items[0] = "パソコン"
		//items[1] = "冷蔵庫"
		//items[2] = "扇風機"
		//items[3] = "洗濯機"
		//items[4] = "加湿器"
		//items[5] = "テレビ"
		//items[6] = "ディスプレイ"
		//items[7] = "その他商品"
		Random rand = new Random();

		// String item → items 配列から取り出した要素（1つの文字列）を item という変数に代入。
		// items→ items は、先ほど split("、") で作られた商品名の配列。

		for (String item : items) {
			switch (item) {
			case "テレビ":
			case "ディスプレイ":
				//case "テレビ": と case "ディスプレイ": を続けて書く意味↓
				//「テレビとディスプレイは同じ処理を行う」から。

				int stock = rand.nextInt(12);
				// 0〜11のランダムな数字。　　stockは在庫数

				String label = item.equals("ディスプレイ") ? "ディスプレイ" : "テレビ";
				//条件演算子（? :）を使って、item が "ディスプレイ" なら "ディスプレイ" を、
				//それ以外（＝ "テレビ"）なら "テレビ" をlabel に代入。

				int displayStock = item.equals("ディスプレイ") ? (11 - stock) : stock;
				//「ディスプレイなら在庫数を 11 - stock にする」という条件処理。
				//それ以外（テレビ）なら stock の値をそのまま使う。
				//ディスプレイ → 最大11個からランダムな値を引いた数が在庫数
				//テレビ → ランダムな在庫数

				System.out.println(label + "の残り台数は" + displayStock + "台です");

				//label → "テレビ" または "ディスプレイ" の文字列が入ってる。
				//displayStock → 在庫数（ランダムに決まる0〜11などの数字）

				break;
			//break →「テレビ」または「ディスプレイ」の処理が終わったら、それ以降の case に行かずに switch 文全体を抜ける。

			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				int normalStock = rand.nextInt(12);
				//int normalStock = ランダム値（在庫数）を入れる。
				//rand.nextInt(12) ＝ 0〜11 のどれかのランダムな整数を返す。

				System.out.println(item + "の残り台数は" + normalStock + "台です");
				break;

			default:
				//どの case にも当てはまらなかった（＝未定義の商品）のときに実行される。
				System.out.println("『 " + item + " 』は指定の商品ではありません");
				break;
			}
		}

	}

}
