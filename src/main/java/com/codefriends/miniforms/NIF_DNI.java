/**
 * 
 */
package com.codefriends.miniforms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.widget.TextView;

/**
 * @author calambrenet
 *
 */
public class NIF_DNI extends ValidatorBase {
	private String msg = "This DNI-NIF is not valid";
	
	private static final String PATTERN = 
			"((\\d{8})([-]?)([A-Z]|[a-z]{1})|([K-M]|[X-Z]|[k-m]|[x-z]{1})([-]?)(\\d{7})([-]?)([A-Z]|[a-z]{1}))";

	public static NIF_DNI build() {
		return new NIF_DNI();
	}
	
	public NIF_DNI setMsg(String msg) {
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
		
		Pattern pattern = Pattern.compile(PATTERN);
		Matcher matcher = pattern.matcher(view.getText().toString());
		return matcher.matches();				
	}


}	
