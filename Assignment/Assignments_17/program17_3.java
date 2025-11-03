class Logic
{
  void findMax(int a, int b)
    {
       
        if(a > b)
        {
            System.out.println("Maximum numberis :"+a);
        }

        else
        {
            System.out.println("Maximum numberis :"+b);
        }

    }
}


class program17_3
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.findMax(20,15);
    }
}