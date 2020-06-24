public class Recursion3 {
    void hanoi(int n, String A, String B, String C){   //n은 원판개수, 기둥은 A B C, 원판은 작은순서대로 1, 2, 3, 4,....
        if(n == 1){
            System.out.println(A + "에 있는 원판 1을 " + C + "으로 이동");
        }
        else{
            hanoi(n-1, A, C, B);    //n==1에 도달하면 A의 원판을 B로 이동시켜야하니까 매개변수 순서 변경
            System.out.println(A + "에 있는 원판 " + n + "을 " + C + "으로 이동");
            hanoi(n-1, B, A, C);
        }
    }
}
