package net.avalith.cristiantapia.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "developers")
public class developer implements Serializable {

	private static final long serialVersionUID = 875804577110239695L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private Long id;

	@Column(name = "nombres_completos")
	private String nombres_completos;

	@Column(name = "link_github")
	private String link_github;

	@Column(name = "tecnologias_conocidas")
	private String tecnologias_conocidas;

	public developer() {
	}

	public developer(String nombres_completos, String link_github, String tecnologias_conocidas) {
		this.nombres_completos = nombres_completos;
		this.link_github = link_github;
		this.tecnologias_conocidas = tecnologias_conocidas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombres_completos() {
		return nombres_completos;
	}

	public void setNombres_completos(String nombres_completos) {
		this.nombres_completos = nombres_completos;
	}

	public String getLink_github() {
		return link_github;
	}

	public void setLink_github(String link_github) {
		this.link_github = link_github;
	}

	public String getTecnologias_conocidas() {
		return tecnologias_conocidas;
	}

	public void setTecnologias_conocidas(String tecnologias_conocidas) {
		this.tecnologias_conocidas = tecnologias_conocidas;
	}

}
