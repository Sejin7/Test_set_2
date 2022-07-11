// 입력으로 주어진 단어가 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
public class baekjoon_6_9 {
    String str = "dz=dzakdz=dz";
    void solution_6_9() {
        int count = 0;

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '=' || str.charAt(i) == '-') continue;
            else if(str.charAt(i) == 'd') {
                if(i == str.length() - 1) {
                    count++;
                    break;
                }
                else if(str.charAt(i+1) == 'z') {
                    if(i == str.length() - 2) {
                        count = count + 2;
                        break;
                    }
                    else if(str.charAt(i+2) == '=') continue;
                    else count++;
                }
                else count++;
            }
            else if(str.charAt(i) == 'j') {
                if(i == 0) {
                    count++;
                    continue;
                }
                else {
                    if (str.charAt(i - 1) == 'l' || str.charAt(i - 1) == 'n') continue;
                    else count++;
                }
            }
            else count++;
        }
        System.out.println(count);
    }
}
