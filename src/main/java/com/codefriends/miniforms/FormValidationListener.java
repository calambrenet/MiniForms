/**
 * 
 */
package com.codefriends.miniforms;

import android.view.View;


/**
 * @author calambrenet
 *
 */
public interface FormValidationListener {

    public void onFormValidationSucceeded();
    public void onFormValidationFailed(View failedView, String message);
}
