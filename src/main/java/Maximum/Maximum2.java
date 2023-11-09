import java.io.*;

public class Maximum2 {
    public static void main(String[] args) throws IOException {
        /* 定数と変数の宣言 */
        final String MAX_MESSAGE = "最大値は";      //"最大値は"のメッセージ


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

        /* 最大値の判定 */
        int maxValue = x;
        if (maxValue < y) {
            maxValue = y;
        }
        if (maxValue < z) {
            maxValue = z;
        }
        System.out.println(MAX_MESSAGE + maxValue);
    }
}
