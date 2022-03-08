package src.generics;

import java.util.ArrayList;
import java.util.List;

//Problems without generics
//1. Needs Explicit casting.
//2. Lacks type safety.

public class NonGenericsCode {

    public static void main(String[] args) {

        List values = new ArrayList();
        values.add("English");
        Object obj = new String("Swedish");
        values.add(obj);
        values.add(56);
        values.add('c');
        values.add(67.90);
        processLanguages(values);
    }

    private static void processLanguages(List data){
        String language = (String) data.get(0);
        System.out.println(language);
    }

}
