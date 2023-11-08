import java.io.*;

public class Minimum {
    public static void main(String[] args) throws IOException {
        /* 定数と変数の宣言 */
        final String MIN_MESSAGE = "最小値は";      //"最小値は"のメッセージ

        /* 入力の準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        /* ３つの値の入力 */
        System.out.print("xを入力＞");
        int x = Integer.parseInt(br.readLine());    // xを入力
        System.out.print("yを入力＞");
        int y = Integer.parseInt(br.readLine());    // yを入力
        System.out.print("zを入力＞");
        int z = Integer.parseInt(br.readLine());    // zを入力

        /* 最小値の判定 */
        int minValue = x;

        if (minValue > y) {
            minValue = y;
        }
        if (minValue > z) {
            minValue = z;
        }
        System.out.println(MIN_MESSAGE + minValue);
    }
}
