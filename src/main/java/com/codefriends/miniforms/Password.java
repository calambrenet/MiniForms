package com.codefriends.miniforms;

import android.widget.TextView;

/**
 * Created by calambrenet on 4/11/15.
 */
public class Password extends ValidatorBase {
    private String msg = "This password is not valid";


    public static Password build() {
        return new Password();
    }

    public Password setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    @Override
    public String getMsg() {
        return this.msg;
    }

    @Override
    public boolean exec(TextView view) {
        if (view.getText().toString().trim().length() == 0)    //Si no hay nada no se valida. Para eso está el validador required
            return true;

        return view.getText().toString().length() > 4;
    }
}