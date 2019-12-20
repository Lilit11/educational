
package com.lilit.hakobyan;

import javax.sound.midi.Soundbank;
import javax.xml.transform.sax.SAXSource;
import java.sql.SQLOutput;
import java.util.*;
import java.util.concurrent.*;


public class Main {


    public static void main(String[] args) {
        MyKey myKey1 = new MyKey();
        MyKey myKey2 = new MyKey();
        MyKey myKey3 = new MyKey();
        MyKey myKey4 = new MyKey();
        MyKey myKey5 = new MyKey();
        MyKey myKey6 = new MyKey();
        MyKey myKey7 = new MyKey();
        MyKey myKey8 = new MyKey();
        MyKey myKey9 = new MyKey();
        MyKey myKey10 = new MyKey();


//        MyKey myKey = new MyKey(1, "mek", 19.5);
//        MyKey myKey2 = new MyKey(2, "erku", 20.9);
//        MyKey myKey3 = new MyKey(3, "ereq", 19.5);
//        MyKey myKey4 = new MyKey(4, "chors", 20.9);
//        MyKey myKey5 = new MyKey(5, "hing", 19.5);
//        MyKey myKey6 = new MyKey(6, "vec", 20.9);
//        MyKey myKey7 = new MyKey(7, "yot", 19.5);
//        MyKey myKey8 = new MyKey(8, "ut", 20.9);
//        MyKey myKey9 = new MyKey(9, "iny", 19.5);
//        MyKey myKey10 = new MyKey(10, "tas", 20.9);
        HashMap <MyKey,String> hashmapik = new HashMap<>();
        hashmapik.put(myKey1, "num1");
        hashmapik.put(myKey2, "num2");
        hashmapik.put(myKey3, "num3");
        hashmapik.put(myKey4, "num4");
        hashmapik.put(myKey5, "num5");
        hashmapik.put(myKey6, "num6");
        hashmapik.put(myKey7, "num7");
        hashmapik.put(myKey8, "num8");
        hashmapik.put(myKey9, "num9");
        hashmapik.put(myKey10, "num10");
        hashmapik.put(myKey1, "num1");
        hashmapik.put(myKey2, "num2");
        hashmapik.put(myKey3, "num3");
        hashmapik.put(myKey4, "num4");
        hashmapik.put(myKey5, "num5");
        hashmapik.put(myKey6, "num6");
        hashmapik.put(myKey7, "num7");
        hashmapik.put(myKey8, "num8");
        hashmapik.put(myKey9, "num9");
        hashmapik.put(myKey10, "num10");


    Set set =hashmapik.entrySet();

    System.out.println(hashmapik.size());
    System.out.println(set);
        System.out.println("1st is " + myKey1.hashCode());
        System.out.println("2nd is " + myKey2.hashCode());
        System.out.println("3rd is " + myKey3.hashCode());
        System.out.println("4th is " + myKey4.hashCode());
        System.out.println("5th is " + myKey5.hashCode());
        System.out.println("6th is " + myKey6.hashCode());
        System.out.println("7th is " + myKey7.hashCode());
        System.out.println("8th is " + myKey8.hashCode());
        System.out.println("9th is " + myKey9.hashCode());
        System.out.println("10th is " + myKey10.hashCode());
    }

    }



































//        Scanner ss = new Scanner(System.in);
//        System.out.println();
//
//
//        //java {collection interface name} implementation
//
//        //set
//        //1
//
//        ChTest chTest = new ChTest();
//        chTest.nonStatic();
//        chTest.isStatic();
//        ChTest.isStatic();
//
//        Set<String> mek = new HashSet<>(); //
//        Set<String> erku = new LinkedHashSet<>(); //
//        Set<String> ereq = new TreeSet<>(); //
//        Set<String> chors = new CopyOnWriteArraySet<>();
//        Set<Color> hing = EnumSet.allOf(Color.class);
//
//        System.out.println();
//
//        SortedSet<String> vec = new SortedSet<String>() {
//            @Override
//            public Comparator<? super String> comparator() {
//                return null;
//            }
//
//            @Override
//            public SortedSet<String> subSet(String fromElement, String toElement) {
//                return null;
//            }
//
//            @Override
//            public SortedSet<String> headSet(String toElement) {
//                return null;
//            }
//
//            @Override
//            public SortedSet<String> tailSet(String fromElement) {
//                return null;
//            }
//
//            @Override
//            public String first() {
//                return null;
//            }
//
//            @Override
//            public String last() {
//                return null;
//            }
//
//            @Override
//            public int size() {
//                return 0;
//            }
//
//            @Override
//            public boolean isEmpty() {
//                return false;
//            }
//
//            @Override
//            public boolean contains(Object o) {
//                return false;
//            }
//
//            @Override
//            public Iterator<String> iterator() {
//                return null;
//            }
//
//            @Override
//            public Object[] toArray() {
//                return new Object[0];
//            }
//
//            @Override
//            public <T> T[] toArray(T[] a) {
//                return null;
//            }
//
//            @Override
//            public boolean add(String s) {
//                return false;
//            }
//
//            @Override
//            public boolean remove(Object o) {
//                return false;
//            }
//
//            @Override
//            public boolean containsAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(Collection<? extends String> c) {
//                return false;
//            }
//
//            @Override
//            public boolean retainAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean removeAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public void clear() {
//
//            }
//        };
//
//
//        System.out.println();
//
//        //queue
//        Queue<String> queue = new PriorityQueue<String>();
//        DelayQueue que = new DelayQueue();
//        LinkedTransferQueue queue1 = new LinkedTransferQueue();
//        ArrayBlockingQueue queue2 = new ArrayBlockingQueue(0);
//
//
//        //List
//        ArrayList<String> arrayList1 = new ArrayList();//
//        Vector arrayList2 = new Vector();
//        Stack arrayList3 = new Stack();
//        LinkedList arrayList4 = new LinkedList(); //
//
//
//        //Sorted map
//        Hashtable<String, String> hash1 = new Hashtable<>();
//        HashMap<String, String> hash2 = new HashMap<>(); //
//        TreeMap<String, String> hash3 = new TreeMap<>(); //
//        LinkedHashMap<String, String> hash4 = new LinkedHashMap<>();
//        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
//        //Concurrent map
//    }
//
//
//}
//
//
////        for(int i = 0; i < array.length; i++){
//            for (int j = i; j < array.length; j++){
//                System.out.println();
//                if(array[j] < array[i]){
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//                System.out.println();j


//        for (int i = (array.length-1); i>0; i--)
//            for (int j = 0; j < i; j++) {
//
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j + 1];
//                    array[j + 1] = array[j];
//                    array[j] = temp;
//
//
//                }
//            }







