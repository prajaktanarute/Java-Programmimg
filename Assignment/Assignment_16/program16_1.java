class Logic
{
    public void calculateSum(int n)
    {

        int icnt = 0, isum = 0;

       for(icnt=1; icnt<=n; icnt++)
       {
           isum=isum+icnt;
          
       }
        System.out.println("sum of First number is : "+isum);
   
    }
}

class program16_1
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.calculateSum(10);
    }
}