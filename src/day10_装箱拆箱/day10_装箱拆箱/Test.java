package day10_装箱拆箱;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        double d1 = new Scanner(System.in).nextDouble();
        //创建BigDecimal对象用valueof方法创建，其作用是进行精确的浮点数运算
        BigDecimal bd1 = BigDecimal.valueOf(4.9);
        BigDecimal bd2 = BigDecimal.valueOf(d1);
        //其multiply方法是对象bd1和bd2相除的结果
        double d2 = bd1.multiply(bd2).multiply(bd2).doubleValue();
        System.out.println(d2);
    }
}
