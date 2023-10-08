import java.util.ArrayList;

public class CadastroDePessoa {

    ArrayList<Pessoa> pessoaList = new ArrayList<>();

    Maternidade maternidade = new Maternidade();

    public static void main(String[] args) throws Exception {
        new CadastroDePessoa().rodar();
    }

    private void rodar() throws Exception {
        Pessoa zumba = maternidade.nascer("Zumba Games", "Masculino");
        Pessoa zefrina = maternidade.nascer("Zefrina Silva", "Feminino");
        Pessoa joao = maternidade.nascer("João Silva", "Masculino");
        Pessoa robo = maternidade.nascer("Robo", "Robo");

        pessoaList.add(zumba);
        pessoaList.add(zefrina);
        pessoaList.add(joao);
        pessoaList.add(robo);

        ArrayList<Pessoa> homenList = new ArrayList<>();
        ArrayList<Pessoa> mulherList = new ArrayList<>();
        ArrayList<Pessoa> outrosGeneros = new ArrayList<>();

        for (Pessoa pessoa : pessoaList) {
            if (pessoa.getSexo().equals("Masculino")) {
                homenList.add(pessoa);
            } else if (pessoa.getSexo().equals("Feminino")) {
                mulherList.add(pessoa);
            } else {
                outrosGeneros.add(pessoa);
            }
        }
    }
}
