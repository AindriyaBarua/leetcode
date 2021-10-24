import java.util.*;
import java.util.Arrays;

class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] == target - nums[i]){
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{};
    }
public static void main(String[] args)
{
	System.out.println(twoSum([1,2,3], 4););
}
}