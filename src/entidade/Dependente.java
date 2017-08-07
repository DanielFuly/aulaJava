package entidade;

public class Dependente {
	private int id;
	private String nome;
	private int idade;
	
	private Funcionario Funcionario;
	
	public Dependente(){
		
	}
	
	@Override
	public String toString(){
		return "Nome: " + nome +"\n\tIdade:" + idade;
	}
//-----------------------------------------------------	
	public int getId(){
		return id;
	}
	public void setId(int id){
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
	public int getIdade(){
		return idade;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
//-----------------------------------------------------
	public Funcionario getFuncionario(){
		return Funcionario;
	}
	public void setFuncionario(Funcionario Funcionario){
		this.Funcionario = Funcionario;
	}
	
	
	
}
