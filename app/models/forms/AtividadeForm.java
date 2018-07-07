package models.forms;

import org.joda.time.DateTime;

import exceptions.AppException;
import play.data.validation.Constraints;

public class AtividadeForm implements IForm {

	@Constraints.Required
    public String titulo;
	
    @Constraints.Required
    public String descricao;
    
    @Constraints.Required
    public DateTime dataAtividade;
    
    @Override
	public boolean isValido() throws AppException {
		return true;
	}

}
