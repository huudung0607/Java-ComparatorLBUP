import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    public static int firstPosition(int []a, int l ,int r ,int x){
        int res = -1;
        while(l <= r){
            int m = (int)(l + r)/2;
            if(a[m] < x){
                res = m;
                l = m + 1;
            }
            else r = m - 1;
        }
        return res;
    }
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(), m = sc.nextInt();
        int []a = new int[n];
        int []b = new int[m];
        for(int i = 0 ;i < n;i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < m;i++){
            b[i] = sc.nextInt();
        }
        Arrays.sort(b);
        for(var i : a){
            int pos = firstPosition(b,0,m - 1,i);
            System.out.print(pos + 1 + " ");
        }
    }
}
