package com.zhb;

import edu.princeton.cs.algs4.Insertion;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author tyx
 */
public class testInsertion {
    public static void main(String[] args) {
        //String[] a = StdIn.readAllStrings();
        Comparable[] a = new Comparable[]{45, 55, 56, 2, 3, 23, 14, 7, 86, 32};
        int[] b = Insertion.indexSort(a);
        for (int i = 0; i < b.length; i++) {
            StdOut.println(b[i]);
        }
    }
}
