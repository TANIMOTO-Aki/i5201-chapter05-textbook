import java.io.*;

public class PassJudge {
    public static void main(String[] args) throws IOException {
        final int PassJudge = 50;               // 合格点（定数：50）
        /* 入力の準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        String buf;                             // 入力バッファ

        /* 入力の繰り返し */
        System.out.println("終了は[Enter]だけを入力");
        System.out.print("点数入力＞");
        while (!(buf = br.readLine()).equals("")) {
                                                // 入力があれば繰り返し
            /* 点数の設定と変数の宣言 */
            int score = Integer.parseInt(buf);      //点数の設定
            String message = "";                    //表示メッセージ

            /* 合格判定 */
            if (score < PassJudge) {                // 合否判定
                int lack = PassJudge - score;       // 不足分の計算
                                                // メッセージの設定
                message = "あと" + lack + "点で合格です";
            } else {
                message = "合格です";               // 合格メッセージの設定
            }
            System.out.println(message);            // メッセージの表示
            System.out.print("点数入力＞");
        }
    }
}
