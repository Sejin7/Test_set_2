public class baekjoon_5_2 {
    int[] notSelfNum = new int[101];

    void solution_5_2() {
        for (int i = 1; i <= 100; i++) {
            int calNum = selfNumCal(i);
            while(calNum < notSelfNum.length) {
                notSelfNum[calNum] = calNum;
                calNum = selfNumCal(calNum);
            }
        }
        for (int i = 1; i <= 100; i++) if (notSelfNum[i] == 0) System.out.println(i);
    }

    int selfNumCal(int a) {
        int result = a+a%10;
        for(int i = 0; i < 4; i ++){
            if(a/10 != 0) {
                a = a/10;
                result = result + a%10;
            }
            else break;
        }
        return result;
    }
}
