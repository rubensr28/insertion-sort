
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] toSort= {598457, 45678, 1236, 984, 65, 1};
        InsertionSort s = new InsertionSort();

        s.sort(toSort);
        System.out.println(Arrays.toString(toSort));
    }
}