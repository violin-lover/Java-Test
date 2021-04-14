package arrays;
import java.util.*;

public class Duplicate{
public static boolean containsDupes(int[] nums){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(list.contains(nums[i])){
                return true;
            } else{
                list.add(nums[i]);
            }
        }
        return false;
    }
}