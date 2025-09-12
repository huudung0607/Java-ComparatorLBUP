import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    public static int dem(long n){
        int cnt = 0;
        while(n != 0){
            long last = n % 10;
            if(last == 0 || last == 6 || last == 8 ){
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
        Long []a = new Long[n];
        for(int i = 0; i < n ;i++){
            a[i] = sc.nextLong();
        }
        Arrays.sort(a, new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                if(dem(o1) == dem(o2)){
                    return o1.compareTo(o2);
                }
                return dem(o2) - dem(o1);
            }
        });
        for(var i : a){
            System.out.print(i + " ");
        }
    }
}
