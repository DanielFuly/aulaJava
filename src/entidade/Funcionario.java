package entidade;

import java.util.List;

public class Funcionario {
	private int id;
	private String nome;
	private int matricula;
	private double salario;
	
	private List<Dependente> Dependente;
	
	public Funcionario(){
		
	}
	@Override
	public String toString(){
	return "Funcionario:\nId: " + id +"\nNome:" + nome + "\nMatricula" + matricula + "\nSalario:" + salario + "\n\tDependente" + Dependente;
	}
//-----------------------------------------------------	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
//-----------------------------------------------------	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
//-----------------------------------------------------	
	public int getMatricula(){
		return matricula;
	}
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
//-----------------------------------------------------	
	public double getSalario(){
		return salario;
	}
	 public void setSalario(double salario){
		 this.salario = salario;
	 }
//-----------------------------------------------------	 
	 public List<Dependente> getDependente(){
		 return Dependente;
	 }
	public void setDependente(List<Dependente> Dependente){
		this.Dependente = Dependente;
	}
	
}
