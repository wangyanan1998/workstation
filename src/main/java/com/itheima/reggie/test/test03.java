package com.itheima.reggie.test;

public class test03 {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
public static int sum(int n){
        //return (n+1)/2*n;
    int retval=0,i;

    for (i=0;i<n;retval += i++);
    return retval;
}
}
