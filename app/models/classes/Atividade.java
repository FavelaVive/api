package models.classes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.joda.time.DateTime;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.WhenCreated;
import com.avaje.ebean.annotation.WhenModified;

import models.classes.enums.AtividadeTipo;

@Entity
@Table
public class Atividade extends Model {
	
	@Id
    @Column
    private Long id;
	
	@Enumerated
	private AtividadeTipo atividadeTipo;
	
	@Column
	private String titulo;
	
	@Column
	private String descricao;
	
	@Column
	private DateTime dataAtividade;
	
	@ManyToOne
	private Pessoa pessoa;
	
	@ManyToOne
	private Favela favela;
	
	@OneToMany
	private List<Contribuicao> contribuicoes;
	
	@WhenCreated
	@Column
	private DateTime dataCriacao;
	
	@WhenModified
	@Column
	private DateTime dataModificacao;

	public Atividade() {}
	
	public Atividade(String titulo, String descricao, AtividadeTipo atividadeTipo, DateTime dataAtividade, Pessoa pessoa) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.dataAtividade = dataAtividade;
		this.pessoa = pessoa;
		this.atividadeTipo = atividadeTipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public DateTime getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(DateTime dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

	public Long getId() {
		return id;
	}
	
	public Favela getFavela() {
		return favela;
	}

	public List<Contribuicao> getContribuicao() {
		return contribuicoes;
	}

	public void setContribuicao(List<Contribuicao> contribuicoes) {
		this.contribuicoes = contribuicoes;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public DateTime getDataAtividade() {
		return dataAtividade;
	}

	public DateTime getDataCriacao() {
		return dataCriacao;
	}
}
