import java.io.*;

public class NotCondition {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        final String BLOOD_TYPE_A = "A";    // 定数　血液型A型

        /* データの設定 */
        System.out.print("血液型を入力してください＞");
        String bloodType = br.readLine();

        /* 条件を判定　血液型が"A"以外のときメッセージ表示 */
        if (!bloodType.equals(BLOOD_TYPE_A)) {
            System.out.println("献血にご協力ください");
        }
    }
}
