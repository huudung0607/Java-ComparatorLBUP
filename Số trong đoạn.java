import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    public static int firstPosition(int []a, int l ,int r ,int x){
        int res = -1;
        while(l <= r){
            int m = (int)(l + r)/2;
            if(a[m] >= x){
                res = m;
                r = m - 1;
            }
            else l = m + 1;
        }
        return res;
    }
    public static int lastPosition(int []a, int l ,int r,int x){
        int res = -1;
        while(l <= r){
            int m = (int)(l + r)/2;
            if(a[m] <= x){
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
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i = 0; i < n;i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int q = sc.nextInt();
        for(int i = 0; i < q;i++){
            int l = sc.nextInt(), r = sc.nextInt();
            int firstPos = firstPosition(a,0,n - 1,l);
            int lastPos = lastPosition(a,0,n - 1,r);
            System.out.println(lastPos - firstPos + 1 + " ");
        }
    }
}
