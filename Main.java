import java.util.Scanner;
 class Main{
	int largest(int a,int b,int c)
        {
          if(a>b && a>c)
          { return a;}
          else{
          if(b>c) return b;
          else return c;}
        }
        int smallest(int a,int b,int c)
        {
          if(a<b && a<c)
          { return a;}
          else{
          if(b<c) return b;
          else return c;}
        }
  String findingKey(int num1,int num2,int num3)
   {
   int a=0,b=0,c=0;
   String res="";
   String n1=String.valueOf(num1);
   String n2=String.valueOf(num2);
   String n3=String.valueOf(num3);
   for(int i=0;i<4;i++)
   {
      a=(int)n1.charAt(i);
      b=(int)n2.charAt(i);
      c=(int)n3.charAt(i);
      res += String.valueOf(largest(a,b,c)-smallest(a,b,c));
   }
    return res;
   }
}
class Sample{
public static void main(String args[])
{
   Main cs=new Main();
   System.out.println(cs.findingKey(1924,2049,3548));
}
}