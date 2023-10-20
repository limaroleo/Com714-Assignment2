public class AnotherArray {

    public static void main(String[] args) {
        int[] integerArray;// Declared an array
       integerArray = new int[8]; //initialized array with size of 8 elements

        int[] myArray = new int[3]; //0->7|1->43|2->55
        //Create data/Add data
        //Read data
        //Update data
        //Delete/Remove data
        //Find data

        //CREATE/INSERT
     //   myArray[0] = 7;
     //   myArray[1] = 43;
      //  myArray[2] = 55;

        //READ
     //   System.out.println(myArray[3-1]);

        //UPDATE
     //   myArray[2] = 77;
     //   System.out.println("updated last value is: "+myArray[2]);

        integerArray = new int[]{6, 89, 78, 8, 28, 65, 2, 45}; //Linear search

        for (int i = 0; i < integerArray.length; i++) {
            if(integerArray[i] % 2 == 1){
                System.out.println(integerArray[i]+ " is an odd number");
            }

            if(integerArray[i] == 78){
                System.out.println("Found 78 at "+i);
            }
        }

    }
}
