import java.util.HashMap;

public class Count_Integer_occurences {
    public void CountInteger(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);

            }
        }

        System.out.println(map);
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 2, 33, 33, 1, 4, 5 };

        Count_Integer_occurences obj = new Count_Integer_occurences();
        obj.CountInteger(arr);

    }
}
