package estruturas_repeticao;

public class ExemploFor {
    public static void main(String[] args) {

        // FOR (PARA)
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++)
        {
            System.out.println("Contando carneirinhos: " + carneirinhos);
        }

        // FOR em Arrays
        // Em arrays o índice de elementos inicia-se em ZERO
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int i = 0; i < alunos.length; i++)
        {
            System.out.println("Índice " + i + " é o aluno: " + alunos[i]);
        }

        //FOREACH
        for (String aluno : alunos)
        {
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
