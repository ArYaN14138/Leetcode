class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxending=0;
        int minending=0;

        int maxsum=0;
        int minsum=0;


        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];

            maxending=Math.max(num,maxending+num);
            minending=Math.min(num,minending+num);

            maxsum=Math.max(maxsum,maxending);
            minsum=Math.min(minsum,minending);


        }

        return Math.max(Math.abs(maxsum),Math.abs(minsum));


        
    }
}