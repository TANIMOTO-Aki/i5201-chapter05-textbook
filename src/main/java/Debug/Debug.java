/*練習問題5.5用の誤ったプログラム */
import java.io.*;

public class Debug {
    public static void main(String[] args) throws IOException {
        /* 定数の宣言 */
        final int Regular_Price = 2000;         //通常料金
        final String FEMALE = "F";              //女性

        /* 入力の準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        /* 年齢の入力 */
        System.out.print("年齢＞");
        int age = Integer.parseInt(br.readLine());

        /* 性別の入力 */
        System.out.println("男性はM 女性はFを入力してください");
        System.out.print("性別＞");
        String gender = br.readLine();

        int price = Regular_Price;              //通常料金の設定

        /* 条件を判定　年齢 */
        if (age < 18)
            {price /= 2;                        //半額計算
        }
        /* 条件を判定　性別 */
        if (gender.equals(FEMALE))
            {price /= 2;                        //半額計算
        }

        /* 料金の表示 */
        System.out.println("入場料は" + price + "円です");
    }
}