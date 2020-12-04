package com.bjpowernode.config;

public class ThreadLocalConfig {
    public static final ThreadLocal<String> threadLocal=new ThreadLocal<String>();
    public static String getDataSource(){
        return threadLocal.get();
    }
    public static void setDataSource(String dataSource){
        threadLocal.set(dataSource);
    }
}
