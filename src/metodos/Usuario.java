package metodos;

public class Usuario {
    public static void main(String[] args) {

        // Criando um objeto de nome 'TV1' do tipo classe 'SmarTV'
        SmartTV TV1 = new SmartTV();

        TV1.ligar();

        TV1.diminuirVolume();
        TV1.diminuirVolume();
        TV1.diminuirVolume();

        TV1.aumentarVolume();

        TV1.selecionarCanal(50);

        System.out.println("TV ligada: " + TV1.ligada);
        System.out.println("Canal atual: " + TV1.canal);
        System.out.println("Volume atual: " + TV1.volume);




    }

}
