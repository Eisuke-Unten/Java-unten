package curriculum_B;
import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int num;

	        // 2人以上の入力を強制する
	        do {
	            System.out.print("生徒の人数を入力してください（2以上）: ");
	            num = sc.nextInt();
	        } while (num < 2);

	        // 各教科の合計点を初期化
	        int[] subjectTotal = new int[4]; // 0:英語, 1:数学, 2:理科, 3:社会
	        double[] studentAverages = new double[num];

	        String[] subjects = {"英語", "数学", "理科", "社会"};

	        for (int i = 0; i < num; i++) {
	            int sum = 0;
	            for (int j = 0; j < 4; j++) {
	                System.out.print((i + 1) + "人目の『" + subjects[j] + "』の点数を入力してください :");
	                int score = sc.nextInt();
	                sum += score;
	                subjectTotal[j] += score;
	            }
	            studentAverages[i] = (double) sum / 4;
	        }

	        System.out.println();

	        // 生徒ごとの平均点を出力
	        for (int i = 0; i < num; i++) {
	            System.out.printf("%d人目の平均点は%.2f点です。\n", (i + 1), studentAverages[i]);
	        }

	        System.out.println();

	        // 各教科の平均点と全体平均を出力
	        double totalSum = 0;
	        for (int j = 0; j < 4; j++) {
	            double avg = (double) subjectTotal[j] / num;
	            totalSum += avg;
	            System.out.printf("%sの平均点は%.2f点です。\n", subjects[j], avg);
	        }

	        System.out.printf("全体の平均点は%.2f点です。\n", totalSum / 4);

	        sc.close();

	}

}
