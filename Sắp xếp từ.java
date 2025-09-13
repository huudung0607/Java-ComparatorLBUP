import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        String []a = new String[n];
        for(int i = 0; i < n ;i++){
            a[i] = sc.next();
        }
        String []b = a;
        Arrays.sort(a);
        for(var i : a){
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.sort(b,Collections.reverseOrder());
        for(var i : b){
            System.out.print(i + " ");
        }
    }
}
