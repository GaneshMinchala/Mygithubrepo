class Maths
{
    public static void main(String[] args) 
    {
        System.out.println(add(2,3,5,5));
    }
    public static int add (int ...a)
    {
        int total=0;
        for(int i : a)
        {
            total = total+i;
        }
        return total;
    }
}