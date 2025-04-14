public class App2 {

    public static void main(String[] args) throws Exception {

        Computador computadorA = new Computador();
        computadorA.nome = "A";
        computadorA.processador = "Intel i7 9900";
        computadorA.placaMae = "Asus Prime Z390-A";
        computadorA.placaDeVideo = "NVIDIA GeForce GTX 1660 Ti";
        computadorA.memoriaRam = 16;
        computadorA.armazenamento = 512;
        computadorA.fonte = "Corsair CV550";

        Computador computadorB = new Computador();
        computadorB.nome = "B";
        computadorB.processador = "Ryzen 5 4600g";
        computadorB.placaMae = "A-520M Mancer";
        computadorB.placaDeVideo = "NVIDIA GTX 960";
        computadorB.memoriaRam = 16;
        computadorB.armazenamento = 480;
        computadorB.fonte = "Corsair CV450";

        System.out.format("Computador %s com processador %s, com a placa mãe %s, com a placa de vídeo %s, com %dgb de memória Ram e %dgb de armazenamento, com a fonte %s \n", computadorA.nome, computadorA.processador, computadorA.placaMae, computadorA.placaDeVideo, computadorA.memoriaRam, computadorA.armazenamento, computadorA.fonte);

        System.out.format("Computador %s com o processador %s, com a placa mãe %s, com a placa de vídeo %s, com %dgb de memória ram e %dgb de armazenamento, com a fonte %s", computadorB.nome, computadorB.processador, computadorB.placaMae, computadorB.placaDeVideo, computadorB.memoriaRam, computadorB.armazenamento, computadorB.fonte);
    }

}