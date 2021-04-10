package com.zhb;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author zhb
 */
public class Main {

    public static void main(String[] args) {
        // write your code here

        //创建一个栈并根据StdIn中的指示压入或弹出字符串
        Stack<String> s = new Stack<>();
        while(!StdIn.isEmpty()){
            String item = StdIn.readString();
            if(!item.equals("-")){
                s.push(item);
            }else if (!s.isEmpty()){
                StdOut.print(s.pop() + " ");
            }else{
                break;
            }
        }
        System.out.println("(" + s.size() + "left on stack)");
        StdOut.println("(" + s.size() + "left on stack)");
    }
}
