package compression;

import java.util.ArrayList;
import java.util.HashMap;

public class lzw {
    public lzw(){}
    public String lzw_compress(String s){
        HashMap<String,Integer> dict = new HashMap<>();
        String[] data = (s + "").split("");
        String out = "";
        ArrayList<String> out2 = new ArrayList<>();
        String currChar;
        String phrase = data[0];
        int code = 256;
        for(int i=1; i<data.length;i++){
            currChar = data[i];
            if(dict.get(phrase+currChar) != null){
                phrase += currChar;
            }
            else{
                if(phrase.length() > 1){
                    out = Character.toString((char)dict.get(phrase).intValue());
                    out2.add(out);
                }
                else{
                    out = Character.toString((char)Character.codePointAt(phrase,0));
                    out2.add(out);
                }

                dict.put(phrase+currChar,code);
                code++;
                phrase = currChar;
            }
        }

        if(phrase.length() > 1){
            out = Character.toString((char)dict.get(phrase).intValue());
            out2.add(out);
        }
        else{
            out = Character.toString((char)Character.codePointAt(phrase,0));
            out2.add(out);
        }
        out="";
        for(String outchar:out2){
            out+=outchar;
        }
        return out;
    }

    public String lzw_extract(String s){
        HashMap<Integer,String> dict = new HashMap<>();
        String[] data = (s + "").split("");
        String currChar = data[0];
        String oldPhrase = currChar;
        String out = currChar;
        int code = 256;
        String phrase="";
        for(int i=1;i<data.length;i++){
            int currCode = Character.codePointAt(data[i],0);
            if(currCode < 256){
                phrase = data[i];
            }
            else{
                if(dict.get(currCode) != null){
                    phrase = dict.get(currCode);
                }
                else{
                    phrase = oldPhrase + currChar;
                }
            }
            out+=phrase;
            currChar = phrase.substring(0,1);
            dict.put(code,oldPhrase+currChar);
            code++;
            oldPhrase = phrase;
        }
        return out;
    }
}
