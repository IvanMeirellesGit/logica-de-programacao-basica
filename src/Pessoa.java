import java.sql.Date;

public class Pessoa {
    private String nome;
    private String sexo;
    private Date dataDeNascimento;

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

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public void mudasSexo(String novoSexo, String antigoNome) {
        sexo = novoSexo;
        nome = antigoNome;
    }

    public void casar(String antigoSobrenome, String novoSobrenome) {
        nome = nome.replace(antigoSobrenome, novoSobrenome);
    }

}