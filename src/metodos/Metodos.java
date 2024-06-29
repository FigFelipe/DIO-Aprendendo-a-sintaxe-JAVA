// Curso: Aprendendo a Sintaxe Java
// Capítulo: Métodos

package metodos;

public class Metodos {
    public static void main(String[] args) {

        // 1. O método deve ser nomeado como VERBO
        // 2. Seguir o padrão 'camelCase'
        // 3. Qual a proposta do método?
        // 4. Qual o tipo de retorno esperado pelo método?
        // 5. Quais parâmetros serão necessários?
        // 6. Possui risco de apresentar alguma exceção?
        // 7. Qual a visibilidade do método?
    }

    // Método publico imprimir com retorno nulo
    public void imprimir(String texto)
    {
        texto = "Olá mundo";
    }

    // Método publico que gera uma exceção
    public double dividir(int dividendo, int divisor) throws Exception{
        return 0;
    }

    // Método privado resumir com retorno nulo
    private void resumir(String texto)
    {
        texto = "Olá mundo";
    }



}
