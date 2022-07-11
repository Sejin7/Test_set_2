// 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
public class baekjoon_6_5 {
    String str = "baaaa";

    void solution_6_5() {
        int[] charNum = new int[26];

        str = str.toLowerCase();
        for(int j = 97; j <= 122; j++) charNum[j-97] = findCharNum(str, (char)j);
        System.out.println(findMaxChar(charNum));
    }

    int findCharNum(String str, char ch){
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch) count++;
        }
        return count;
    }

    char findMaxChar(int[] intArr) {
        int max = 0;
        int maxInd = 0;
        for(int i = 0; i < intArr.length; i++) {
            if(max < intArr[i]) {
                max = intArr[i];
                maxInd = i;
            }
        }
        for(int j = maxInd + 1; j < intArr.length; j++) {
            // 가장 많이 사용된 알파벳이 여러개 일때
            if(intArr[j] == intArr[maxInd]) return '?';
        }
        // 대문자로 출력
        return (char)(maxInd+65);
    }
}
