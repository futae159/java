function getSecondLargest(nums) {
    var largest = 0;
    var secondLargest = 0;
    nums.sort();
    
    for(var i=0;i<nums.length;i++) {
        if (nums[i] > largest) {
            largest = nums[i];
        } else if (nums[i] > secondLargest) {
            secondLargest = nums[i];            
        }
        
    }
    return secondLargest;
}


function main() {
    const n = +(readLine());
    const nums = readLine().split(' ').map(Number);
    
    console.log(getSecondLargest(nums));
}
