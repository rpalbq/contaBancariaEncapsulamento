package entitie;

public class Banco {
	private int numeroConta;
	private String nomeTitular;
	private double deposito;
	
	
	public Banco(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}

	public Banco(int numeroConta, String nomeTitular, double deposito) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.deposito = deposito;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public double getDeposito() {
		return deposito;
	}
	
	public void deposito(double quantidade) {
		deposito += quantidade ;
	}
	
	public void saque(double quantidade) {
		deposito -= quantidade +5;
	}
	
	public String toString() {
		return "Account data: \n"+ "Accont " + getNumeroConta() +", Holder: " + getNomeTitular() + ", Balance: $" + getDeposito();
	}
}
