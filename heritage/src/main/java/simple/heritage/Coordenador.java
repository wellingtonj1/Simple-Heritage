package simple.heritage;

public class Coordenador extends Pessoa implements Funcionario {
    
    public Coordenador(int id, String nome, String departamento) {
        super(id, nome);
    }

    @Override
    public void CalculaSalario() {
        helper.print("Salário do coordenador é de R$ 5000,00");
        helper.print("Nome: " + this.getNome());
        helper.print("Id: " + this.getId());
    }
    
}
