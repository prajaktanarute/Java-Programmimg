class Logic
{
    void printDivisibleBy2and3(int num)
    {
        int icnt=0;

        

        for(icnt=1; icnt<=num; icnt++)
        {
            if((icnt % 2 == 0) && (icnt % 3 == 0))
            {
                 System.out.println(icnt+"is a divisible by 2 and 3"); 
            }
        
        }
      
    }

}

class program21_5
{
    public static void main(String Args[])
    {
        Logic  obj = new Logic();
        obj.printDivisibleBy2and3(30);
    }
}

