import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt(), x = sc.nextInt();
        Integer []a = new Integer[n];Integer []b = new Integer[n];
        for(int i = 0; i < n ;i++){
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(Math.abs(o1 - x) != Math.abs(o2 - x)){
                    return Math.abs(o1 - x) - Math.abs(o2 - x);
                }
                return o1 - o2;
            }
        });
        for(int i : a){
            System.out.print(i + " " );
        }
        System.out.println();
        Arrays.sort(b, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 % 2 == 0 && o2 % 2 != 0){
                    return -1;
                }
                if (o1 % 2 != 0 && o2 % 2 == 0){
                    return 1;
                }
                if(o1 % 2 == 0 && o2 % 2 == 0){
                    return o1 - o2;
                }
                return o2 - o1;
            }
        });
        for(int i : b){
            System.out.print(i + " ");
        }
    }
}
