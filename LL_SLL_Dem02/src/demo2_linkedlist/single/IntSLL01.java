package demo2_linkedlist.single;

import java.util.Comparator;
import java.util.Iterator;

public class IntSLL01 {

          public static void main(String[] args) {
                    SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
                    //test chuc nang them vao
                    list.addFirst(3);
                    list.addFirst(2);
                    list.addFirst(4);
                    list.addFirst(1);
                    list.print(); // 1 4 2 3

                    //test chuc nang duyet xuat ko dung iterator
                    System.out.println();
                    list.addLast(12);
                    list.addLast(9);
                    list.addLast(11);
                    list.addLast(10);
                    list.print(); // 1 4 2 3 12 9 11 10
                    System.out.println();
                    list.addData(5, 7);
                    list.addData(5, 12);
                    System.out.println("Using ierator for traversing");
                    //test duyệt bằng iterator
                    // xuất kết quả là : 1 4  2 3 12 12 7 9 11 10
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                              System.out.println(it.next() + " ");
                    }
                    System.out.println();
                    //test chuc nang tim kiem
                    int val = 100;
                    int index = list.search(val);
                    System.out.println("Index of " + val + ": " + index); // index of 100:-1
                    val = 7;
                    index = list.search(val);
                    System.out.println("Index of " + val + ": " + index); // index of 7:6
                    // test chuc nang cap nhat
                    System.out.println("Chang 7 to 70");
                    list.set(index, 70);
                    list.print(); // 1 4 2 3 12 12 70 9 11 10
                    //test chuc nang xoa
                    System.out.println("\nRemove 12, 70:");
                    list.remove(5); //12
                    list.remove(5); // 70
                    it = list.iterator(); //1 4 2 3 12 9 11 10
                    while (it.hasNext()) {
                              System.out.println(it.next() + " ");
                    }
                    System.out.println("\nSize: " + list.size());
                    //test chuc nang sort
                    System.out.println("\nAfter ascending sort");
                    //tao object cho viec so sanh 2 so nguyen
                    Comparator comp = new Comparator() {
                              @Override
                              public int compare(Object o1, Object o2) {
                                        Integer i1 = (Integer) o1;
                                        Integer i2 = (Integer) o2;
                                        return i1.compareTo(i2);

                              }
                    };
                    list.setCompareObj(comp);
                    list.ascSort();
                    list.print(); // 1 2 3 4 9 10 11 12
                    System.out.println();
          }
}
