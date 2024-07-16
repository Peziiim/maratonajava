package maratonajavadevdojo.exception.runtime.test;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try{
    throw new ArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ERROO ARRAY");
        }catch (IndexOutOfBoundsException e){
            System.out.println("ERRO INDEX");
        }catch (IllegalAccessError e){
            System.out.println("ERRO ILLEGAL");
        }
    }
}
