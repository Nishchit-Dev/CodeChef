import java.util.*;
import java.util.Scanner;

 class Main {
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
             int test = in.nextInt();
        int x , y , z ;
        try{
        for(int i = 0 ; i < test ; test++){
            x = in.nextInt();
            y = in.nextInt();
            z = in.nextInt();
             
            // int possible_points = x + (z*2);
            
            if(x+(z*2) >= y){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        
        }catch(Exception e ){
            return;
        }
        
    }
}