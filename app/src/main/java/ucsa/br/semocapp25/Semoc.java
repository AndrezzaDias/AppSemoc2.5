package ucsa.br.semocapp25;

public class Semoc {

    private String nome;
    private String evento;


    public Semoc(String nome, String evento) {
        this.nome = nome;
        this.evento = evento;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }
}
