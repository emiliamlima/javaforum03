import java.util.Date;

public class Cliente {
	int idcliente;
	String nome;
	String endereco;
	String cpf;
	Animal[] animal;
	String telefone;
	Date datanascimento;
	public int getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Animal[] getAnimal() {
		return animal;
	}
	public void setAnimal(Animal[] animal) {
		this.animal = animal;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Date getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(Date datanascimento) {
		this.datanascimento = datanascimento;
	}
	public Cliente(int idcliente, String nome, String endereco, String cpf, Animal[] animal, String telefone,
			Date datanascimento) {
		super();
		this.idcliente = idcliente;
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.animal = animal;
		this.telefone = telefone;
		this.datanascimento = datanascimento;
	}
	
	

}
