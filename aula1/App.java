
public class App {

    public static void main(String[] args) throws Exception {
        Celular celularA = new Celular();
        celularA.nome = "iphone 12";
        celularA.tamanhoTela = 6.1f;
        celularA.armazenamento = 256;
        celularA.sistemaOperacional = "IOS";

        Celular celularB = new Celular();
        celularB.nome = "Galaxy S20 Ultra";
        celularB.tamanhoTela = 6.9f;
        celularB.armazenamento = 256;
        celularB.sistemaOperacional = "Android";

        Celular celularC = new Celular();
        celularC.nome = "Xiaomi Redmi 14C";
        celularC.tamanhoTela = 6.6f;
        celularC.armazenamento = 512;
        celularC.sistemaOperacional = "Android";



        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s \n", celularA.nome, celularA.tamanhoTela, celularA.armazenamento, celularA.sistemaOperacional);

        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s \n", celularB.nome, celularB.tamanhoTela, celularB.armazenamento, celularB.sistemaOperacional);

        System.out.format("Celular %s com tela de %.1f, com %dgb e SO %s \n", celularC.nome, celularC.tamanhoTela, celularC.armazenamento, celularC.sistemaOperacional);

    }

}




//iphone 12, tela 6.1, 256gb
//galaxy s20 ultra, tela 6.9, 256gb
//xiami redmi 14c, tela 6.6, 512gb

//<tipoVariavel> nomeVariavel = valor
