package com.example.avtivitytest;

public class TestWine {
    public static void main(String[] args) {
        /**这里a 是父类型（Wine）定义的，指向子类型Jnc（），指向子类的父类引用由于向上转型了，它只能
         访问父类中拥有的方法和属性，而对于子类中存在而父类中不存在的方法，该引用是不能使用的，
         尽管是重载该方法。
        Wine a = new Jnc();*/
        /**下面这里a 定义的是Jnc类型，所以a.fun1(String)这个重载方法可以调用*/
        Jnc a =new Jnc();
        a.fun1("888");

    }
}
//