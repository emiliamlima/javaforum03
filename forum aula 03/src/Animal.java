import java.util.Date;

public class Animal {
	int idanimal;
	String nome;
	int Idade;
    Date ultimaconsulta;
    String especie;
    String raca;
    Date datanascimento;
    Consulta[] consultas;
	public int getIdanimal() {
		return idanimal;
	}
	public void setIdanimal(int idanimal) {
		this.idanimal = idanimal;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	public Date getUltimaconsulta() {
		return ultimaconsulta;
	}
	public void setUltimaconsulta(Date ultimaconsulta) {
		this.ultimaconsulta = ultimaconsulta;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public Date getDatanascimento() {
		return datanascimento;
	}
	public void setDatanascimento(Date datanascimento) {
		this.datanascimento = datanascimento;
	}
	public Consulta[] getConsultas() {
		return consultas;
	}
	public void setConsultas(Consulta[] consultas) {
		this.consultas = consultas;
	}
	public Animal(int idanimal, String nome, int idade, Date ultimaconsulta, String especie, String raca,
			Date datanascimento, Consulta[] consultas) {
		super();
		this.idanimal = idanimal;
		this.nome = nome;
		Idade = idade;
		this.ultimaconsulta = ultimaconsulta;
		this.especie = especie;
		this.raca = raca;
		this.datanascimento = datanascimento;
		this.consultas = consultas;
	}

}


