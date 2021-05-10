public class Recursion1 {
    int factorial(int n){
       int result = 0;
       // System.out.println(n + "! 의 결과는");
        if(n>1){
           result = n*factorial(n-1);
        }
        else{
           result = 1;
        }
       //System.out.println(n + "! 의 결과는");
        return result;
    }
}
