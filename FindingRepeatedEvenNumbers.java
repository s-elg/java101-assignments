package assignments;

import java.util.Arrays;

public class FindingRepeatedEvenNumbers {

    static boolean isFind(int[] arr, int value) {
        for (int i: arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {5,5,2,7,6,41,85,2,96,96,3,5,4,7,4,18,3,18};
        int[] evenDuplicates = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && list[i] == list[j]) {
                    if (!(isFind(evenDuplicates, list[i]))) {
                        if (list[i] % 2 == 0) {
                            evenDuplicates[startIndex++] = list[i];

                        }
                    }
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(evenDuplicates));

    }
}
