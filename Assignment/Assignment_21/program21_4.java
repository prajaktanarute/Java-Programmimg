class Logic
{
    void countFactors(int num)
    {
        int icnt=0, icount = 0;

        if(num < 0)
        {
            num = -num;
        }

        for(icnt=1; icnt<=num; icnt++)
        {
            if((num % icnt) == 0)
            {
                icount++;
            }
        
        }
       System.out.println("Number of factors are :"+icount); 
    }

}

class program21_4
{
    public static void main(String Args[])
    {
        Logic  obj = new Logic();
        obj.countFactors(20);
    }
}

