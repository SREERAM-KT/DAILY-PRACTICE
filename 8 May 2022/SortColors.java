import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class SortColors {
    public static void sortColors(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        map.put(1, 0);
        map.put(2, 0);
        for(int num : nums) {
            map.put(num, map.get(num)+1);
        }
        int i=0;
        for(;i<map.get(0);i++)
            nums[i] = 0;
        for(;i<map.get(0)+map.get(1);i++)
            nums[i] = 1;
        for(;i<map.get(0)+map.get(1)+map.get(2);i++)
            nums[i] = 2;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[] nums = new int[size];
        for(int i=0;i<size;i++){
            nums[i]=scanner.nextInt();
        }
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
