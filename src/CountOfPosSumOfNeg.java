public class CountOfPosSumOfNeg {
    public static int[] countPositivesSumNegatives(int[] input){

        if (input == null || input.length == 0) {
            return new int[0];
        }

        int[] sums = new int[2];
        int count = 0;

        for (int i : input) {
            if (i > 0) {
                count++;
            }

            if (i < 0) {
                sums[1] += i;
            }
        }

        sums[0] = count;
        return sums;
    }
}

//Given an array of integers.
//
//Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.
//
//If the input is an empty array or is null, return an empty array.
//
//Example
//For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].