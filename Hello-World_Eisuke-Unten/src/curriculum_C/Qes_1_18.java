package curriculum_C;

import java.util.Random;

public class Qes_1_18 {

	//	public static void main(String[] args) {
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。

	// メソッド定義
	public static void greet(String word, int version) {
		System.out.println(word + " " + version);
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	// multiply(int value) = 引数 value を1つ受け取るメソッド
	public static void multiply(int value) {

		//その値同士（2乗）を計算
		int result = value * value;

		System.out.println("結果は: " + result);
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	// int[] arr：整数の配列を引数として受け取る
	public static void printArray(int[] arr) {
		//拡張for文（for-each)で配列の中身を1つずつ取り出す。
		for (int num : arr)
			System.out.println(num);
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	// 整数を掛け算
	public static void multiply(int a, int b) {
		// ①int → 掛け算
		int result = a * b;
		System.out.println("掛けると" + result);
	}

	// 小数を足し算（オーバーロード）
	public static void multiply(double a, double b) {
		// ②double → 足し算、という風に処理を分けている。
		double result = a + b;
		System.out.println("足すと" + result);
	}

	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] generateRandomNumbers(int count) {
		Random rand = new Random();
		int[] numbers = new int[count];

		for (int i = 0; i < count; i++) {
			int randomNum;
			do {
				// 0〜100の乱数(rand.nextInt(101)は0以上101「未満」という意味)
				randomNum = rand.nextInt(101);
				// do...while で、0が出た場合は再取得してスキップ
			} while (randomNum == 0);

			// 配列 numbers の i 番目の位置に、変数 randomNum の値を代入している
			numbers[i] = randomNum;

			System.out.println("ランダム値: " + randomNum);
		}
		// ここで配列を返す
		return numbers;

	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double calculateAverage(int[] numbers) {

		//合計を入れる変数 sum を 初期値0 で宣言
		int sum = 0;

		for (int num : numbers) {
			sum += num;
		}

		double average = (double) sum / numbers.length;
		System.out.printf("平均値は %.2f です。\n", average);
		return average;
	}

	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	//配列を受け取り、合計÷個数で平均を出力
	public static boolean isAbove50(double average) {
		boolean result = (average >= 50) ? true : false;
		System.out.println("平均値が50以上か？: " + result);
		return result;
	}

	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください

		// メソッド呼び出し
		greet("Hello JavaSE", 11);

		//multiply = 掛け算　乗算
		multiply(5);

		int[] numbers = { 10, 20, 30, 40, 50 };
		// 配列をメソッドに渡す	
		printArray(numbers);

		// 整数の掛け算 → 12
		multiply(3, 4);

		// 小数の足し算 → 6.6
		multiply(2.5, 4.1);

		// 例：5回分
		int[] result = generateRandomNumbers(5);
		// 必要であれば、返ってきた配列を別でも使える

		// Q6の平均値メソッド
		double avg = calculateAverage(result);
		boolean isHigh = isAbove50(avg);
	}
}
