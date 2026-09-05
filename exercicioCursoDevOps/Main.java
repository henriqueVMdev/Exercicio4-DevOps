package exercicioCursoDevOps;

public class Main {

    static void main(String[] args){
        Curso curso1 = new Curso("ADS", "Daniel", 20, 2000);
        curso1.exibirInformacoes();

        Curso curso2 = new Curso("Mecatronica", "Carlos", 19, 2000);
        curso2.exibirInformacoes();
        
        Curso curso3 = new Curso("Robotica", "Hugo", 15, 3000);
        curso3.exibirInformacoes();
    }
}
