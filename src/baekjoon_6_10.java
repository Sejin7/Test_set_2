// 첫째 줄에 그룹 단어의 개수를 출력한다.
public class baekjoon_6_10 {
    int num = 1;
    String str = "zz";

    void solution_6_10() {
        int count = 0;

        for(int i=0; i<num; i++) {
            if(checkGroupWord(str)) count++;
        }
        System.out.println(count);
    }

    static boolean checkGroupWord(String str) {
        char[] charTemp = new char[str.length()];

        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) != str.charAt(i-1)) {
                charTemp[i-1] = str.charAt(i-1);
                if(checkOverlap(charTemp)) return false;
            }
            if(i == str.length()-1) {
                charTemp[i] = str.charAt(i);
                if(checkOverlap(charTemp)) return false;
            }
        }
        return true;
    }

    static boolean checkOverlap(char[] chaArr) {
        for(int i=0; i<chaArr.length-1; i++){
            if(chaArr[i] == '\0') continue;
            for(int j=i+1; j<chaArr.length; j++) {
                if( chaArr[i] == chaArr[j]) return true;
            }
        }
        return false;
    }
}
