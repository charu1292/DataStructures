package Leet_code;
//https://leetcode.com/problems/asteroid-collision/
import java.util.Stack;

public class AsteroidCollision {
                public static int[] asteroidCollision(int[] asteroids) {
                    //Take a stack
                    Stack<Integer> myStack=new Stack<>();

                    for(int a:asteroids){
                        //if a number is negative it means it runs in opposite direction and will never collide
                        if(a>0){
                            myStack.push(a);
                        }
                        else{
                            //
                            while(!myStack.isEmpty() && myStack.peek()>0 && myStack.peek()<Math.abs(a)){
                                myStack.pop();
                            }
                            //if a number is positive it means it runs in same direction and will never collide
                            if(myStack.isEmpty()||myStack.peek()<0){
                                myStack.push(a);
                            }
                            else if(myStack.peek() +a ==0){
                                myStack.pop();
                            }
                        }
                    }

                    int[] res=new int[myStack.size()];
                    int i=myStack.size()-1;
                    while(!myStack.isEmpty()){
                        res[i--]=myStack.pop();

                    }
                    return res;
                }



    public static void main(String[] args) {
        int[] asteroids = {5,10,-5};
        int[] result=asteroidCollision(asteroids);
        for (int i:result){
            System.out.print(i + " ");
        }
    }
    }
