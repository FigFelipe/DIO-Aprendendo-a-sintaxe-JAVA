package tipos_e_variaveis;

public class TipoDados {
    public static void main(String[] args) {

        byte idade = 123; //1 byte ou 8 bits --> 2^8 = 256 (-128 <---> +127)
        short ano = 2021; //2 bytes ou 16 bits--> 2^16 = 65536 (-32768 <---> 32767)
        int cep = 61700000; //4 bytes ou 32 bits --> 2^32 = 4.294.967.296 (-2.147.483.648 <---> 2.147.483.647)
        long cpf = 123456789L; //8 bytes ou 64 bits --> 2^64 = 18.446.744.073.709.551.616 (-9.223.372.036.854.775.808 <---> 9.223.372.036.854.775.807)
        float pi = 3.14F; // 4 bytes ou 32 bits --> 2^32 = (-3,4028E + 38 <---> -3,4028E + 38) 6-7 dígitos de precisão
        double salario = 1275.23; // 8 bytes ou 64 bits --> 2^64 = (-1,7976E + 308 <---> 1,7976E + 308) 15 dígitos de precisão

        final double VALOR_DE_PI = 3.1415; // Valor definitivo, nomear em CAIXA ALTA
    }
}
