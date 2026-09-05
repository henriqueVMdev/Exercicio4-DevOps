public class Pet {
    String nome;
    String especie;
    int idade;
    double valorServico;

    public Pet(String nomePet, String especiePet, int idadePet, double  valorServicoPet){
        nome = nomePet;
        especie = especiePet;
        idade = idadePet;
        valorServico = valorServicoPet;
    }

    void exibirInformacoes(){
        System.out.println("----------------------------------------------------------");

        System.out.println("Nome: "+nome+"\nEspecie: "+ especie+"\nIdade: "+idade+"\nValor do servico: "+ valorServico);
    }
}
