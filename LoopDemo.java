class LoopDemo
{
    public static void main(String Arg[])
    {
         int i = 0;
          
          System.out.println("Output By using For Loop");
         for(i = 1; i<=5; i++)
         {
            System.out.println(i);
         }
          
          System.out.println("Output By using while loop");
         i = 1;
         while(i<=5)
         {
            System.out.println(i);
            i++;
         }

         System.out.println("Output By using do-while loop");
         i = 1;
         do
         {
            System.out.println(i);
            i++;
         }while(i<= 5);

    }
}