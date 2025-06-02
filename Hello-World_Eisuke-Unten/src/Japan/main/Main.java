package Japan.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import Japan.model.Prefecture;

public class Main {
	public static void main(String[] args) {
		String[] data = {
				"北海道:札幌市:83424", "青森県:青森市:9646", "岩手県:盛岡市:15275",
				"宮城県:仙台市:7282", "秋田県:秋田市:11638", "山形県:山形市:9323",
				"福島県:福島市:13784", "茨城県:水戸市:6097", "栃木県:宇都宮市:6408",
				"群馬県:前橋市:6362", "埼玉県:さいたま市:3798"
		};

		Scanner scanner = new Scanner(System.in);

		System.out.println("都道府県の番号をカンマ区切りで入力してください");
		String[] inputIndices = scanner.nextLine().split(",");

		// インデックスをリストとして保持
		List<Integer> indexList = new ArrayList<>();

		for (String indexStr : inputIndices) {

		// parseInt() で文字列を整数に変える
			int idx = Integer.parseInt(indexStr.trim());
			indexList.add(idx);
		}

		String order1;
		while (true) {
			System.out.println("昇順 or 降順 を入力してください:");
			order1 = scanner.nextLine().trim();

			if (order1.equals("昇順") || order1.equals("降順")) {
		// 正常な入力ならループを抜ける
				break;
			} else {
				System.out.println("入力が不正です。もう一度「昇順」または「降順」と入力してください。");
			}
		}

		// ソート処理（インデックス順）
		if (order1.equals("昇順")) {
			Collections.sort(indexList);
		} else {
			Collections.sort(indexList, Collections.reverseOrder());
		}

		// ソートされたインデックスに従って Prefecture を生成＆表示
		for (int idx : indexList) {
			String[] parts = data[idx].split(":");
			String name = parts[0];
			String capital = parts[1];
			double area = Double.parseDouble(parts[2]);

			Prefecture prefecture = new Prefecture(name, capital, area);
			prefecture.printInfo();
		}
		scanner.close();
	}

}

/*
	
0, "北海道:札幌市:83424"
1, "青森県:青森市:9646"
2, "岩手県:盛岡市:15275"
3, "宮城県:仙台市:7282"
4, "秋田県:秋田市:11638"
5, "山形県:山形市:9323"
6, "福島県:福島市:13784"
7, "茨城県:水戸市:6097"
8, "栃木県:宇都宮市:6408"
9, "群馬県:前橋市:6362"
10, "埼玉県:さいたま市:3798"
	
	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
	都道府県がソートされてコンソールに出力されるように作ってください
	※Packageを2つ作ってください
	※複数選択できるようにしてください
	
	例:
	8,5,9,.....
	と入力された場合（昇順）
	
	都道府県名：山形県
県庁所在地：山形市
面積：9323.0km2
	
	都道府県名：栃木県
県庁所在地：宇都宮市
面積：6408.0km2

	都道府県名：群馬県
県庁所在地：前橋市
面積：6362.0km2

*/