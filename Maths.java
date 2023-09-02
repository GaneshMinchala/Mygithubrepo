class Maths
{
    public static void main(String[] args) 
    {
        System.out.println(add(2,3,5,5));
        System.out.println(mul(2,3,5,5));
        System.out.println(sub(10,20));
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
     public static int mul (int ...a)
    {
        int total=1;
        for(int i : a)
        {
            total = total*i;
        }
        return total;
    }
    public static int sub(int a, int b)
    {
        return a-b;
    }
}