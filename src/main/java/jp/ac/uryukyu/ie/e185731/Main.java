package jp.ac.uryukyu.ie.e185731;

public class Main {
    public static void main(String[] args) {

        title();

        Game ga = new Game();

        ga.game();

    }

    /**
     * タイトルを表示する
     */
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
}