package estruturas_excepcionais;

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23.765-064");

            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP não possui a quantidade de dígitos necessária.");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8)
        {
            throw new CepInvalidoException();
        }

        return "23.765-064";
    }
}
