/**
 * 
 */
package com.codefriends.miniforms;

import java.util.List;
import java.util.Vector;

/**
 * @author calambrenet
 *
 */
public class MiniForm {
	private List<Field> FieldsList = new Vector<Field>();
	private FormValidationListener validatorListener;

	//FIXME: this contruct whith this arg we will need
	public MiniForm() {
		// TODO Auto-generated constructor stub
	}

	public void setValidationListener(FormValidationListener validatorListener) {
		this.validatorListener = validatorListener;
	}

	public void addField(Field field) throws Exception {
		try{
			FieldsList.add(field);
		}catch(Exception e){
			throw e;
		}
	}
	
	public void addField( int i, Field field) throws Exception {
		try{
			FieldsList.add(i, field);
		}catch(Exception e){
			throw e;
		}
	}	
	
	public void validate() {
		validate(false);
	}

	public void validate(boolean force) {
		if(force){
			validatorListener.onFormValidationSucceeded();
			return;
		}
		
		boolean failed = false;
		for(Field field : FieldsList){
			if(!field.doValidate()){
				validatorListener.onFormValidationFailed(field.getView(), field.getLastValidatorMsg());
				failed = true;
				break;
			}			
		}
		if(!failed)
			validatorListener.onFormValidationSucceeded();
	}
}
