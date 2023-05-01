public class ProfissionalSaude {
    private String nome;
    private boolean adm;

    public ProfissionalSaude(String nome, boolean adm) {
        this.nome = nome;
        this.adm = adm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAdm() {
        return adm;
    }

    public void setAdm(boolean adm) {
        this.adm = adm;
    }
}
