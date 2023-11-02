import java.io.*;

public class Judge02 {
    public static void main(String[] args) throws IOException {
        /* 変数宣言と初期化 */
        final int USUALLY_CHARGE = 2000;        //通常料金（定数の宣言）
        int charge = 0;                         //料金

        /* 入力の準備 */
        BufferedReader br = 
            new BufferedReader(new InputStreamReader(System.in));
        
                                                //①年齢の入力
        System.out.print("年齢を入力してください＞");
        int age = Integer.parseInt(br.readLine());

        if (age < 18) {                         //②年齢の判定
            charge = USUALLY_CHARGE / 2;        //③18歳未満のとき半額
        }else{
            charge = USUALLY_CHARGE;            //④18歳以上のとき通常料金
        }
                                                //⑤料金の表示
        System.out.println(age + "歳は" + charge + "円です");
        }
    }
