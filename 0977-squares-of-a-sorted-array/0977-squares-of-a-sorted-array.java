class Solution 
{
    public int[] sortedSquares(int [] nums)
    {
        int n=nums.length;
        int [] result=new int[n];
        int left=0;
        int right=n-1;
        int k=n-1;

        while(left<=right)
        {
           int left_sorted=nums[left]*nums[left];
           int right_sorted=nums[right]*nums[right];

           if(left_sorted>right_sorted)
           {
            result[k]=left_sorted;
            left++;

           }
           else
           {
            result[k]=right_sorted;
            right--;

           }
           k--;




        }

        return result;





    }
}


/*class Solution {
    public int[] sortedSquares(int[] nums) {

        int result[]=new int [nums.length];


        for(int i=0;i<nums.length;i++)
        {
            result[i]=nums[i]*nums[i];

        }

        Arrays.sort(result);
        return result;

        
    }
}*/