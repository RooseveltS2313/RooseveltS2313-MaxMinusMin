
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
        int  high = nums.get(0);
        int low = nums.get(0);
        int amt = nums.size();

        for ( int i = 1; i < amt; i++){
            if ( nums.get(i) < low){
                low = nums.get(i);
            } else if (nums.get(i) > high){
                high = nums.get(i);
            }
        }
        return high-low;
    }
}
