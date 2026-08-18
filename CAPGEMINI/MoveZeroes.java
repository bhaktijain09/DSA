class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i=0; i<nums.length; i++){
            if (nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}


// Logic -
// Traverse the array using i. If the element is not 0,
// swap nums[i] with nums[j].
// j starts from 0 because the first non-zero element
// should be placed at index 0.
// After every swap, increment j because the current
// position is filled and j moves to the next position
// for the next non-zero element.

// i - traverses the array
// j - position where the next non-zero should go

//core logic: Find i = non-zero then swap with j then increment j