class Logic
{
  void calculatePower(int base, int exp)
    {
       
        int i=0,  result=1;

        for(i=1; i<=exp; i++)
        {
            result=result*base;
        }

        System.out.println(result);  
    

    }
}


class program19_4
{
    public static void main(String Args[])
    {
        Logic obj = new Logic();
        obj.calculatePower(2,5);
        
        
    }
}