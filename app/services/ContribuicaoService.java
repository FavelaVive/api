package services;

import com.avaje.ebean.Model.Find;

import models.classes.Contribuicao;

public class ContribuicaoService {
	
	private static Find<Long, Contribuicao> FIND = new Find<Long, Contribuicao>() {};
	
	public static Contribuicao findByPessoaEAtividade(Long pessoaId, Long atividadeId) {
		return FIND.where().and().eq("pessoa.id", pessoaId).eq("atividade.id", atividadeId).endJunction().findUnique();
	}
}
