import java.util.Scanner; 
import java.util.Stack;

public class NextGreaterElement3 {
    public static int nextGreaterElement(int number) {
        char[] digitArray = ("" + number).toCharArray();
        int index = digitArray.length - 2;
        while (index >= 0 && digitArray[index + 1] <= digitArray[index]) {
            index--;
        }
        if (index < 0)
            return -1;
        int jIndex = digitArray.length - 1;
        while (jIndex >= 0 && digitArray[jIndex] <= digitArray[index]) {
            jIndex--;
        }
        swapValues(digitArray, index, jIndex);
        reverseValues(digitArray, index + 1);
        try {
            return Integer.parseInt(new String(digitArray));
        } catch (Exception e) {
            return -1;
        }
    }

    public static void reverseValues(char[] digitArray, int start) {
        int index = start, jIndex = digitArray.length - 1;
        while (index < jIndex) {
            swapValues(digitArray, index, jIndex);
            index++;
            jIndex--;
        }
    }

    public static void swapValues(char[] digitArray, int index, int jIndex) {
        char temp = digitArray[index];
        digitArray[index] = digitArray[jIndex];
        digitArray[jIndex] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        number = sc.nextInt();
        int result = nextGreaterElement(number);
        System.out.println(result);
    }
}

