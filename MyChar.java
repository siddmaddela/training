package com.in28minutes.primitivedata;

public class MyChar {
    private String ch;
    public MyChar(String ch){
        this.ch = ch;
    }
    public boolean isVowel(){
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch='E'||ch='I'||ch='O'||ch='U')
            return true;
        return false;
    }
}
