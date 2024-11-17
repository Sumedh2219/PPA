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

class DerivedX extends Derived
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

class MultiLevel
{
    public static void main(String Arr[])
    {
        System.out.println("Inside MAin Function");
         DerivedX dobj = new DerivedX();

         dobj.Fun();
         dobj.Gun();
         dobj.Sun();
    }
}