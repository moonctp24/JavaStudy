package com.company;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // 스택 정의 및 값 저장
        Stack<String> myStack = new Stack<>();
        myStack.push("0");
        myStack.push("1");
        myStack.push("3");

        // 큐 정의 및 값 저장
        Queue<String> myQueue = new LinkedList<>();
        myQueue.offer("0");
        myQueue.offer("1");
        myQueue.offer("4");

        // 스택 꺼내면서 읽기
        System.out.println("Stack =========== start");
        while (!myStack.empty()){
            System.out.println(myStack.pop());
        }
        System.out.println("Stack =========== End");

        // 큐 꺼내면서 읽기
        System.out.println("Queue =========== start");
        while(!myQueue.isEmpty()){
            System.out.println(myQueue.poll());
        }
        System.out.println("Queue =========== End");
    }
}
