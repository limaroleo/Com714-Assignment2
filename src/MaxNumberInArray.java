public class MaxNumberInArray {

    public static void main(String[] args) {
        int[] array = {5,2,9,1,6,7};
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

                System.out.println("The maximum number in the array is: " + max);
            }
        }
    }
}
