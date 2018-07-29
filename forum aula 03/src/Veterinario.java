
public class Veterinario {
	int IdVeterinario;
	String nome;
	String Telefone;
    String cpf;
	public int getIdVeterinario() {
		return IdVeterinario;
	}
	public void setIdVeterinario(int idVeterinario) {
		IdVeterinario = idVeterinario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Veterinario(int idVeterinario, String nome, String telefone, String cpf) {
		super();
		IdVeterinario = idVeterinario;
		this.nome = nome;
		Telefone = telefone;
		this.cpf = cpf;
	}
    
    
}
