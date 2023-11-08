import java.io.*;

public class MultipleOfX {
    public static void main(String[] args) throws IOException {

        /* 入力の準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        String buf;                             //入力バッファ

        /* 入力の繰り返し */
        System.out.println("終了は[Enter]だけを入力");
        System.out.print("整数を入力＞");
        while (!(buf = br.readLine()).equals("")) {     //入力があれば繰り返し
            /* 数値の設定と表示 */
            int num = Integer.parseInt(buf);

            int x = 3;                              //xに３を指定した場合

            if(num % x == 0) {
                System.out.println(num + "は" + x + "の倍数です");
            } else {
                System.out.println(num + "は" + x + "の倍数ではありません");
            }
            System.out.print("整数入力＞");
        }
    }
}