import java.util.Scanner;
import java.util.ArrayList;
class CSK
{
public static void main(String... args)
{
	int i=0;
Scanner sc=new Scanner(System.in);
ArrayList<Integer> obj=new ArrayList<>();
int size=sc.nextInt();
for(i=0;i<size;i++)
{
obj.add(sc.nextInt());
}
int sum=0;
float avg=0;
for(i=0;i<size;i++)
{
sum=sum+obj.get(i);
}
avg=sum/size;
System.out.println(sum);
System.out.println(avg);
}
}