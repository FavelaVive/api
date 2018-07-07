package models.classes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.joda.time.DateTime;

import com.avaje.ebean.Model;
import com.avaje.ebean.annotation.WhenCreated;
import com.avaje.ebean.annotation.WhenModified;

@Entity
@Table
public class Contribuicao extends Model {
	
	@Id
    @Column
    private Long id;
	
	@ManyToOne
	private Atividade atividade;
	
	@ManyToOne
	private Pessoa pessoa;
	
	@WhenCreated
	@Column
	private DateTime dataCriacao;
	
	@WhenModified
	@Column
	private DateTime dataModificacao;

	public Contribuicao() {}
	
	public Contribuicao(Atividade atividade, Pessoa pessoa) {
		this.pessoa = pessoa;
		this.atividade = atividade;
	}

	public DateTime getDataModificacao() {
		return dataModificacao;
	}

	public Long getId() {
		return id;
	}
	
	public Atividade getAtividade() {
		return atividade;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}
	
	public DateTime getDataCriacao() {
		return dataCriacao;
	}
}
