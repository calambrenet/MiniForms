package com.codefriends.miniforms;

import java.util.LinkedList;
import java.util.List;
import android.widget.TextView;


/**
 * @author calambrenet
 *
 */
public class Field {
	private List<ValidatorBase> ValidatorsList = new LinkedList<ValidatorBase>();
	
	private TextView View;
	private String latValidatorMsg="Ok";

	public Field(TextView view) {
		this.View = view;
	}

	public static Field using(TextView view) {
		return new Field(view);
	}
	
	public TextView getView(){
		return this.View;
	}

	public Field validate(ValidatorBase v) {
        ValidatorsList.add(v);
        return this;
    }

	public boolean doValidate() {		
		for(ValidatorBase validator : ValidatorsList){
			if(validator.exec(this.View)==false){
				this.latValidatorMsg = validator.getMsg();
				return false;
			}
		}
		
		return true;
	}

	public String getLastValidatorMsg() {
		return this.latValidatorMsg;
	}	
}
