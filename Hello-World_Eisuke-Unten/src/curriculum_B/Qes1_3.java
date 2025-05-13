package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
		//問1

		// Scannerを使ってユーザーからの入力を受け取る
		Scanner scanner = new Scanner(System.in);

		System.out.println("ユーザー名を入力してください:");

		// コンソールにユーザー名を入力
		String username = scanner.nextLine();

		// 入力がnullまたは空の場合のチェック
		if (username == null || username.trim().isEmpty()) {

			System.out.println("名前を入力してください");
		} // 入力されたユーザー名が10文字以上の場合のチェック
		else if (username.length() > 10) {
			System.out.println("名前を10文字以内にしてください");
			

			//問2	

			// 半角英数字以外が含まれている場合のチェック
		} else if (!username.matches("[a-zA-Z0-9]+")) {
			System.out.println("半角英数字のみで名前を入力してください");

		} // 正常な場合の処理
		else {
			System.out.println("ユーザー名「" + username + "」を登録しました");
		}
		
		//問3

		// じゃんけんの回数カウント
		// じゃんけんの初期値は0
		int gameCount = 0; //変数(int)をwhile文の中に入れてしまうとループが機能しない。

		// 勝つまでループ
		while (true) {
			//gameCount++;  ループに入った瞬間にカウントが1進むから。

			// ユーザーの手を入力
			System.out.println("0: グー, 1: チョキ, 2: パー");
			System.out.print("あなたの手を入力してください（0/1/2）: ");
			int userHand = scanner.nextInt();

			// ユーザーの手が0、1、2のいずれかでなければエラーメッセージ
			if (userHand < 0 || userHand > 2) {
				System.out.println("無効な入力です。0, 1, 2 のいずれかを入力してください。");
				continue;
			}
			gameCount++; //ここに入力したら0,1,2以外の数字が入力されたらカウントが進まない。

			// 相手（コンピュータ）の手をランダムで決める
			Random random = new Random(); //インスタンスを生成
			int computerHand = random.nextInt(3); // 0, 1, 2のいずれか

			// ユーザーの手と相手の手を表示
			String[] hands = { "グー", "チョキ", "パー" };
			System.out.println(username + "の手は「" + hands[userHand] + "」");
			System.out.println("相手の手は「" + hands[computerHand] + "」");

			// じゃんけんの勝敗判定
			if (userHand == computerHand) { //自分と相手が同じだった場合
				System.out.println("DRAW あいこ もう一回しましょう！");
			} else if ((userHand == 0 && computerHand == 1) || // グー vs チョキ
					(userHand == 1 && computerHand == 2) || // チョキ vs パー
					(userHand == 2 && computerHand == 0)) { // パー vs グー
				// ユーザーの勝ち
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
				break; // 勝ったのでループを抜ける
			} else {
				// ユーザーの負け
				if (userHand == 0) {
					System.out.println("俺の勝ち！");
					System.out.println("負けは次につながるチャンスです！\nネバーギブアップ！");
				} else if (userHand == 1) {
					System.out.println("俺の勝ち！");
					System.out.println("たかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ");
				} else {
					System.out.println("俺の勝ち！");
					System.out.println("なんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです");
				}
			}
		}

		// 勝つまでにかかった回数を表示
		System.out.println("勝つまでにかかった合計回数は" + gameCount + "回です");

		scanner.close(); // Scannerのリソースを閉じる

	}

}
