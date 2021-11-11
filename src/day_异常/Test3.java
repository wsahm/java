package day_异常;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        fun();
    }

    private static void fun() {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "2021-7-9", "2021-7-21", "2021-7-23");
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date d = null;
                Date d1 = null;
                try {
                    d = sdf.parse(o1);
                    d1 = sdf.parse(o2);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
                return d.compareTo(d1);
            }
        });
        System.out.println(list);
    }
}
