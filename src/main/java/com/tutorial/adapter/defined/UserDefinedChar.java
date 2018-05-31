package com.tutorial.adapter.defined;

public interface UserDefinedChar {

    CharSequence subSequence(int start, int end);

    void setValue(char[] value);

    char[] getValue();
}
