package jp.ac.uryukyu.ie.e185731;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Game {

    int count;
    int[] answer;
    int[] input;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void game(){
        while (true) {
            count++;
            System.out.println("*** " + count + "回目 ***");
            for (int i = 0; i < answer.length; i++) {
                System.out.print((i + 1) + "個目 : ");
                try {
                    input[i] = Integer.parseInt(br.readLine());
                } catch (NumberFormatException e) {
                    System.err.println("数値を入力してください");
                    i--;
                } catch (IOException e) {
                    System.err.println("もう一度入力してください");
                    i--;
                }
            }

            int eat = 0;
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
            if (eat == 3) {
                System.out.println("おめでとー");
                break;
            } else {
                System.out.println();
            }
        }
    }
}

