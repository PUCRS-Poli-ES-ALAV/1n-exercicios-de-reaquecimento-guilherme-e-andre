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

    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Teste do exercício 1
        System.out.println("Multiplicação de 3 por 4: " + ex1MultiplicarNaturaisSomasSucessivasRec(3, 4)); // 12

        // Teste do exercício 2
        System.out.println("Soma de 3 com 4: " + ex2SomaNaturaisDeUmEmUmRec(3, 4)); // 7

        // Teste do exercício 3
        System.out.println("Somatório de 1 + 1/2 + 1/3: " + ex3CalcucarUmMaisUmMeioSomatorioRec(3)); // 1.8333333333333333

        // Teste do exercício 4
        System.out.println("Inversão de 'Hello': " + ex4InverteSringRec("Hello")); // olleH
    }
}