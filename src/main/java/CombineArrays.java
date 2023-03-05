import java.util.Arrays;

public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        //Making a new array to have the length of both arr1 and 2
        int[] arr3 = new int[arr1.length + arr2.length];
        //a for loop to loop through the first array and set each element from array 1 and add it to the new array
        for(int i = 0; i<arr1.length; i++){
            arr3[i] = arr1[i];
        }
        // loop through the second array and store the array 2 elements and insert them affter the first array elements Hence if j = 0 and the length for arr1 is 3 then first arr3[0+3] is arr[3] and it will equal arr2[0-3]
        for(int j = 0; j < arr2.length; j++){
            arr3[j + arr1.length] = arr2[j];
        }
            

        //Return the resulting array
       
        return arr3;
    }

}