class Base
{
      public int A,B;

      public Base()
      {
        System.out.println("Inside Base Constructor");

      }

      public void Fun()
      {
        System.out.println("Insude Base Fun");
      }
}

class Derived extends Base                                     // class Derived : public Base (in C++)
{
     public int X,Y;

     public Derived()
     {
        System.out.println("Inside Derived Constructor");
     }

     public void Gun()
      {
        System.out.println("Insude Base Gun");
      }


}

class SingleLevel
{
    public static void main(String Arr[])
    {
        System.out.println("Inside MAin Function");
         Derived dobj = new Derived();

         dobj.Fun();
         dobj.Gun();
    }
}