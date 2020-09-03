import java.util.Scanner;
import java.util.ArrayList;
class Venues{
public static void main(String... args)
{
int count=0;
Scanner sc=new Scanner(System.in);
ArrayList<String> obj=new ArrayList<>();
int size=sc.nextInt();
for(int i=0;i<size;i++){if(i==0)sc.nextLine();
obj.add(sc.nextLine());}
String s=sc.nextLine();
for(int i=0;i<size;i++)
{
if(s.equals(obj.get(i)))
count=count+1;
}
System.out.println(count);
}
}