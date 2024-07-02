package estruturas_repeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {

        for (int numero = 1; numero <= 5; numero++)
        {
            if (numero == 3)
                //break; // Interrompe e sai do FOR
                continue; // Executa o continue, porém não executa a linha abaixo

            System.out.println(numero);
        }
    }
}
