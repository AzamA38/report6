package jp.ac.uryukyu.ie.e185731;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Game {

    /**
     * 答えとなる３つの数字を生成するメソッド
     */

    public int[] answerNumber() {

        int[] answer = new int[3];

        for (int i = 0; i < answer.length; i++){
            boolean set;
            answer[i] = (int) (Math.random() * 9 + 1);
            do{
                set = false;
                for(int j = i - 1; j >= 0; j--){
                    if (answer[i] == answer[j]){
                        set = true;
                        answer[i] = (int) (Math.random() * 9 + 1);
                    }
                }
            }while (set);
        }

        /*
        とりあえずプリントしてみる。
         */
        //System.out.print(answer[0]);
        //System.out.print(answer[1]);
        //System.out.println(answer[2]);

        return answer;

    }

        int count;

    /**
     *ゲームのなかみ
     * 上のメソッドで生成した３つの数字とユーザから読み込んだ３つの数字を照らし合わせる
     *
     */


    public void game(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /**
         * 上の３つの数字を読み込む
         */
        int[] answer = answerNumber();

        while (true){
            int[] input = new int[3];

            count++;
            System.out.println("*** " + count + "回目 ***");
            for (int i = 0; i < answer.length; i++) {
                System.out.print((i + 1) + "個目 : ");

                try{
                    input[i] = Integer.parseInt(br.readLine());
                }catch (NumberFormatException e) {
                    System.err.println("数値を入力してください");
                    i--;
                }catch (IOException e) {
                    System.err.println("もう一度入力してください");
                    i--;
                }
            }

            /**
             * イート数を数える
             */
            int eat = 0;

            /**
             * バイト数を数える
             */
            int bite = 0;

            for (int i = 0; i < answer.length; i++) {
                for (int j = 0; j < answer.length; j++) {
                    if (i == j && input[i] == answer[j]) {
                        eat++;
                    } else if (input[i] == answer[j]) {
                        bite++;
                    }
                }
            }

            System.out.println("イート" + eat + "　バイト" + bite);
            if (eat == 3){
                System.out.println("おめでとー");
                break;
            }else{
                System.out.println();
            }
        }
    }
}
