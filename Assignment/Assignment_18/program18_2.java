class Logic
{
  void printEvenNumbers(int n)
    {
       int icnt = 0, isum=0;

       for(icnt=1; icnt<=n; icnt++)
       {
         if(icnt %2 == 0)
         {
                System.out.println(icnt);
         }
       }
        

    }
}


class program18_2
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.printEvenNumbers(20);
        
        
    }
}