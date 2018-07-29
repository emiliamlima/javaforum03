import java.util.Date;

public class Consulta {
	int idconsulta;
	Date datainicio;
	Date datafim;
	String animal;
	String veterinario;
	String sintomas;
	Exame[] exames;
	public int getIdconsulta() {
		return idconsulta;
	}
	public void setIdconsulta(int idconsulta) {
		this.idconsulta = idconsulta;
	}
	public Date getDatainicio() {
		return datainicio;
	}
	public void setDatainicio(Date datainicio) {
		this.datainicio = datainicio;
	}
	public Date getDatafim() {
		return datafim;
	}
	public void setDatafim(Date datafim) {
		this.datafim = datafim;
	}
	public String getAnimal() {
		return animal;
	}
	public void setAnimal(String animal) {
		this.animal = animal;
	}
	public String getVeterinario() {
		return veterinario;
	}
	public void setVeterinario(String veterinario) {
		this.veterinario = veterinario;
	}
	public String getSintomas() {
		return sintomas;
	}
	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}
	public Exame[] getExames() {
		return exames;
	}
	public void setExames(Exame[] exames) {
		this.exames = exames;
	}
	public Consulta(int idconsulta, Date datainicio, Date datafim, String animal, String veterinario, String sintomas,
			Exame[] exames) {
		super();
		this.idconsulta = idconsulta;
		this.datainicio = datainicio;
		this.datafim = datafim;
		this.animal = animal;
		this.veterinario = veterinario;
		this.sintomas = sintomas;
		this.exames = exames;
	}

}
