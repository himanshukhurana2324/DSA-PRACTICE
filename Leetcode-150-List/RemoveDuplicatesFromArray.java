/**
 * RemoveDuplicatesFromArray
 */
public class RemoveDuplicatesFromArray {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;

        int uniqueIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]) {
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }

        // nums[0]= nums[0+5] ;

        return uniqueIndex + 1;
    }
}
