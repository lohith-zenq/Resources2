class Pat
{
   public static void main(String args[])

{

    int num=2019,rev=0,rem;
    while(num>0)
{
    rem=num%10;
num=num/10;
rev=rev*10+rem;
}
System.out.println(rev);
}
}