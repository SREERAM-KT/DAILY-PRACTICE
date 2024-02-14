import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement2 {
    public static int[] nextGreaterElement(int[] array) {
        int size = array.length; 
        Stack<Integer> stack = new Stack();
        for(int index = size - 1; index >= 0; index--){
            stack.push(index);
        }
        int[] result = new int[size];
        for(int index = size - 1; index >= 0; index--){
            result[index] = -1;
            while(!stack.isEmpty() && array[stack.peek()] <= array[index]){
                stack.pop();
            }
            if(!stack.isEmpty()) {
                result[index] = array[stack.peek()];
            }
            stack.push(index);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();
        int[] array = new int[size];
        for (int index = 0; index < size; index++) {
            array[index] = sc.nextInt();
        }
        int[] result = nextGreaterElement(array);
        for (int index = 0; index < size; index++) {
            System.out.print(result[index]+" ");
        }
    }
}
