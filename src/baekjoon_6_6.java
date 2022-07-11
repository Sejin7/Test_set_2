public class baekjoon_6_6 {
    void solution_6_6() {
        String str = " The Curious Case of Benjamin Button "; // 단어 개수 → 6개, 맨 앞/뒤 blank
        String[] strArr = str.split(" ");
        int count = strArr.length;

        for(int i = 0; i < strArr.length; i++) if (strArr[i].isEmpty()) count--;
        System.out.println(count);
    }
}
