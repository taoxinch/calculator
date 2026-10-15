package com.taoxincheng;

public class App {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        // args[0], args[1], args[2] 分别对应运行命令时输入的三个参数
        double r = c.eval(args[0], args[1], args[2]);
        System.out.println(r);
    }
}