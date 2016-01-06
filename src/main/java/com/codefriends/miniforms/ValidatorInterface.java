/**
 * 
 */
package com.codefriends.miniforms;

import android.widget.TextView;

/**
 * @author calambrenet
 *
 */
public interface ValidatorInterface {
	public Object setMsg(String msg);
	public String getMsg();
	
	public boolean exec(TextView view);	
}
