package jp.ac.uryukyu.ie.e185731;

public class Main {
    public static void main(String[] args){

        title();
        answerNumber();

    }
    private static void title(){

        String title = "*** Number Game ***";
        String rule = "隠された3つの数字をあてます。\n"
                + "1つの数字は1から6の間です。\n"
                + "3つの答えの中に同じ数字はありません。\n"
                + "入力した数字の、"
                + "位置と数字が当たってたらイート、\n"
                + "数字だけあってたらバイトとカウントします。\n"
                + "全部当てたら(3つともイートになったら)"
                + "終了です\n\n";

        System.out.println(title);
        System.out.println(rule);
    }

    private static void answerNumber(){
        int[] answer = new int[3];
        for(int i = 0; i < answer.length; i++){
            boolean set;
            answer[i] = (int) (Math.random() * 9 + 1);
            do {
                set = false;
                for(int j = i-1; j >= 0; j--){
                    if(answer[i] == answer[j]){
                        set = true;
                        answer[i] = (int) (Math.random() * 9 +1);
                    }
                }
            }while (set);
        }
        /*
        とりあえずプリントしてみる。
         */
        System.out.print(answer[0]);
        System.out.print(answer[1]);
        System.out.println(answer[2]);
    }
}
