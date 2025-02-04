
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        int maximum = nums.get(1);
        int minimum = nums.get(1);
        for(int i = 0; i<nums.size(); i++){
            if(nums.get(i) > maximum){
                maximum = nums.get(i);
            }
            else if(nums.get(i) < minimum){
                minimum = nums.get(i);
            }
        }
        return maximum - minimum;
    }
}
