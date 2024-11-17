class Base
{
      public int A,B;

      public Base()
      {
        System.out.println("Inside Base Constructor");

      }

      public void Fun()
      {
        System.out.println("Inside Base Fun");
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
        System.out.println("Inside Base Gun");
      }


}

class DerivedX extends Base
{
    public int P,Q;

     public DerivedX()
     {
        System.out.println("Inside DerivedX Constructor");
     }

     public void Sun()
      {
        System.out.println("Inside Base Sun");
      }
}

class Hirarcal
{
    public static void main(String Arr[])
    {
        System.out.println("Inside Main Function");
         Derived dobj1 = new Derived();
         DerivedX dobj2 = new DerivedX();

         dobj1.Fun();
         dobj1.Gun();

         dobj2.Fun();
         dobj2.Sun();
    }
}