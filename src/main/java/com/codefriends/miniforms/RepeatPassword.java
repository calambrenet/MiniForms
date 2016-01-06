package com.codefriends.miniforms;

import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by calambrenet on 4/11/15.
 */
public class RepeatPassword extends ValidatorBase{
    private final EditText mPasswordView;
    private String msg = "Fields do not match";

    public RepeatPassword(EditText passwordView) {
        mPasswordView = passwordView;
    }

    public static RepeatPassword build(EditText passwordView) {
        return new RepeatPassword(passwordView);
    }

    @Override
    public boolean exec(TextView view) {
        if(view.getText().toString().equals(mPasswordView.getText().toString()))
            return true;
        else
            return false;
    }


    @Override
    public RepeatPassword setMsg(String msg) {
        this.msg = msg;
        return this;
    }


    @Override
    public String getMsg() {
        return msg;
    }

}
