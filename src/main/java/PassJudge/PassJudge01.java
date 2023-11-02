import java.io.*;

public class PassJudge01 {
    public static void main(String[] args) throws IOException {
        /* 入力の準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        /* 点数の入力 */
        System.out.print("点数を入力");
        int score = Integer.parseInt(br.readLine());

        /* 合格判定 */
        if (score >= 70) {
            System.out.println("合格です");
        }
    }
}
