class Logic
{
  void findMin(int a, int b, int c)
    {
       
        if(a < b && a < c)
        {
            System.out.println("Minimum numberis :"+a);
        }

        else if(b < a && b < c)
        {
            System.out.println("Minimum numberis :"+b);
        }

        else
        {
             System.out.println("Minimum numberis :"+c);
        }

    }
}


class program17_4
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.findMin(3,7,2);
    }
}