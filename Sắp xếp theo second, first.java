import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
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
                if(o1[1] == o2[1]){
                    return o2[0].compareTo(o1[0]);
                }
                return o1[1].compareTo(o2[1]);
            }
        });
        for(int i = 0; i < n;i++){
            System.out.println(a[i][0] + " " + a[i][1]);
        }
    }
}
