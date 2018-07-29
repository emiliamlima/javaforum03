import java.sql.Date;

public class Exame {
	int idexame;
	String veterinario;
	String animal;
	Date datasolicitação;
	Date datarecebimento;
	String descricao;
	public int getIdexame() {
		return idexame;
	}
	public void setIdexame(int idexame) {
		this.idexame = idexame;
	}
	public String getVeterinario() {
		return veterinario;
	}
	public void setVeterinario(String veterinario) {
		this.veterinario = veterinario;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public Date getDatasolicitação() {
		return datasolicitação;
	}
	public void setDatasolicitação(Date datasolicitação) {
		this.datasolicitação = datasolicitação;
	}
	public Date getDatarecebimento() {
		return datarecebimento;
	}
	public void setDatarecebimento(Date datarecebimento) {
		this.datarecebimento = datarecebimento;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Exame(int idexame, String veterinario, String animal, Date datasolicitação, Date datarecebimento,
			String descricao) {
		super();
		this.idexame = idexame;
		this.veterinario = veterinario;
		this.animal = animal;
		this.datasolicitação = datasolicitação;
		this.datarecebimento = datarecebimento;
		this.descricao = descricao;
	}

}
