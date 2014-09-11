package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * リストのぬるぽテスト
 * ※何の役にも立ちません。
 */
public class ListTest {

    /**ｷﾓｲｸﾗｽ**/
    public static class Human {
        public String name;
        private int face = 1;
        private int body = 1;

        public Human(String name, int face, int body) {
            this.name = name;
            this.face = face;
            this.body = body;
        }

        public int getFace() {
            return this.face;
        }

        public int getBody() {
            return this.body;
        }
    }

    public static void main(String[] args) {
        test_list();
    }

    private static void test_list() {

        List<Human> humanList = createHumanList();
        for (Human human : humanList) {
            System.out.println(human.name);
        }

        {
            /* ﾊﾟﾀｰﾝ１だよ */
            List<Human> nullList = createNullList();
            if (nullList == null) {
                return;
            }
            nullList.removeAll(Collections.singletonList(null));
            if (isNotEmpty(nullList)) {
                for (Human human : nullList) {
                    // 理論上ここにはこない
                    System.out.println(human.name);
                }
            }
        }

        {
            /* ﾊﾟﾀｰﾝ２だよ */
            List<Human> nullList = createNullList();
            nullList.removeAll(Collections.singletonList(nullList));
            if (isNotEmpty(nullList)) {
                for (Human human : nullList) {
                    if (human == null) {
                        continue;
                    }
                    System.out.println(human.name);
                }
            }
            List<Human> nullpo = null;
            // hai,ぬるぽ予定
            nullpo.removeAll(Collections.singletonList(nullList));
        }
    }

    private static List<Human> createHumanList() {
        // 後でnull消しこみのためArrayListでインスタンス生成
        List<Human> humanList = new ArrayList<Human>(Arrays.asList(
                new Human("adam", 10, 40)
                , new Human("eve", 10, 40)
                , new Human("eden", 10, 40)
                , new Human("asim", 10, 40)));
        return humanList;
    }

    private static List<Human> createNullList() {
        Human human = null;
        Human human1 = null;
        Human human2 = null;
        Human human3 = null;
        // 後でnull消しこみのためArrayListでインスタンス生成
        List<Human> humanList = new ArrayList<Human>(Arrays.asList(human, human1, human2, human3));
        return humanList;
    }

    private static Boolean isNotEmpty(List<Human> list) {
        if (list == null) {
            return null;
        }
        return !list.isEmpty();
    }
}
