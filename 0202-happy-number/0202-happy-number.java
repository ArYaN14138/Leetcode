class Solution {
    public boolean isHappy(int n) {

        int slow=n;
        int fast= next(n) ;// which mean that it is n.next but due to computation error we can't write that

        while(fast !=1 && slow!=fast)
        {
            slow=next(slow);

            fast=next(next(fast));
            

        }

        return fast==1;

        
    }
     private int next(int n)
        {

            int sum=0;
            while(n>0)
            {

                int digit=n%10;
                sum=sum+digit*digit;

                n=n/10;

            }

            return sum;
        }
}

  /* while(n!=1 && n!= 4)
        {
            n=Square_of_sum(n);

        }

        return n==1;
    }
        private int Square_of_sum(int n)
        {

            int sum=0;
            while(n>0)
            {

                int digit=n%10;
                sum=sum+digit*digit;

                n=n/10;

            }

            return sum;
*/