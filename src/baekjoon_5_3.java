// 첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
// 한수 → 각 자리 숫자가 등차수열을 이루는 숫자 ex) 123, 246 ...
public class baekjoon_5_3 {
    int N = 500; // N은 1000보다 작거나 같음

    void solution_5_3() {
        int count = 0;
        int[] nums = new int[3];
        for(int i = 1; i <= N; i++) {
            if(i%100 == i) count++;
            else {
                nums[0] = i%10;
                nums[1] = (i/10)%10;
                nums[2] = (i/100);

                if(nums[2] - nums[1] == nums[1] - nums[0]) count++;
            }
        }
        System.out.println(count);
    }
}
