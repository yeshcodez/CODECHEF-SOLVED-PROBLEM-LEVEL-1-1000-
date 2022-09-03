import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	
	 
	    int n=sc.nextInt();
	    for(int i=1;i<=n;i++){
	        int a=sc.nextInt();
	        int temp;
	        temp=a;
	        int sum=0;
	        while(a!=0){
	        int r=a%10;
	        sum=sum*10+r;
	        a=a/10;
	    }
	    if(temp==sum)
	    System.out.println("win");
	    else
	    System.out.println("lose");
	    
	}
}
}
