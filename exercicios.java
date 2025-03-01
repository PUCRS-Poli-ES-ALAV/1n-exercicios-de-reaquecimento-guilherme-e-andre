import java.util.ArrayList;
import java.util.List;

public class exercicios {
    /**
     * Multiplica dois números naturais usando somas sucessivas através de recursão.
     * 
     * A ideia é que multiplicar num1 por num2 é o mesmo que somar num1 a si mesmo num2 vezes.
     * A função é chamada recursivamente, diminuindo num2 em 1 a cada chamada,
     * até que num2 chegue a 0, acumulando o total.
     * 
     * @param num1 O primeiro número natural a ser multiplicado
     * @param num2 O segundo número natural, representa quantas vezes num1 será somado
     * @return O produto de num1 e num2
     */
    public static int ex1MultiplicarNaturaisSomasSucessivasRec(int num1, int num2) {
        // Se algum input for 0 ou se o decrescimo da recursão chegar a 0, retorna 0
        if(num1 == 0 || num2 == 0) {
            return 0;
        }
        
        return num1 + ex1MultiplicarNaturaisSomasSucessivasRec(num1, num2 - 1);
    }

    /**
     * Calcula a soma de dois números naturais usando recursão,
     * incrementando o primeiro número e decrementando o segundo número em 1 em cada chamada recursiva
     * até que o segundo número se torne 0.
     * 
     * Este método utiliza recursão de cauda para realizar adição através
     * de incrementos sucessivos ao invés de aritmética direta.
     * 
     * @param num1 O primeiro número natural, que será incrementado progressivamente
     * @param num2 O segundo número natural, que será decrementado até chegar a 0
     * @return A soma de num1 e num2
     */
    public static int ex2SomaNaturaisDeUmEmUmRec(int num1, int num2) {
        // Base case: if the second number is 0, return the first number
        if (num2 == 0) {
            return num1;
        }
        
        // Recursive case: increment the first number by 1 and decrement the second number by 1
        return ex2SomaNaturaisDeUmEmUmRec(num1 + 1, num2 - 1);
    }

    /**
     * Calcula o somatório de 1 + 1/2 + 1/3 + ... + 1/n usando recursão.
     * 
     * Este método calcula a soma da série harmônica até o valor n.
     * 
     * @param n O valor limite superior para o somatório
     * @return O resultado do somatório de 1 até 1/n
     */
    public static double ex3CalcucarUmMaisUmMeioSomatorioRec(double n) {
        // Caso base: quando n é 0 ou 1, retorna 1/1 = 1
        if (n <= 1) {
            return 1;
        }

        // Caso recursivo: adiciona 1/n ao resultado da chamada recursiva com n-1
        // Isso calculará a soma de 1/n para todos os inteiros de 1 a n
        // Por exemplo, para n = 3:
        // 1 + 1/2 + 1/3 = 1 + 0.5 + 0.333 = 1.833
        return (1/n) + ex3CalcucarUmMaisUmMeioSomatorioRec(n-1);
    }

    /**
     * Inverte uma string usando recursão.
     * 
     * Este método pega o último caractere da string e o coloca no início,
     * então faz uma chamada recursiva com o restante da string.
     * 
     * @param str A string a ser invertida
     * @return A string invertida
     */
    public static String ex4InverteSringRec(String str) {   
        // Caso base: se a string estiver vazia, retorna uma string vazia
        if (str.isEmpty()) {
            return "";
        }
        
        // Caso recursivo: retorna o último caractere da string
        // concatenado com o resultado da chamada recursiva com o último caractere removido
        return str.charAt(str.length() - 1) + ex4InverteSringRec(str.substring(0, str.length() - 1));
    }   

    /**
     * This method generates a sequence using recursion with the following formula:
     * f(n) = 2 * f(n-1) + 3 * f(n-2), where f(1) = 1 and f(2) = 2.
     * 
     * @param number The position in the sequence to calculate
     * @return The value of the sequence at the given position
     * @throws IllegalArgumentException if number < 1
     */
    public static int ex5GeraSequenciaRec(int number) {
        if (number == 1) {
            return 1;
        } 

        if (number == 2) {
            return 2;
        }

        return 2 * ex5GeraSequenciaRec(number - 1) + 3 * ex5GeraSequenciaRec(number - 2);
    }

    /**
     * Calcula a função de Ackermann usando recursão.
     * A função de Ackermann é uma função recursiva que cresce muito rapidamente e é usada
     * como exemplo de uma função não-primitiva recursiva.
     *
     * A definição matemática da função é:
     * A(m,n) = n+1                  se m=0
     * A(m,n) = A(m-1,1)             se m>0 e n=0
     * A(m,n) = A(m-1,A(m,n-1))      se m>0 e n>0
     *
     * @param number1 O primeiro parâmetro (m) da função de Ackermann
     * @param number2 O segundo parâmetro (n) da função de Ackermann
     * @return O valor da função de Ackermann para os parâmetros fornecidos
     */
    public static int ex6GeraSequenciaAckermanRec(int number1, int number2) {
        if (number1 == 0) {
            return number2 + 1;
        }

        if (number1 != 0 && number2 == 0) {
            return ex6GeraSequenciaAckermanRec(number1 - 1, 1);
        }

        if (number1 != 0 && number2 != 0) {
            return ex6GeraSequenciaAckermanRec(number1 - 1, ex6GeraSequenciaAckermanRec(number1, number2 - 1));
        }
        
        return 0; // This line should never be reached given the conditions above
    }

    /**
     * Calcula a soma dos elementos de um vetor de números inteiros usando recursão.
     * 
     * @param vetor O vetor de números inteiros
     * @param n O tamanho do vetor ou a quantidade de elementos a serem considerados
     * @return A soma dos elementos do vetor
     */
    public static int ex7CalculaSomaVetorRec(int[] vetor, int n) {
        if (n == 0) {
            return 0;
        }

        return vetor[n - 1] + ex7CalculaSomaVetorRec(vetor, n - 1);
    }

    /**
     * Calcula o produto dos elementos de um vetor de números inteiros usando recursão.
     * 
     * @param vetor O vetor de números inteiros
     * @param n O tamanho do vetor ou a quantidade de elementos a serem considerados
     * @return O produto dos elementos do vetor, retorna 1 se o vetor estiver vazio
     */
    public static int ex7CalculaProdutoVetorRec(int[] vetor, int n) {
        if (n == 0) {
            return 1;
        }

        return vetor[n - 1] * ex7CalculaProdutoVetorRec(vetor, n - 1);
    }

    /**
     * Verifica se uma string é um palíndromo utilizando recursão.
     * Um palíndromo é uma string que lida da esquerda para a direita 
     * é igual à mesma string lida da direita para a esquerda.
     * 
     * @param str a string a ser verificada
     * @return true se a string for um palíndromo, false caso contrário
     */
    public static boolean ex8VerificaPalindromoRec(String str) {
        if (str.length() <= 1) {
            return true;
        }

        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        return ex8VerificaPalindromoRec(str.substring(1, str.length() - 1));
    }

    /**
     * Gera todas as permutações das primeiras n letras do alfabeto usando recursão.
     * Por exemplo, para n=3, gera: ABC, ACB, BAC, BCA, CAB, CBA
     * 
     * @param numberLetters O número de letras a serem permutadas
     * @return Uma string contendo todas as permutações separadas por vírgula
     */
    public static String ex9CalculaCombinacoesPrimeirasLetrasRec(int numberLetters) {
        // Caso base: retorna string vazia se a entrada for inválida
        if (numberLetters <= 0) {
            return "";
        }
    
        // Gera a string inicial com as primeiras 'numberLetters' letras do alfabeto
        StringBuilder initialString = new StringBuilder();
        for (int i = 0; i < numberLetters; i++) {
            initialString.append((char) ('A' + i));
        }
    
        // Gera todas as permutações
        List<String> permutations = new ArrayList<>();
        generatePermutations(initialString.toString(), "", permutations);
    
        // Une todas as permutações em uma única string separada por vírgulas
        return String.join(", ", permutations);
    }

    /**
     * Método auxiliar para gerar permutações recursivamente
     * 
     * @param str A string contendo os caracteres restantes a serem permutados
     * @param prefix O prefixo atual da permutação em construção
     * @param permutations A lista onde as permutações serão armazenadas
     */
    private static void generatePermutations(String str, String prefix, List<String> permutations) {
        int n = str.length();
        // Caso base: quando não há mais caracteres para permutar, adiciona o prefixo à lista
        if (n == 0) {
            permutations.add(prefix);
        } else {
            // Caso recursivo: para cada caractere na string
            for (int i = 0; i < n; i++) {
                // Remove o caractere atual e o adiciona ao prefixo, então faz a chamada recursiva
                generatePermutations(str.substring(0, i) + str.substring(i + 1), prefix + str.charAt(i), permutations);
            }
        }
    }

    /**
     * Gera uma sequência de Fibonacci generalizada recursivamente.
     * A sequência de Fibonacci generalizada é definida como:
     * fibg(f0, f1, 0) = f0
     * fibg(f0, f1, 1) = f1
     * fibg(f0, f1, n) = fibg(f0, f1, n-1) + fibg(f0, f1, n-2), para n > 1
     *
     * @param f0 O primeiro valor da sequência
     * @param f1 O segundo valor da sequência
     * @param n A posição na sequência que queremos calcular
     * @return O valor na posição n da sequência de Fibonacci generalizada
     */
    public static int gerarSequenciaFibonacciGeneralizadaRec(int f0, int f1, int n) {
        if (n == 0) {
            return f0;
        }

        if (n == 1) {
            return f1;
        }
        
        return gerarSequenciaFibonacciGeneralizadaRec(f0, f1, n - 1) + gerarSequenciaFibonacciGeneralizadaRec(f0, f1, n - 2);
    }

    public static void main(String[] args) {
        System.out.println("====== Hello, World! ======");

        // Teste do exercício 1
        System.out.println("Multiplicação de 3 por 4: " + ex1MultiplicarNaturaisSomasSucessivasRec(3, 4)); // 12

        // Teste do exercício 2
        System.out.println("Soma de 3 com 4: " + ex2SomaNaturaisDeUmEmUmRec(3, 4)); // 7

        // Teste do exercício 3
        System.out.println("Somatório de 1 + 1/2 + 1/3: " + ex3CalcucarUmMaisUmMeioSomatorioRec(3)); // 1.8333333333333333

        // Teste do exercício 4
        System.out.println("Inversão de 'Hello': " + ex4InverteSringRec("Hello")); // olleH

        // Teste do exercício 5
        System.out.println("Sequência Qualquer para 2, 3: " + ex5GeraSequenciaRec(3)); // 7

        // Teste do exercício 6
        System.out.println("Função de Ackermann para 2, 3: " + ex6GeraSequenciaAckermanRec(2, 3)); // 9

        // Teste do exercício 7
        int[] vetor = {1, 2, 3, 4, 5};
        System.out.println("Soma dos elementos do vetor: " + ex7CalculaSomaVetorRec(vetor, vetor.length)); // 15
        System.out.println("Produto dos elementos do vetor: " + ex7CalculaProdutoVetorRec(vetor, vetor.length)); // 120

        // Teste do exercício 8
        System.out.println("Verificação de palíndromo para 'radar': " + ex8VerificaPalindromoRec("radar")); // true
        System.out.println("Verificação de palíndromo para 'hello': " + ex8VerificaPalindromoRec("hello")); // false

        // Teste do exercício 9
        System.out.println("Permutações das primeiras 3 letras do alfabeto: " + ex9CalculaCombinacoesPrimeirasLetrasRec(3)); // ABC, ACB, BAC, BCA, CAB, CBA
        
        // Teste do exercício 10
        System.out.println("Sequência de Fibonacci generalizada para 0, 1, 5: " + gerarSequenciaFibonacciGeneralizadaRec(0, 1, 5)); // 5
    }
}