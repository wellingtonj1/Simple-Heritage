package simple.heritage;

public class Gerente extends Pessoa implements Funcionario{

    public Gerente(int id, String nome, String departamento) {
        super(id, nome);
    }
    
    @Override
    public void CalculaSalario() {
        helper.print("Salário do gerente é de R$ 9000,00");
        helper.print("Nome: " + this.getNome());
        helper.print("Id: " + this.getId());
    }

}
