package herancainterface;

public class Gerente extends Funcionario {

	
        
        @Override
	public double getBonificacao() {
            System.out.println("Chamando metodo do Gerente");
	    return super.getSalario();
	}


}