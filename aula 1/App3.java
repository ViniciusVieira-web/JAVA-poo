public class App3 {

    public static void main(String[] args) throws Exception {

        Personagem heroi = new Personagem();
        heroi.nome = "Ashborn";
        heroi.nivel = 56;
        heroi.forca = 858;

        heroi.mostrarStatus();

        heroi.atacar("Orc", "Golpe de pika");

        // System.out.println (heroi.calculaDano());

    }

}
