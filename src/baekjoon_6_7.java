// 첫째 줄에 다이얼을 걸기 위해서 필요한 최소 시간을 출력한다.
public class baekjoon_6_7 {
    String str = "WA";
    void solution_6_7() {
        char[] charArr = new char[str.length()];
        int countTime = 0;

        for(int i = 0; i < charArr.length; i++) {
            charArr[i] = str.charAt(i);
            if( (charArr[i]+1)/3 >= 22 && (charArr[i]+1)/3 <= 26 ) countTime = countTime + (charArr[i]+1)/3-19;
            else if( (charArr[i])/4 == 20 ) countTime = countTime + 8;
            else if( (charArr[i])/3 == 28) countTime = countTime + 9;
            else if( (charArr[i] + 1)/4 == 22 ) countTime = countTime + 10;
            else countTime = countTime + 11;
        }
        System.out.println(countTime);
    }
}
