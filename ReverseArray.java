public class ReverseArray {
    public static int[] reverseArray(int []array) {
        
        // reversing a array
        for(int i = 0; i <= array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        // returning reversed array
        return array;
    }
}