/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum3;

import java.util.LinkedList;
import java.util.Queue;


/**
 *
 * @author Ihzani Izzul Haq
 */

public class Latihan2 {
    public void queueExample(){
        Queue queue = new LinkedList();//
        queue.add("Java");//Menambahkan elemen
        queue.add("Dotnet");
        queue.offer("PHP");
        queue.offer("HTML");
        System.out.println("remove : " + queue.remove());
        System.out.println("element : " + queue.element());
        System.out.println("poll : " + queue.poll());
        System.out.println("peek : " + queue.peek());
    }

    public static void main(String[] args) {
        new  Latihan2().queueExample();
    }
}
