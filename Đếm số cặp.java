import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static int firstPosition(ArrayList<Integer> a, int value, int left, int right) {
        int index = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid).equals(value)) {
                index = mid;
                right = mid - 1;
            } else if (a.get(mid).compareTo(value) > 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return index;
    }

    public static int lastPosition(ArrayList<Integer> a, int value, int left, int right) {
        int index = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a.get(mid).compareTo(value) == 0) {
                index = mid;
                left = mid + 1;
            } else if (a.get(mid).compareTo(value) > 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        Collections.sort(a);
        long count = 0;
        for (int i = 0; i < a.size(); i++) {
            // Tìm vị trí đầu tiên của k+a[i]
            int p1 = firstPosition(a, a.get(i) + k, i + 1, n - 1);

            // Tìm vị trí cuối cùng của k+a[i]
            int p2 = lastPosition(a, a.get(i) + k, i + 1, n - 1);

            if (p1 != -1) {
                count = count + (p2 - p1 + 1);
            }
        }
        System.out.println(count);


    }

}
