import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        Character []a = new Character[n];
        for(int i = 0; i < n ;i++){
            a[i] = sc.next().charAt(0);
        }
        Character []b = a;
        Arrays.sort(a);
        for(char i : a){
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.sort(b,Collections.reverseOrder());
        for(char i : b){
            System.out.print(i + " ");
        }
    }
}
