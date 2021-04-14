package arrays;
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

        public static int findSingle(int[] nums) {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            int answer = 0;

            for(int i = 0; i < nums.length; i++){
                int count = map.containsKey(nums[i]) ? map.get(nums[i]) : 0;

                if(map.get(nums[i]) != null){
                    map.put(nums[i], count + 1);
                } else {
                    map.put(nums[i], 1);
                }
            }

            for(int i = 0; i < nums.length; i++){
                if(map.get(nums[i]) == 1){
                    answer = nums[i];
                }
            }
            return answer;
        }

}
    

