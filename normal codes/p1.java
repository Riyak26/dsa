public class p1 {

    public static void main(String[] args) {

        int arr[] = {1, 2, 1, 3, 2, 1};

        int a = 1;
        int b = 2;
        int c = 3;

        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            // count frequency
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // check first occurrence (important fix)
            boolean first = true;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    first = false;
                    break;
                }
            }

            // your logic with a, b, c
            if (first) {
                if (count == a || count == b || count == c) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}