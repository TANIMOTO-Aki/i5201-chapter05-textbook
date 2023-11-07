import java.io.*;

public class DictionaryComp {
    public static void main(String[] args) throws IOException {
        /* 入力の準備 */
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        
        /* 比較結果表示用の文字列の準備 */
        String appear = "先に現れる文字列:";

        /* 文字列１の入力 */
        System.out.print("文字列１＞");
        String str1 = br.readLine();

        /* 文字列２の入力 */
        System.out.print("文字列２＞");
        String str2 = br.readLine();

        /* 文字列の比較 */
        if (str1.compareTo(str2) < 0) {
            appear += str1;
        } else if (str1.compareTo(str2) > 0) {
            appear += str2;
        } else {
            appear = "一致:" + str1 + "と" + str2;
        }

        /*  比較結果の表示 */
        System.out.println(appear);
    }
}
