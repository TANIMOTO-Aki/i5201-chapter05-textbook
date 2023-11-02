import java.io.*;

public class Judge01 {
    public static void main(String[] args) throws IOException {
        /* 入力の準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        /* 変数宣言と初期化 */
        final int USUALLY_CHARGE = 2000;        //通常料金（定数の宣言）
        int charge = USUALLY_CHARGE;            //料金の初期化

        /* ①年齢の入力 */
        System.out.print("年齢を入力してください＞");
        int age = Integer.parseInt(br.readLine());

        /* 年齢の判定と料金表示 */

        if (age < 18) {                         //② １８歳未満の場合
            charge /= 2;                        //③ 料金の半額を算出
        }
                                                //④ 料金の表示
        System.out.println(age + "歳は" + charge + "円です");
    }
}
/*
 * トレース
 * 命令         age         charge          説明
 * 変数宣言     不定        2000            料金は通常料金の2000で初期化
 * ①            17          ↓               age（年齢）に17を入力
 * 
 *                                          ifの条件式を評価する
 * ②            ↓           ↓               age<18ではtrueを返す
 *                                          したがってコードブロック③へ進む
 * 
 * ③            ↓           1000            「料金←料金/2」半額を計算して料金とする
 * ④            ↓           1000            「17歳は1000円です」と表示して終了
 */