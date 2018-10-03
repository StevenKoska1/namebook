package com.example.koska.namebook;

public class Person {

    private String name, phone, email, text;

    public String getText() (return text; )

    public void setText(String text) (this.text = text; )

    public Person(String line) throws Exception {
        String[] elems = line.split(regex"\f");
        if (elems.length != 4) throw new Exception("Illegal text for person");
        name = elems[0];
        phone = elems[1].trim();
        email = elems[2].trim();
        text = elems[3].trim();
    }

    public string getPerson(){
        StringBuilder builder = new StringBuilder(name);
        builder.append("\f");
        builder.append(phone.length() == 0 ? "\t" : phone);
        builder.append("\f");
        builder.append(email.length() == 0 ? "\t" : email);
        builder.append("\f");
        builder.append(text.length() == 0 ? "\t" : text);
        return builder.toString();
    }


    @Override
    public String toString(){
        return name;
    }
}
