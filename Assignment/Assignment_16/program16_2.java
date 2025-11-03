class Logic
{
  void CheckEvenOdd(int num)
    {
       if(num % 2 == 0)
       {
         System.out.println(" It is  Even number");
       }
       else
       {
         System.out.println(" It is Odd number");
       }  
   
    }
}

class program16_2
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.CheckEvenOdd(7);
    }
}