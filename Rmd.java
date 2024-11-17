class Base
{
      public int A,B;

     

      public void Fun()
      {
        System.out.println("Insude Base Fun");
      }

      public void Gun()
      {
        System.out.println("Inside Base Gun");
      }

      public void Sun()
      {
        System.out.println("Inside Base Sun");
      }

      public void Run()
      {
        System.out.println("Inside Base Run");
      }
}

class Derived extends Base                                     
{
     public int X,Y;

     

     

      public void Fun()
      {
        System.out.println("Insude Derived Fun");
      }

      public void Mun()
      {
        System.out.println("Inside Derived Mun");
      }

      public void Sun()
      {
        System.out.println("Inside Derived Sun");
      }

      public void Bun()
      {
        System.out.println("Inside Derived Bun");
      }


}

class Rmd
{
    public static void main(String Arr[])
    {
         Base bobj = new Derived();         // Upcasting

         bobj.Fun();         // Derived Fun
         bobj.Gun();         // Base Gun
         bobj.Sun();         // Derived Sun
         bobj.Run();         // Base Run
       //  bobj.Mun();         // Error
       //  bobj.Bun();         // Error
    }   
}



// Base bobj = new Base()            No Casting
// Derived dobj = new Derived()      No Casting
// Base bobj = new Derived()         Upcasting
// Derived dobj = new Base()         Downcasting(Not allowed)