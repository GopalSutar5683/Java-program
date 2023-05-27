# Java-program
import java.lang.*;

import java.util.*;

public class Main {

public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
int M = inp.nextInt();
inp.close();

if(M%15==0){
    System.out.println("Good Number");
}
else if(M%3==0){
    System.out.println(" Bad Number");
}
else if(M%5==0){
    System.out.println("Poor Number ");
}
else {
    System.out.println("-1");
}
}
}
