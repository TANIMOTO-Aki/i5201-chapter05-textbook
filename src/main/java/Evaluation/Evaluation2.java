import java.io.*;

public class Evaluation2 {
    public static void main(String[] args) throws IOException {
        /* 入力の準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        String buf;                             //入力バッファ

        /* 入力の繰り返し */
        System.out.println("終了は[Enter]だけを入力");
        System.out.print("点数入力＞");
        while (!(buf = br.readLine()).equals("")) {
                                                //入力があれば繰り返し
            /* 点数の設定と変数の宣言 */
            int score = Integer.parseInt(buf);  //点数の設定
            String message = "評価";            //表示メッセージ

            /* 評価判定 */
            if (0 <= score && score <= 100) {   //点数の範囲チェック
                /* 正常な範囲の点数の処理 */
                if (score < 40) {
                    message += "C";             //評価Cの設定
                } else if (score < 70) {
                    message += "B";             //評価Bの設定
                } else {
                    message += "A";             //評価Aの設定
                }
            } else {
                /* エラーメッセージの設定 */
                message = "範囲外の値ERROR：0から100までの数を入力したください";
            }
            System.out.println(message);        //メッセージの表示
            System.out.print("点数入力＞");
        }
    }
}
/*
 * 演習問題5.6
 * 点数範囲のチェックがOR条件で指定されているため、0点以上か100点以下のどちらかを満たせばエラーにならない。
 * そのため本来エラーになるはずの負の整数や101以上の整数でも点数の処理に入ってしまう。
 * OR条件をAND条件に置き換えることで、正しい点数範囲のチェックを行うようになる。
 */