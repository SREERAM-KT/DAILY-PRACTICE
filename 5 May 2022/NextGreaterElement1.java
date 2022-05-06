import java.util.Scanner; 
import java.util.HashMap;

public class NextGreaterElement1 {
    public static int[] nextGreaterElement(int[] array1, int[] array2) {
        HashMap<Integer, Integer> hashing = new HashMap<>();
        for (int index = 0; index < array2.length; index++) {
            hashing.put(array2[index], index);
        }
        int[] result = new int[array1.length];
        int jIndex;
        for (int index = 0; index < array1.length; index++) {
            for (jIndex = hashing.get(array1[index]) + 1; jIndex < array2.length; jIndex++) {
                if (array1[index] < array2[jIndex]) {
                    result[index] = array2[jIndex];
                    break;
                }
            }
            if (jIndex == array2.length) {
                result[index] = -1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1, size2;
        size1 = sc.nextInt();
        size2 = sc.nextInt();
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];
        for (int index = 0; index < size1; index++) {
            array1[index] = sc.nextInt();
        }
        for (int index = 0; index < size2; index++) {
            array2[index] = sc.nextInt();
        }
        int[] result = nextGreaterElement(array1, array2);
        for (int index = 0; index < result.length; index++) {
            System.out.print(result[index]+" ");
        }
    }
}
