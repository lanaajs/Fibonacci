public class Fibonacci_SemRecursividade {

    public static void fibo() {
		
        int n=10;

        int[] fibo = new int[n];
        fibo[0] = 0;
        fibo[1] = 1;

        for(int i=2; i<n ; i++){
            fibo[i] = fibo[i-1] + fibo[i-2];
        }

        for(int i=0; i<n; i++){
            System.out.print(fibo[i] + "-");
        }
	}

    public static void main(String[] args) throws Exception {
        fibo();
    }
}
