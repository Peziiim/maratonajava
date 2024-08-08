package maratonajavadevdojo.regex.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexTest05 {
    public static void main(String[] args) {
        System.out.println(soupica("abcabcabcac"));
    }

    public static int soupica(String s) {
        for (int i = 1; i <= s.length(); i++) { // Começa de 1 para evitar substrings vazias
            for (int j = 0; j <= s.length() - i; j++) {
                String substring = s.substring(j, j + i);
                if (isUnique(substring)) {
                    return substring.length();
                }
            }
        }
        return 0; // Retorna uma string vazia se nenhuma substring válida for encontrada
    }

    // Função para verificar se a substring tem caracteres únicos
    public static boolean isUnique(String substring) {
        Set<Character> seen = new HashSet<>();
        for (char c : substring.toCharArray()) {
            if (!seen.add(c)) {
               return true;    // Retorna false se encontrar um caractere repetido
            }
        }
           return false;
    }
}