package com.tutorial.adapter;

import com.tutorial.adapter.defined.UserChar;
import com.tutorial.adapter.defined.UserChar2;

public class UserListMain {
    public static void main(String[] args) {
        UserChar userChar=new UserChar("test-123444");
        CharSequence charSequence=new CharAdapter<>(userChar);

        System.out.println(charSequence.subSequence(0,4));

        UserChar2 userChar2=new UserChar2("test-123444");
        charSequence=new CharAdapter<>(userChar2);

        System.out.println(charSequence.subSequence(0,4));

    }
}
