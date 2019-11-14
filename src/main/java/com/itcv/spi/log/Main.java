package com.itcv.spi.log;
import java.util.Iterator;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<Log> serviceLoader = ServiceLoader.load(Log.class);
        Iterator<Log> iterator = serviceLoader.iterator();
         while (iterator.hasNext()) {
             Log log = iterator.next();
             log.excute();
            }
    }
}
