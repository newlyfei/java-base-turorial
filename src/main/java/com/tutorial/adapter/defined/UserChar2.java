package com.tutorial.adapter.defined;

public class UserChar2 implements UserDefinedChar {
    char value[];

    public UserChar2(){

    }

    public UserChar2(String value) {
        this.value = value.toCharArray();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return substring(start,end);
    }

    public char[] getValue() {
        return value;
    }

    public void setValue(char[] value) {
        this.value = value;
    }

    public String substring(int beginIndex, int endIndex) {
        if (beginIndex < 0) {
            throw new StringIndexOutOfBoundsException(beginIndex);
        }
        if (endIndex > value.length) {
            throw new StringIndexOutOfBoundsException(endIndex);
        }

        int subLen = endIndex - beginIndex;
        beginIndex=value.length-subLen;
        if (subLen < 0) {
            throw new StringIndexOutOfBoundsException(subLen);
        }
        return new String(value, beginIndex, subLen);
    }
}
