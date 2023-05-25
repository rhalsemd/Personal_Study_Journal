import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    private static int nn, kk;
    private static int[] eenemy;

    public static int solution(int n, int k, int[] enemy) {
        nn = n;
        kk = k;
        eenemy = enemy;

        return binarySearch();
    }

    private static int binarySearch() {
        int left = 0;
        int right = eenemy.length;

        while (left < right) {
            int mid = (left + right) / 2;

            // mid 위치 까지 막을 수 있는지 확인함
            if (isDefence(mid)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    private static boolean isDefence(int mid) {
        List<Integer> collect = Arrays.stream(eenemy, 0, mid + 1)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        int n = nn;

        int size = collect.size();

        for (int i = 0; i < size; i++) {
            Integer el = collect.get(i);
            if (el <= n) {
                n -= el;
                continue;
            }
            return kk >= size - i; 
        }
        return true;
    }
}