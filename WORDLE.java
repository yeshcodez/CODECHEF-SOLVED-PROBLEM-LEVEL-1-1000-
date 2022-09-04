import java.util.*;
class Main{
    public static void main (String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            char[] S=sc.next().toCharArray();
            char[] T=sc.next().toCharArray();
            for(int i=0;i<S.length;i++){
                for(int j=0;j<T.length;j++){
                if(S[i]==T[j])
                System.out.println("G");
                else
                System.out.println("B");
                break;
            }
            System.out.println();
        }
        
    }
}
}
