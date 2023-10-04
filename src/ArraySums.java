public class ArraySums {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {

        int arrOneSum = 0;
        int arrTwoSum = 0;

        for (int i = 0; i < arr1.length; i++){
            arrOneSum += arr1[i];

        }

        for (int i = 0; i < arr2.length; i++){
            arrTwoSum += arr2[i];
        }

        return arrOneSum + arrTwoSum;

    }
}


// calculate the sum of each arrays elements