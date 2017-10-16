import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner in= new Scanner(System.in);
int x,y,suma,sumb;
System.out.printf("請輸入x:");
x=in.nextInt();
System.out.printf("請輸入y:");
y=in.nextInt();
suma=x+y;
sumb=x*y;
System.out.printf("suma=%d\n",suma);
System.out.printf("sumb=%d\n",sumb);
in.close();

    }
}
