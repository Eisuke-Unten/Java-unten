package curriculum_B;

import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		//Scannerは入力を読み取るクラス
		//scはScannerクラスのインスタンス（変数名）で、これを使って入力を読み取る
		Scanner sc = new Scanner(System.in); //ユーザーからの入力を受け取るための準備((System.inはキーボード入力（標準入力))
		int num; //ここのnumは「生徒の人数」を格納するための名前（変数名）

		// 2人以上の入力を強制する
		do {
			System.out.print("生徒の人数を入力してください（2以上）: ");
			num = sc.nextInt(); // ユーザーから整数を入力
		} while (num < 2); //  2未満ならもう一度繰り返す
		//「生徒の人数を2人以上で入力させる」ための繰り返し処理

		// 各教科の合計点を初期化
		int[] subjectTotal = new int[4]; // 0:英語, 1:数学, 2:理科, 3:社会　(各教科の合計点を入れるための配列)
		//↓↑同じ
		//subjectTotal[0] → 英語の合計点  
		//subjectTotal[1] → 数学の合計点  
		//subjectTotal[2] → 理科の合計点  
		//subjectTotal[3] → 社会の合計点

		double[] studentAverages = new double[num]; //平均を求めるのでdouble(小数点を含む数値（浮動小数点数）を扱う型)を使う

		String[] subjects = { "英語", "数学", "理科", "社会" };

		for (int i = 0; i < num; i++) { //生徒の人数分だけループ
			int sum = 0; //その生徒の 4教科の合計点を入れる変数。
			for (int j = 0; j < 4; j++) { //英語・数学・理科・社会 の4教科分ループ  jは教科のインデックス

				System.out.print((i + 1) + "人目の『" + subjects[j] + "』の点数を入力してください :");
				//iは生徒番号（0から始まるが、表示では i + 1 にして1人目から数える）

				int score = sc.nextInt(); //入力された点数を score に格納。
				sum += score; //生徒の合計点に足す。
				subjectTotal[j] += score; //各教科ごとの合計点も加算する（全体平均用）
			}
			//生徒の4教科の平均点を計算  (double) としておくことで、小数の平均点にする
			studentAverages[i] = (double) sum / 4;
		}

		System.out.println();

		// 生徒ごとの平均点を出力
		for (int i = 0; i < num; i++) { //for文で生徒の人数分（num回）繰り返す
			//studentAverages[i] には各生徒の平均点が入ってる
			//%.2fは小数点以下2桁まで表示
			System.out.printf("%d人目の平均点は%.2f点です。\n", (i + 1), studentAverages[i]);
		}

		System.out.println();

		// 各教科の平均点と全体平均を出力
		double totalSum = 0; //平均点を求めるのでdouble
		for (int j = 0; j < 4; j++) {

			//subjectTotal[j] には各教科の合計点（全生徒分）が入ってる
			//num で割ると、教科ごとの平均点が出せ
			double avg = (double) subjectTotal[j] / num;
			totalSum += avg; //全体の合計平均点（全教科すべての平均点の合計）
			System.out.printf("%sの平均点は%.2f点です。\n", subjects[j], avg);
		}

		System.out.printf("全体の平均点は%.2f点です。\n", totalSum / 4); // 全体平均点

		sc.close();
		//close() は スキャナを閉じる処理

	}

}
