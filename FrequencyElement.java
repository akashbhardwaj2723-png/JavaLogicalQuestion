public class FrequencyElement {

    public static void main(String[] args) {

        int arr[] = {1,2,3,2,1,4,5,3,4,5};

        for (int i = 0; i < arr.length; i++) {

            int count = 1;
            boolean duplicate = false;

            for (int k = 0; k < i; k++) {

                if (arr[i] == arr[k]) {
                    duplicate = true;
                }
            }

            if (duplicate == true) {
                continue;
            }

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + " : " + count);
        }
    }
}
