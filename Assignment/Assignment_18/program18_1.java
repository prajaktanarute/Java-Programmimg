class Logic
{
  void checkPrime(int num)
    {
       
       int icnt=0;
       boolean bFlag = true;

       if(num < 0)
       {
        num = -num;
       } 

       for(icnt=2; icnt<=(num / 2); icnt++)
       {
        if((num % icnt) == 0)
        {
            bFlag = false;
            break;
        }
       }

       if(bFlag == true)
       {
         System.out.println(" It is prime number");
       }

       else
       {
        System.out.println(" It is not prime number");
       }

    }
}


class program18_1
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
        
        
    }
}