import java.io.*;

public class Judge03 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        
        final String FEMALE = "female";         //定数の宣言（女性："female"）

        System.out.print("性別を入力 (male or female)＞");
        String gender = br.readLine();          //性別の設定

        /* 性別の判定 */
        if (gender.equals(FEMALE)){
            System.out.println("女性です");
        } else {
            System.out.println("男性です");
        }
    }
}
