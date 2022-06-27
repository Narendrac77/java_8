package src.demo;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        Sample sample = new Sample("Giri", "ZPHS", "B-TCH");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String input = sc.nextLine();
        System.out.println(input);
        System.out.println(sample);
        List<Integer> list = new ArrayList<>(2);
        list.add(6);
        System.out.println(list);

        System.out.println(list.contains(7));
    }

    public boolean remove(Object o) {
        final Object[] es = null;
        final int size = 0;
        int i = 0;
        found: {
            if (o == null) {
                for (; i < size; i++)
                    if (es[i] == null)
                        break found;
            } else {
                for (; i < size; i++)
                    if (o.equals(es[i]))
                        break found;
            }
            return false;
        }
        return true;
    }


    }

