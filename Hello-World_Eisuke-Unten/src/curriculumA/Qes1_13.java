package curriculumA;

public class Qes1_13 {

	public static void main(String[] args) {
		
	//問1 宣言のみ
//		byte byteVar;        //バイト型
//		short shortVar;  	 //短整数型
//		int intVar;  		 //整数型
//		long longVar;		 //長整数型
//		float floatVar;		 //単精度浮動少数点数型
//		double doubleVar;	 //倍精度浮動少数点数型
//		char charVar;		 //文字型
//		String stringVar;	 //文字列型
//		boolean booleanVar;  //ブーリアン型
		
	
	
	//問2　初期化
		byte byteVar = 10;        //バイト型
		short shortVar = 100;  	 //短整数型
		int intVar = 1000;  		 //整数型
		long longVar = 10000L;		 //長整数型　　　　　　　　long型は'L'が必要
		
		float floatVar = 9.5f;		 //単精度浮動少数点数型　　float型は’f’が必要
		double doubleVar = 10.5;	 //倍精度浮動少数点数型
		
		char charVar = 'a';		 //文字型
		String stringVar = "ハロー";	 //文字列型
		
		boolean booleanVar = true;  //ブーリアン型
		
	//問3　変数に代入
		
		  System.out.println("byte: " + byteVar);
	      System.out.println("short: " + shortVar);
	      System.out.println("int: " + intVar);
	      System.out.println("long: " + longVar);       
	      System.out.println("float: " + floatVar);
	      System.out.println("double: " + doubleVar);
	      System.out.println("char: " + charVar);
	      System.out.println("String: " + stringVar);
          System.out.println("boolean: " + booleanVar);
		
          
	//問4　コンソール出力
          System.out.println(byteVar + shortVar + intVar + longVar);            // 11110（10 + 100 + 1000 + 10000）
          System.out.println(byteVar + shortVar + intVar + longVar);            // 11110（同じ）
          System.out.println(byteVar + byteVar);            // 20（10 + 10） 
          System.out.println(byteVar + byteVar);            // 20（同じ）

          // 文字・文字列・真偽値の出力
          System.out.println(charVar + " " + stringVar + " " + booleanVar);
          System.out.println(charVar + " " + stringVar + " " + booleanVar);

          // 数値の合計（10 + 100 + 1000 + 10000 + 9.5 + 10.5）
          
          //int型だと小数点切り捨てなので×
          //int sum = byteVar + shortVar + intVar + (int) longVar + (int) floatVar + (int) doubleVar;
          //小数点も合計に含める時はdouble
         double sum = byteVar + shortVar + intVar + longVar + floatVar + doubleVar;
          System.out.println((int)sum);       //(int)を入れないと11130.0になってしまう
          System.out.println((int)sum);

          // 小数点以外の数字をかける（10 * 100 * 1000 * 10000）
         long product = (long) byteVar * shortVar * intVar * longVar;
          System.out.println(product);
          System.out.println(product);

          // 10.5 ÷ 100
          //division = 割り算
          double division = doubleVar / 100;
          System.out.println(division);
          System.out.println(division);

          // 10 - 100
          //subtraction = 引き算
         int subtraction = byteVar - shortVar;
          System.out.println(subtraction);
          System.out.println(subtraction);
          
	//問5	正しい動作にする
         String num = "20";
         int num1 = 23;

          // 文字列をintに変換してから加算
          System.out.println("ハローJAVA" + (Integer.parseInt(num) + num1));
          
          //解説↓
          //num が String 型であるため、+ 演算子によって数値の足し算ではなく「文字列の連結」が行われている。
          //Integer.parseInt(num) は、文字列 "20" を整数 20 に変換する。
          //これで、数値同士の加算が行われるようになり、20 + 23 = 43 になる。
          
          
     //問6    format通りの出力にする
          // ローカル変数への代入
         String name = "山田太郎";
         int age = 18;
         double height = 170.5;
         double weight = 62.2;
         String favoriteFood = "寿司";

          System.out.println("初めまして" + name + "です");
          System.out.println("年齢は" + age + "歳です");
          System.out.println("身長は" + height + "cmです");
          System.out.println("体重は" + weight + "kgです");
          System.out.println("好きな食べ物は" + favoriteFood + "です");
          
          
      //問7   BMIを出力
          
       //BMI = 体重(kg) ÷ (身長(m) × 身長(m))
       // BMIの計算（身長をmに変換して計算）
         double heightInMeters = height / 100;  //'cm'→'m'にするには100で割る(1.7m)
         double bmi = weight / (heightInMeters * heightInMeters);

          // BMIの出力
          System.out.println("BMIは" + bmi + "です");
          
          //数点1桁にするなら printf を使う
          System.out.printf("BMIは%.1fです\n", bmi);
          
        //%.1f の意味↓
          //%：ここに値を挿入するという意味
          //.1：小数点以下 1桁まで表示
          //f：浮動小数点数（float / double）の形式で表示  
          
   
         
       //問8   問6で宣言したの変数に再代入
          
          //再代入は、変数を再宣言せずに値だけ変える。
          // String name = ... ← 再宣言してしまうとエラーになる。
          // 正しくは name = ... のように 型を書かずに代入だけする。
          name = "鈴木一郎";
          age = 24;
          height = 168.5;
          weight = 64.2;
          favoriteFood = "オムライス";

          // BMI計算
          heightInMeters = height / 100;
          bmi = weight / (heightInMeters * heightInMeters);

          // 出力（BMIは小数点1桁に丸めて表示）
          System.out.println("初めまして" + name + "です");
          System.out.println("年齢は" + age + "歳です");
          System.out.println("身長" + height + "cmです");
          System.out.println("体重は" + weight + "kgです");
          System.out.println("好きな食べ物は" + favoriteFood + "です");
          System.out.printf("BMIは%.1fです\n", bmi);
          
          
         //問9 　問8で使用した変数[年齢・身長・体重]の数値を和算
          
          // 和算で自己代入（値を2倍にする）
          //和算 = 自分自身に足すという操作
          age += age;           // 24 → 48
          height += height;     // 168.5 → 337.0
          weight += weight;     // 64.2 → 128.4

          // BMI 計算
          heightInMeters = height / 100;
          bmi = weight / (heightInMeters * heightInMeters);

          // 出力（BMIは小数点2桁で表示）
          System.out.println("初めまして" + name + "です");
          System.out.println("年齢は" + age + "歳です");
          System.out.println("身長" + height + "cmです");
          System.out.println("体重は" + weight + "kgです");
          System.out.println("好きな食べ物は" + favoriteFood + "です");
          System.out.printf("BMIは%.2fです\n", bmi);  // 小数点2桁表示
          
          
         //問10  問8で使用した年齢が25歳以上ならtrueが出力。　ただしif文はなし。
          
          System.out.println(age >= 25);  // → true
               
         //問11  問8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力
          //String.valueOf() は、あらゆる型の値を文字列（String型）に変換するメソッド
          
          String strAge = String.valueOf(age);
          String strHeight = String.valueOf(height);
          String strWeight = String.valueOf(weight);

          String result11 = strAge + strHeight + strWeight;
          System.out.println(result11);  // 48337.0128.4
          
         //問12   問11で変換した【年齢・身長】を整数型に変換して出力
          int intAge = Integer.parseInt(strAge);
          
          int intHeight = (int) Double.parseDouble(strHeight);
          System.out.println(intAge);     // 48
          System.out.println(intHeight);  // 337
          
         //問13  問12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力
         //ただしif文は使わない
          
          // 13: 年齢が25以上 または 身長が160以上 → trueを出力（if文なし）
          System.out.println(intAge >= 25 || intHeight >= 160);  // true
          

	  }
	}


