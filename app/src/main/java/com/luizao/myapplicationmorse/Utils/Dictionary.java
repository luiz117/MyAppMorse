package com.luizao.myapplicationmorse.Utils;

import java.util.HashMap;
import java.util.Map;

public class Dictionary {

   private Map<String,String> morse = new HashMap<>();

    public Dictionary(){
        this.setMap();
    }

    private void setMap(){
        //morse = new HashMap<>();
        morse.put("A",".-");
        morse.put("B","-...");
        morse.put("C","-.-.");
        morse.put("D","-..");
        morse.put("E",".");
        morse.put("F","..-.");
        morse.put("G","--.");
        morse.put("H","....");
        morse.put("I","..");
        morse.put("J",".---");
        morse.put("K","-.-");
        morse.put("L",".-..");
        morse.put("M","--");
        morse.put("N","-.");
        morse.put("O","---");
        morse.put("P",".--.");
        morse.put("Q","--.-");
        morse.put("R",".-.");
        morse.put("S","...");
        morse.put("T","-");
        morse.put("U","..-");
        morse.put("V","...-");
        morse.put("W",".--");
        morse.put("X","-..-");
        morse.put("Y","-.--");
        morse.put("Z","--..");
        morse.put("0","-----");
        morse.put("1",".----");
        morse.put("2","..---");
        morse.put("3","...--");
        morse.put("4","....-");
        morse.put("5",".....");
        morse.put("6","-....");
        morse.put("7","--...");
        morse.put("8","---..");
        morse.put("9","----.");
        morse.put(".",".-.-.-");
        morse.put(",","--..--");
        morse.put("?","..--..");
        morse.put("'",".----.");
        morse.put("!","-.-.--");
        morse.put("/","-..-.");
        morse.put("(","-.--.");
        morse.put(")","-.--.-");
        morse.put("&",".-...");
        morse.put(":","---...");
        morse.put(";","-.-.-.");
        morse.put("=","-...-");
        morse.put("-","-....-");
        morse.put("_","..--.-");
        morse.put("\"",".-..-.");
        morse.put("$","...-..-");
        morse.put("@",".--.-.");
        morse.put("É","..-..");
        morse.put("Ç","-.-..");
        morse.put("À",".--.-");
    }


    public String returnCode(String input) {
        String input2 = input.toUpperCase();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input2.length(); i++) {
            Character c = input2.charAt(i);
            sb.append("/");
            sb.append(morse.get(c.toString()));
        }
        String rrr = sb.toString();

        return rrr;
    }
}
