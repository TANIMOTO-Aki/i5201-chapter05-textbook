import java.io.*;

public class GradeJudge01 {
    public static void main(String[] args) throws IOException {
        /* 入力の準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        String grade = "";                  //評価

        /* 評価点の入力 */
        System.out.print("点数を入力");
        int marks = Integer.parseInt(br.readLine());

        /* 評価の判定と表示 */
        if (marks < 50) {
            grade = "D";
        } else if (marks < 70) {
            grade = "C";
        } else if (marks < 90) {
            grade = "B";
        } else {
            grade = "A";
        }
        System.out.println("評価は" + grade + "です");
    }
}
/*
 * 確認問題5.4
 * ①70=B、②90=A、③50=C、④49=D、⑤69=C、⑥89=B
 */