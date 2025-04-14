import java.util.Random;

public class Personagem {
    
    String nome;
    int nivel;
    int forca;
    

    // void significa que não retorna nada
    void mostrarStatus() {
        System.out.format("Personagem: %s (LvL %d) com %d de forca \n", nome, nivel, forca);
    }

    int calculaDano() {
        Random gerador = new Random();
        int dado30face = 1 + gerador.nextInt(29);
        int dano = forca * dado30face;
        return dano;
    
    }

    


    void atacar(String alvo, String habilidade) {
        int danoCausado = calculaDano();
        if (habilidade.length() == 0) {
            System.out.format("%s atacou %s e causou %d de dano \n", nome, alvo , danoCausado);
        } else {
            System.out.format("%s usou %s contra %s e causou %d de dano \n", nome,habilidade, alvo , danoCausado);
        }
    }

}

