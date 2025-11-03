class Logic
{
  void reverseNumber(int num)
    {
       int ireverceno = 0, iDigit = 0;
        

        while(num != 0)
        {
            iDigit= num % 10;
            ireverceno= ireverceno * 10 + iDigit;
            num = num / 10;


        }

        System.out.println("reverse number is :"+ireverceno);
        
   
    }
}


class program16_4
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.reverseNumber(1234);
    }
}