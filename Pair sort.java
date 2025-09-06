import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;
class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
public class Main {
    private static int mod = 1000000007;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        Integer [][]a = new Integer[n][2];
        for(int i = 0 ; i < n ;i++){
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        Arrays.sort(a, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                long d1 = 1l * o1[0] * o1[0] + 1l * o1[1] * o1[1];
                long d2 = 1l * o2[0] * o2[0] + 1l * o2[1] * o2[1];
                if(d1 == d2){
                    if(o1[0] == o2[0]){
                        return Integer.compare(o1[1],o2[1]);
                    }
                    return Integer.compare(o1[0],o2[0]);
                }
                return Long.compare(d1,d2);
            }
        });
        for(int i = 0; i < n;i++){
            System.out.println(a[i][0] + " " + a[i][1]);
        }
    }
}
