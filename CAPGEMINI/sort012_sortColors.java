public class sort012_sortColors {
    
// Only 0, 1, 2 means Dutch National Flag / 3 pointer approach. O(n) time and O(1) space

    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

while(mid<=high){
        if(nums[mid] == 0){
            //swap mid and low
            int temp = nums[low];
            nums[low] = nums[mid];
            nums[mid] = temp;
            low++;
            mid++;
        }
        else if(nums[mid] == 1){
            // 1 is middle element only so don't swap, just go to next number so mid++
            mid++;
        }
        else{
            // swap mid and high
            int temp = nums[mid];
            nums[mid] = nums[high];
            nums[high] = temp;
            high--;
        }
    }
    }
}