public class SumOfArray {

    public static void main(String[] args){
        int[] array = {5, 1, 2, 9, 7, 3};
        int sum = 0;

        for (int num : array){
            sum += num;
            System.out.println("The sum of all numbers in the array is: " + sum);
        }
    }
}
