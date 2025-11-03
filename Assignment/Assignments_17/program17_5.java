class Logic
{
  void printTable(int num)
    {
        
        int icnt = 0;

        for(icnt=1; icnt<=10; icnt++)
        {
            System.out.println(num*icnt);
        }

    }
}


class program17_5
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.printTable(5);
    }
}