import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StackSolution {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        scn.nextLine();
        for(int i = 0; i < N; i++){
            String str = scn.nextLine();
            switch(str.charAt(0)){
                case '1':
                    int x = Integer.parseInt(str.substring(2));
                    stack.push(x);
                case '2':
                    stack.pop();
                case '3':
                    Iterator<Integer> it = stack.iterator();
                    int max = stack.peek();
                    while(it.hasNext()){
                        int y = it.next();
                        if(y > max){
                            max = y;
                        }
                    }
                    System.out.println(max);
                default:
                    break;
            }
        }
        scn.close();
    }
}