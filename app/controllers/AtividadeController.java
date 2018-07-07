package controllers;

import java.util.HashMap;
import java.util.List;

import javax.inject.Inject;

import com.fasterxml.jackson.databind.JsonNode;

import exceptions.AppException;
import models.classes.Atividade;
import models.classes.Pessoa;
import models.classes.enums.AtividadeTipo;
import models.classes.enums.UF;
import models.forms.AtividadeForm;
import models.utils.AppUtil;
import interceptors.PessoaInterceptor;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
import play.mvc.Result;
import play.mvc.With;
import services.AtividadeService;
import services.PessoaService;

public class AtividadeController extends BaseController {

    @Inject
    public AtividadeController(FormFactory formFactory) {
        super(formFactory);
    }

    @With({PessoaInterceptor.class})
    public Result listarCidade(String uf, String cidade) {
    	HashMap<String, Object> resposta = new HashMap<>();
    	boolean resultado = false;
    	try {
    		UF euf = UF.parse(uf);
    		if(euf != null) {
    			List<Atividade> atividades = AtividadeService.findByCidade(euf, cidade);
    			resposta.put("atividades", atividades);
    			resultado = true;
    		}
    	}catch(Exception e) {
    		e.printStackTrace();
    		resposta.put("mensagem", e.getMessage());
    	}
    	resposta.put("resultado", resultado);
    	if(resultado){
    		return ok(Json.toJson(resposta));
    	}else{
    		return badRequest(Json.toJson(resposta));
    	}
    }
    
    @With({PessoaInterceptor.class})
    public Result criar(Long pessoaId) {
    	HashMap<String, Object> resposta = new HashMap<>();
    	boolean resultado = false;
    	try {
    		JsonNode rjson = request().body().asJson();
    		Form<AtividadeForm> form = this.formFactory.form(AtividadeForm.class).bind(rjson);
    		
    		if(form != null) {
    			AtividadeForm af = form.get();
    			if(af.isValido()) {
    				Pessoa pessoa = PessoaService.findById(pessoaId);
    				Atividade atividade = new Atividade(af.titulo, af.descricao, af.atividadeTipo, af.dataAtividade, pessoa);
    				atividade.save();
    				resultado = true;
    				resposta.put("atividade", atividade);
    			}
    		}else {
    			throw new AppException(AppUtil.getMessage("ge.iFields"));
    		}
    		resultado = true;
    	}catch(Exception e) {
    		e.printStackTrace();
    		resposta.put("mensagem", e.getMessage());
    	}
    	resposta.put("resultado", resultado);
    	if(resultado){
    		return ok(Json.toJson(resposta));
    	}else{
    		return badRequest(Json.toJson(resposta));
    	}
    }
}
            
