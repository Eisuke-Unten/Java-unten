package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		System.out.println("課題4\n");

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) { // j を先にしているので「横方向に掛け算」が表示される（1×1、2×1、3×1…という並び）
				//String.format("%02d", 数値)で2桁ゼロ埋めで整形(01.02.03....という表示)
				System.out.print(String.format("%02d * %02d = %02d", j, i, j * i));
				//j（列）× i（行）の掛け算結果を、「01 * 02 = 02」のような形で整形して、横並びに表示している	 
				//%02d は「2桁の整数で、足りなければ先頭に0を付ける」という意味。
				//(例)j = 3, i = 4 のとき　→　"03 * 04 = 12"

				if (j != 9) { //最後(一番右側)に「||」が出ないように制御
					System.out.print(" || ");
				}
			}
			System.out.println(); // 09 * ?? まで処理が終わったら改行
		}

	}

}
