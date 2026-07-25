class Binary_search {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        int mid;
       while(start <= end){
            mid = (start + end)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid]<target){ 
                start = mid+1;
                // move right ie 2nd half of the array, thus end remains same n-1 but start changes to mid+1
               // Target is greater than nums[mid].
            
                 
            }
            else{ // nums[mid]>target
                end = mid-1;
                // in 1st iteration - move left ie 1st half of the array, thus start remains same 0 but end changes to mid-1
               // Target is smaller than nums[mid].
             
            }
        }
        return -1;
    }
}

// Current search range = [start ... end]

// nums[mid] < target
// → Throw away the left half (including mid)
// → start = mid + 1

// nums[mid] > target
// → Throw away the right half (including mid)
// → end = mid - 1