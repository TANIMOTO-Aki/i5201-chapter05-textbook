import java.io.*;

public class Judge04 {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("１つ目の文字列を入力＞");
        String str1 = br.readLine();                //文字列１の設定

        System.out.print("２つ目の文字列を入力＞");
        String str2 = br.readLine();                //文字列２の設定

        /* 文字列の比較 */
        if (str1.compareTo(str2) == 0) {
            System.out.println(str1 + "と" + str2 + "は一致しました");
        } else if (str1.compareTo(str2) < 0) {
            System.out.println(str1 + "が先で" + str2 + "があとです");
        } else {
            System.out.println(str2 + "が先で" + str1 + "があとです");
        }
    }
}
