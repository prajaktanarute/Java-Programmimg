class Logic
{
  void findSmallestDigit(int num)
    {
       
        int iDigit=0, smallestDigit=9;

        while(num != 0)
        {
            iDigit = num % 10;
            if(iDigit < smallestDigit)
            {
                smallestDigit = iDigit;
            }
            num = num / 10;
        }
        System.out.println("The smallestDigit Digit is : "+smallestDigit);
    
        
        
    

    }
}


class program20_5
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.findSmallestDigit(45872);
        
        
    }
}