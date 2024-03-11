package queue;

import data.types.Dog;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> dogQueue = new LinkedList<String>();
//        Dog dog1 = new Dog();
//        Dog dog2 = new Dog();
//        Dog dog3 = new Dog();
//        Dog dog4 = new Dog();

        dogQueue.offer("dog3");
        dogQueue.offer("dog1");
        dogQueue.offer("dog4");
        dogQueue.offer("dog2");

        System.out.println(dogQueue);

        System.out.println(dogQueue.poll());//dog3

        System.out.println(dogQueue);
        dogQueue.offer("dog5");
        System.out.println(dogQueue);
    }
}
