class Counter
{
    static int count=1;
    Counter() 
    {
        System.out.println("Object created! Current count = " + count);
        count++;
    }

    public static void main(String[] args) 
    {
        Counter a=new Counter();
        Counter b=new Counter();
        Counter c=new Counter();
    }
}
