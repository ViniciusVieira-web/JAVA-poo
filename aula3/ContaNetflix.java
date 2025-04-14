package aula3;

public class ContaNetflix {
    
    private String idiomaPreferencial;
    private String resolucaoTela;

    public void entrar(){
        buscarPreferencia();
        buscarResolucao();
    }

    private void buscarPreferencia(){

        idiomaPreferencial = "Português";
    }

    private void buscarResolucao(){
        resolucaoTela = "1080p";
    }


    public void assistirFilme(String filme){
        System.out.println("Assistindo filme: " + filme);
        System.out.println("Carregando o filme na resolucao " + resolucaoTela);
        carregarAudioFilme();
    }

    private void carregarAudioFilme(){

        if (idiomaPreferencial == "Português" || idiomaPreferencial == "Inglês" ){
            System.out.println("Carregando o áudio do filme na lingua " + idiomaPreferencial);
        } else {
            System.out.println("Carregando o áudio do filme em Inglês");
        }
    }
    
    
}
