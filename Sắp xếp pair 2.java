import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    public static int dem(long n){
        int cnt = 0;
        while(n != 0){
            long last = n % 10;
            if(last == 2 || last == 3 || last == 5 || last == 7 ){
                cnt++;
            }
            n/=10;
        }
        return cnt;
    }
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        Long [][] a = new Long[n][2];
        for(int i = 0; i< n ;i++){
            a[i][0] = sc.nextLong();
            a[i][1] = sc.nextLong();
        }
        Arrays.sort(a, new Comparator<Long[]>() {
            @Override
            public int compare(Long[] o1, Long[] o2) {
                long tmp1 = Math.abs(o1[0] - o1[1]);
                long tmp2 = Math.abs(o2[0] - o2[1]);
                if(tmp1 == tmp2){
                    if(o1[0] == o2[0]){
                        return o2[1].compareTo(o1[1]);
                    }
                    return o1[0].compareTo(o2[0]);
                }
                return Long.compare(tmp1,tmp2);
            }
        });
        for(int i = 0; i < n;i++){
            System.out.println(a[i][0] + " " + a[i][1]);
        }
    }
}
