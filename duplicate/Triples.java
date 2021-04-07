package duplicate;
import java.util.*;

public class Triples {
    public static void main(String[] args){
        int[] nums = {1,1,1,2,3,3,3,4,4,4,5,5,5};
        System.out.println(Triples.findSingle(nums));
    }

    /*public static int findSingle(int[] nums){
        int answer = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != nums[i++] && nums[i] != nums[i--]){
                answer += nums[i];
            }
        }

        return answer;
    }*/

    public static int findSingle(int[] nums){
        ArrayList<Integer> list = new ArrayList<Integer>();
        int answer = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(list.get(nums[i]) != null){
                list.add(nums[i], list.get(nums[i]++));
            } else {
                list.add(nums[i], 1);
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(list.get(nums[i]) == 1){
                answer += nums[i];
            }
        }

        return answer;
    }
}
