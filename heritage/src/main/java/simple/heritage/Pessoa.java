package simple.heritage;

public class Pessoa implements Funcionario {
    
    int id;
    String nome;

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public void CalculaSalario() {
        helper.print("Salário da Pessoa é de R$ 1,00");
        helper.print("Nome: " + this.getNome());
        helper.print("Id: " + this.getId());
    }

}
