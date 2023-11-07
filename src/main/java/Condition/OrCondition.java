import java.io.*;

public class OrCondition {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        final int USUALLY_CHARGE = 2000;            //通常料金（定数の宣言）
        final String FEMALE = "female";             //女性："female"（定数の宣言）
        int charge = USUALLY_CHARGE;                //料金の宣言と初期化

        /* データの設定 */
        System.out.print("年齢の入力＞");
        int age = Integer.parseInt(br.readLine());
        System.out.print("性別の入力（male or female)＞");
        String gender = br.readLine();

        /* 条件を判定　１８歳未満または女性のとき半額 */
        if ((age < 18) || gender.equals(FEMALE)) {
            charge /= 2;                            //半額計算
        }

        /* 料金の表示 */
        System.out.println("入場料は" + charge + "円です");
    }
}
