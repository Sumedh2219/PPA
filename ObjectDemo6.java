
class ObjectDemo5
{
    public static void main(String Arr[])
    {
        
        String s1 = "Marvellous";
        String s2 = new String("Marvellous");

        if(s1 == s2)
        {
            System.out.println("Strings are equal");

        }
        else
        {
            System.out.println("Strings Are diffrent");
        }

        if(s1.equals(s2))
        {
            System.out.println("Strings are equal");
        }
        else
        {
             System.out.println("Strings are diffrent");
        }
    }
}