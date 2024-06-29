// Curso: Aprendendo a Sintaxe Java
// Capítulo: Operadores

package operadores;

import java.util.Date;

public class Operadores {
    public static void main(String[] args) {

        // Operadores de Atribuição (=)
        String nome = "Felipe";
        int idade = 22;
        double peso = 68.5;
        char sexo = 'M';
        boolean flag = true;
        Date dataNascimento = new Date();

        // Operadores Aritméticos
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3; // <-- resto da divisão
        double resultado = (10 * 7) + (20.0/4.0);

        String nomeCompleto = "Linguagem" + " JAVA";

        //qual o resultado das expressoes abaixo?
        String concatenacao ="?";

        concatenacao = 1+1+1+"1";
        concatenacao = 1+"1"+1+1;
        concatenacao = 1+"1"+1+"1";
        concatenacao = "1"+1+1+1;
        concatenacao = "1"+(1+1+1);

        System.out.println(nomeCompleto);

        // Operadores Unários
        int numero = 5;

        // Modificando o sinal
        numero = -numero; // -
        numero = +numero; // +

        numero++; // Incrementa 1
        numero--; // Decrementa 1

        // Negar valor booleano (!)
        boolean variavel = true;

        variavel = !variavel;

        // Operador Ternário
        int a, b;
        String resposta;

        a = 5;
        b = 5;

        resposta = a==b ? "verdadeira" : "falso";

        System.out.println(resposta);

        // Operadores Relacionais
        // == igualdade
        // != diferença
        // > maior
        // >= maior que
        // < menor
        // <= menor que

        // Operadores Lógicos
        // && 'E'
        // || 'OU'


    }
}
