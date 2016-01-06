package com.codefriends.miniforms;

import android.widget.TextView;

/**
 * Created by calambrenet on 4/11/15.
 */
public class MaxLength extends ValidatorBase{
    private final int size;
    private String msg = "This field is too long";

    public MaxLength(int size) {
        this.size = size;
    }

    public static MaxLength build(int size) {
        return new MaxLength(size);
    }


    @Override
    public boolean exec(TextView view) {
        if(view.getText().toString().trim().length()>size)
            return false;
        else
            return true;
    }


    @Override
    public MaxLength setMsg(String msg) {
        this.msg = msg;
        return this;
    }


    @Override
    public String getMsg() {
        return msg;
    }
}
