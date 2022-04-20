package com.company;

import java.util.*;

public class Main {
    Queue<String> myQueue = new LinkedList<>();

    static Stack st1 = new Stack<>();
    static Stack st2 = new Stack<>();

    public static <T> void stackPush(T value){
        st1.push( value);
    }

    public static <T> T stackPop(){
        int fixSize = st1.size();

        if(st2.empty()){
            for(int i=0;i<fixSize;i++){
                st2.push(st1.pop());
            }
        }

        //System.out.println(st2.pop());
        return (T) st2.pop();

    }

    public static void main(String[] args) {
        /* Stack 두개로 Queue 구현하기 */
        /*
        1 2 3 4 5
        2개 빼고
        6 7 8
        4개 뺄거야
        9
        3개 다 빼
        *
         */

        stackPush(1);
        stackPush(2);
        stackPush(3);
        stackPush(4);
        stackPush(5);

        stackPop();
        stackPop();

        stackPush(6);
        stackPush(7);
        stackPush(8);
        stackPop();
        stackPop();
        stackPop();
        stackPop();
        stackPop();


        stackPush(9);

        stackPop();
        stackPop();


        /*

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
         */
    }
}
