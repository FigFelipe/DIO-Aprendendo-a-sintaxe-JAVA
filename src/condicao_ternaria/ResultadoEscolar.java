package condicao_ternaria;

public class ResultadoEscolar {
    public static void main(String[] args) {

        int nota = 5;

        // IF-ELSE SIMPLES
        //String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        // IF-ELSE ENCADEADO
        String  resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
