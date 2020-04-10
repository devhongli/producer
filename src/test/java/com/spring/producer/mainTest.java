package com.spring.producer;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class mainTest {

    public static void main(String[] args) {


//		test();
        test02();
    }

    private static void test02() {
        WriteTask_New write = new WriteTask_New();
        for(int i=0;i<4;i++){
            new Thread(write).start();
        }

        OutputTask output = new OutputTask("abc.txt");
        new Thread(output).start();
    }

//    private static void test() {
//        WriteTask write = new WriteTask("abc.txt");
//        for(int i=0;i<5;i++){
//            new Thread(write).start();
//        }
//    }

}
