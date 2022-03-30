package simple.heritage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // clear the screen
        helper.print("\033[H\033[2J");
        helper.print("Hello World!");

        // create a new instance of the Gerente class
        Gerente gerente = new Gerente(1, "João", "TI");
        
        // create a new instance of the Coordenador class
        Coordenador coordenador = new Coordenador(2, "Maria", "RH");

        // call the CalculaSalario method from the Gerente class
        gerente.CalculaSalario();
        
        // call the CalculaSalario method from the Coordenador class
        coordenador.CalculaSalario();

        Pessoa pessoa = new Pessoa(3, "Pedro");
        // call the CalculaSalario method from the Pessoa class
        pessoa.CalculaSalario();
        
    }
}
