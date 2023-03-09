import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        String inpuString = sc.nextLine();

        // extracting values from the string
        int []array = Arrays.stream(inpuString.split(",")).mapToInt(Integer::parseInt).toArray();

        // printing revered array
        System.out.println(Arrays.toString(ReverseArray.reverseArray(array)));

        // closing resource
        sc.close();
    }
}