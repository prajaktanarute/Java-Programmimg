class Logic
{
    void displayFactors(int num)
    {
        int icnt=0;

        if(num < 0)
        {
            num = -num;
        }

        for(icnt=1; icnt<=num; icnt++)
        {
            if((num % icnt) == 0)
            {
                System.out.println(icnt);
            }
        
        }
        
    }

}

class program21_3
{
    public static void main(String Args[])
    {
        Logic  obj = new Logic();
        obj.displayFactors(12);
    }
}

