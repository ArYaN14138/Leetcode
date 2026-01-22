class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int circular_min=0;
        int circular_max=0;

        int max_sum=nums[0];
        int min_sum=nums[0];

        int totalsum=0;


        int n=nums.length;

        for(int i=0;i<n;i++)
        {
            int num=nums[i];

            circular_max=Math.max(num,num+circular_max);
            max_sum=Math.max(max_sum,circular_max);

            circular_min=Math.min(num,circular_min+num);
            min_sum=Math.min(min_sum,circular_min);

            totalsum +=num;


        }

        if(max_sum<0)
        {
            return max_sum;

        }

        return Math.max(max_sum,totalsum-min_sum);




        
    }
}