import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
class Raina{
public static void main(String... args)
{
Scanner sc=new Scanner(System.in);
ArrayList<Integer> obj=new ArrayList<>();
int matches=sc.nextInt();
for(int i=0;i<matches;i++)
obj.add(sc.nextInt());
Collections.sort(obj);
for(int i:obj)
	System.out.println(i);
}
}
	