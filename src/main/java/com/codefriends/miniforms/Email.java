/**
 * 
 */
package com.codefriends.miniforms;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

import android.widget.TextView;

/**
 * @author calambrenet
 *
 */
public class Email extends ValidatorBase {
	private String msg = "This email is not valid";
	
	private static final String EMAIL_PATTERN = 
			"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	public static Email build() {
		return new Email();
	}
	
	public Email setMsg(String msg) {
		this.msg = msg;
		return this;
	}

	@Override
	public String getMsg() {
		return this.msg;
	}

	@Override
	public boolean exec(TextView view) {
		if(view.getText().toString().trim().length()==0)	//Si no hay nada no se valida. Para eso está el validador required
			return true;
		
		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(view.getText().toString());
		return matcher.matches();				
	}

}
