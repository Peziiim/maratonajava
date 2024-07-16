package maratonajavadevdojo.exception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        System.out.println(divisao(1, 0));
    }

    private static int divisao(int a, int b) {
      if(b == 0){
          throw new RuntimeException("Burrão");
      }
        return a/b;
    }
}
