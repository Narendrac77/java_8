package src.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.LongUnaryOperator;

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

        List arrayList = new ArrayList();
        Object obj2 = Integer.valueOf(5);
        Object obj3 = Character.valueOf('c');
        arrayList.add(obj2);
        arrayList.add(obj3);

        List<Object> objectList = new ArrayList<>();
        objectList.add(3);
        objectList.add("Narendra");
        objectList.add('C');
        objectList.add(34.05D);
        objectList.add(7234L);
        processLanguages(objectList);

    }

    private static void processLanguages(List data){
        String language = (String) data.get(0);
        System.out.println(language);
    }

}
