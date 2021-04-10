package com.zhb;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author zhb
 */
public class Evaluate {
    public static void main(String []args){
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<>();

        String sc = StdIn.readString();
        String []s  = new String[sc.length()];
        for(int i =0;i<sc.length();i++){
            s[i] = String.valueOf(sc.charAt(i));
        }
        int i = 0;
        while(i<s.length){
            //读取字符，如果是运算符则压入栈
            if(s[i].equals("(")){
            }
            else if (s[i].equals("+")) {
                ops.push(s[i]);
            }
            else if (s[i].equals("-")){
                ops.push(s[i]);
            }
            else if (s[i].equals("*")) {
                ops.push(s[i]);
            }
            else if (s[i].equals("/")){
                ops.push(s[i]);
            }
            else if (s[i].equals("sqrt")) {
                ops.push(s[i]);
            }
            else if (s[i].equals(")")){
                //如果字符为“）”，弹出运算符和操作数，计算结果压入栈

                String op = ops.pop();
                double v = vals.pop();
                if(op.equals("+")) {
                    v = vals.pop() + v;
                }else if (op.equals("-")) {
                    v = vals.pop() - v;
                }else if (op.equals("*")) {
                    v = vals.pop() * v;
                }else if (op.equals("/")) {
                    v = vals.pop() / v;
                }else if (op.equals("sqrt")) {
                    v = Math.sqrt(v);
                }
                vals.push(v);
            }
            //如果字符不是运算符也不是括号，将它作为double值压入栈
            else {
                vals.push(Double.parseDouble(s[i]));
            }
            i++;
        }
        StdOut.println(vals.pop());
    }
}
