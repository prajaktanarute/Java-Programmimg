class Logic
{
  void findLargestDigit(int num)
    {
       
        int iDigit=0, largestDigit=0;

        while(num != 0)
        {
            iDigit = num % 10;
            if(iDigit > largestDigit)
            {
                largestDigit = iDigit;
            }
            num = num / 10;
        }
        System.out.println("The largest Digit is : "+largestDigit);
    
        
        
    

    }
}


class program20_4
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
        
        
    }
}