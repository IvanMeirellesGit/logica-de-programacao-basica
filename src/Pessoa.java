public class Pessoa {
    private String nome;
    private String sexo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void mudasSexo(String novoSexo, String novoNome) {
        sexo = novoSexo;
        nome = novoNome;
    }

    public void casar(String antigoSobrenome, String novoSobrenome) {
        nome = nome.replace(antigoSobrenome, novoSobrenome);
    }

}