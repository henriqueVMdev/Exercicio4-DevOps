package exercicioCursoDevOps;

public class Curso {
    String nome;
    String professor;
    int cargaHoraria;
    double valor;

    public Curso(String nomeCurso, String professorCurso, int cargaHorariaCurso, double valorCurso){
        nome = nomeCurso;
        professor = professorCurso;
        cargaHoraria = cargaHorariaCurso;
        valor = valorCurso;
    }

    void exibirInformacoes(){
        System.out.println("----------------------------------------------------------");
        System.out.println("Nome do curso: "+nome+"\nProfessor: "+professor+"\nCarga horaria: "+cargaHoraria+"\nValor: "+valor+"\nValor por hora: "+calcularValorHora());
    }
    public double calcularValorHora(){
        return valor / cargaHoraria;
    }
}
