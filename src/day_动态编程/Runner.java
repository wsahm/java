package day_动态编程;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    private static List<String> a = new ArrayList<>();

    static {
        try {
            String path = Runner.class.getResource("/day_动态编程/cfg.txt").getPath();//获得cfg.txt的路径
            path = URLDecoder.decode(path, "utf-8");
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));
            String line;
            while ((line = in.readLine()) != null) {
                line = line.trim();
                if (line.startsWith("#") || line.length() == 0) {
                    continue;
                }
                a.add(line);
            }
            in.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void launch() {
        try {
            for (String a1 : a) {
                String[] s = a1.split(",");
                Class<?> c = Class.forName(s[0]);
                Object o = c.newInstance();
                Method m = c.getMethod(s[1], String.class);
                Object o1 = m.invoke(o, "初始参数");
                System.out.println(o1);
            }
        } catch (Exception e) {
            System.out.println("执行失败");
        }
    }
}
