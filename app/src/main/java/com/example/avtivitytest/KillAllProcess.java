package com.example.avtivitytest;

public class KillAllProcess {
    public static void KillAll(){
//       下面的 KillProcess 只能杀掉当前程序的进程，不能去杀掉其他程序的进程：
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
