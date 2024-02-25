/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo2_linkedlist.single;

import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author Admin
 */
public class StudentMng {

          /**
           * @param args the command line arguments
           */
          public static void main(String[] args) {
                    Comparator<Student> comp = new Comparator<Student>() {
                              @Override
                              public int compare(Student o1, Student o2) {
                                        return o1.compareTo(o2);
                              }
                    };
                    SinglyLinkedList<Student> list = new SinglyLinkedList<>();
                    list.setCompareObj(comp);
                    Student st = new Student("SE123456", "Hoa", 7);
                    list.addFirst(st);
                    st = new Student("SE61098", "Chien", 8);
                    list.addLast(st);
                    st = new Student("SE151222", "Hoang", 7);
                    list.addFirst(st);
                    st = new Student("SE405211", "William", 4);
                    list.addData(2, st);

                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                              System.out.println(it.next());
                    }

                    String id = "SE405211";
                    int post = list.search(new Student(id));
                    if (post >= 0) {
                              System.out.println(id + " found.");
                    } else {
                              System.out.println(id + " Not found.");
                    }
                    id = "SE499999";
                    post = list.search(new Student(id));
                    if (post >= 0) {
                              System.out.println(id + " found.");
                    } else {
                              System.out.println(id + " Not found.");
                    }
                    System.out.println("******** SORT");

                    list.ascSort();
                    it = list.iterator();
                    while (it.hasNext()) {
                              System.out.println(it.next());
                    }
          }
}
