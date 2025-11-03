class Logic
{
  void checkLeapyear(int year)
    {
       

       if((year % 4 == 0) && (year % 400 == 0) || (year % 100 != 0))
       {
         System.out.println(year+"is a leap year");
       }

       else
       {
        System.out.println(year+"is not a year");
       }
        

    }
}


class program19_1
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.checkLeapyear(2024);
        
        
    }
}