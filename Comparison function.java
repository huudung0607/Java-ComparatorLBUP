import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static int demChan(int n){
        int cnt = 0;
        while(n != 0){
            if((n % 10) % 2 == 0){
                cnt++;
            }
            n/=10;
        }
        return cnt;
    }
    public static int demLe(int n){
        int cnt = 0;
        while(n != 0){
            if((n % 10) % 2 != 0){
                cnt++;
            }
            n/=10;
        }
        return cnt;
    }
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        Integer []a = new Integer[n];Integer []b = new Integer[n];
        for(int i = 0; i < n ;i++){
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i : a){
            mp.put(i,demChan(i));
        }
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(mp.get(o1) == mp.get(o2)){
                    return o1 - o2;
                }
                return mp.get(o1) - mp.get(o2);
            }
        });
        for(int i : a){
            System.out.print(i + " ");
        }
        System.out.println();
        Map<Integer,Integer> mp2 = new HashMap<>();
        for(int i : b){
            mp2.put(i,demLe(i));
        }
        Arrays.sort(b, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return mp2.get(o1) - mp2.get(o2);
            }
        });
        for(int i : b){
            System.out.print(i + " ");
        }
    }
}
