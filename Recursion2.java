public class Recursion2 {
    int fibo1(int n){   //재귀를 이용한 피보나치
        int result = 0;

        if(n==0){
            result = 0;
        }
        else if(n==1){
            result = 1;
        }
        else{
            result = fibo1(n-1) + fibo1(n-2);
        }
        //System.out.println(result);
        return result;
    }

    int fibo2(int n){   //반복을 이용한 피보나치
        int result = 0;

        if(n==0){
            result = 0;
        }
        else if(n==1){
            result = 1;
        }
        else{
            int temp = 0;
            int last1 = 1;
            int last2 = 0;
            for(int i = 0; i<=n-2; i++){
                temp = last1 + last2;
                last2 = last1;
                last1 = temp;
                result = temp;
            }
        }
        return result;
    }
}
