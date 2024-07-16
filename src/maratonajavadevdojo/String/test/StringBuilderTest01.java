package maratonajavadevdojo.String.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Eduardo Oliveira";
        nome.concat("pica");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Eduardo Oliveira");
        sb.append(" pica");
        sb.reverse();
        System.out.println(sb.toString());
    }
}
