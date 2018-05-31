package com.tutorial.adapter;

import com.tutorial.adapter.defined.UserDefinedChar;

public class CharAdapter<E extends UserDefinedChar> implements CharSequence,java.io.Serializable {
    private char value[];

    private UserDefinedChar charClass;

    public CharAdapter(E charClass){
        this.charClass=charClass;
        if(this.charClass.getValue()==null){
            this.value = "".toCharArray();
        }else {
            this.value = this.charClass.getValue();
        }
    }

    public CharAdapter(E charClass,String value){
        this.value = value.toCharArray();
        this.charClass=charClass;
    }

    @Override
    public int length() {
        return value.length;
    }

    @Override
    public char charAt(int index) {
        if ((index < 0) || (index >= value.length)) {
            throw new StringIndexOutOfBoundsException(index);
        }
        return value[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return this.charClass.subSequence(start, end);
    }
}
