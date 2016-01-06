/**
 * 
 */
package com.codefriends.miniforms;

import android.widget.TextView;

/**
 * @author calambrenet
 *
 */
public class Required extends ValidatorBase {	
	private String msg = "This field is required";	

	public static Required build() {
		return new Required();
	}
	

	@Override
	public boolean exec(TextView view) {	
		if(view.getText().toString().trim().length()!=0)
			return true;
		else
			return false;					
	}


	@Override
	public Required setMsg(String msg) {
		this.msg = msg;
		return this;
	}


	@Override
	public String getMsg() {
		return msg;
	}

}
