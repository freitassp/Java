package herancainterface;

//Gerente eh um Funcionario, Gerente herda da class Funcionario
public class Designer extends Funcionario {

    @Override
    public double getBonificacao() {
        System.out.println("Método bonificação do Design");
        return 200.0;
    }
	
	

}