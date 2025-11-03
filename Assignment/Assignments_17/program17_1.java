class Logic
{
  void sumOfDigits(int num)
    {
       int isum = 0, iDigit = 0;
        

        while(num != 0)
        {
            iDigit= num % 10;
            isum= isum + iDigit;
            num = num / 10;


        }

        System.out.println("sum of Digits of a number is :"+isum);
        
   
    }
}


class program17_1
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.sumOfDigits(121);
    }
}