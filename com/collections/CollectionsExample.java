package com.collections;

import java.awt.image.ImageProducer;
import java.util.*;
import java.util.stream.Collectors;

public class CollectionsExample {


     public static void main(String[] args) {
          List<Integer> arrayList = new ArrayList<>();
          Vector<List<Integer>> vector = new Vector<>();
          Stack<Integer> stack = new Stack<>();
          Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        int[] arr = {2,6,7,8,9};

//        for(int i : arr){
//            arrayList.add(i);
//        }
//        arrayList.forEach( e -> System.out.println(e));
        List<Integer> newArrayList = arrayList.stream().toList();
//        newArrayList = Arrays.asList(10,20,30);
//        System.out.println(newArrayList);
//        int element = arrayList.get(2);
//        System.out.println(arrayList + " "+ element + " " + arrayList.stream().unordered().collect(Collectors.toList()));

//        vector.add(0,1);
//        vector.addElement(Arrays.asList(2,3,45,6));
//        vector.add(0,Arrays.asList(1,2,34,5));
//        vector.add(Arrays.asList(2,3,4,56));
//        System.out.println( vector.add(Arrays.asList(2,3,4,56))); true
//        System.out.println(vector);

//         stack oprations

//         stack.add(20);
//         stack.add(30);
//         stack.add(40);
//         stack.add(80);
//         System.out.println("stack peek "+stack.peek());
//         System.out.println(stack);
//         System.out.println("stack pop "+stack.pop());
//         System.out.println(stack);
//         System.out.println(stack.capacity());
//         System.out.println("stream print "+ stack.stream().collect(Collectors.toList()));
//         Stack<Integer> newStack = (Stack<Integer>) stack.clone();
//         System.out.println(newStack);
//         System.out.println(stack.push(100));
//         System.out.println(stack.add(120));
//         System.out.println(newStack.stream().collect(Collectors.toList()));
//         System.out.println(stack.stream().toList().get(2).compareTo(10));

//         queue oprations
//         queue.addAll(newArrayList);
//         System.out.println(queue);
//         System.out.println(queue.stream().distinct().collect(Collectors.toList()));
//         System.out.println(queue.remove(2));
//         System.out.println("ques after removing " +queue);
//         queue.add(123);
//         queue.offer(200);
//         queue.offer(0);
//         queue.offer(-1);
//         queue.remove();
//         queue.remove(4);
//         System.out.println(queue);
//         queue.poll();
//         System.out.println( " queue after offer"+queue);
//         Queue<Integer> newQueue = new LinkedList<>();
//         Deque<Integer> newdeque = new LinkedList<>();
//         newdeque.offer(300);
//         newdeque.offer(400);
//         newdeque.offer(600);
//         newdeque.offer(800);
//         System.out.println("implemented using linklist "+ newdeque);

//         newdeque.add(10);
//         System.out.println("newDueue" + newdeque.stream().collect(Collectors.toList()));
//         newdeque.forEach(System.out::println);

//         Deque<Integer> deque = new ArrayDeque<>();
//         deque.addAll(arrayList);
//         deque.offer(10);
//         System.out.println("deque " + deque);
//         deque.offerFirst(100);
//         System.out.println(deque.stream().collect(Collectors.toList()));
//         System.out.println("peak first "+ deque.peekFirst());
//         deque.poll();
//         System.out.println("after poll "+ deque.stream().collect(Collectors.toList()));
//         System.out.println("pop "+deque.pop());
//         System.out.println( "after pop "+ deque.stream().collect(Collectors.toList()));

//         set interface implementation and operations

//             HashSet

//         Set<Integer> hashSet = new HashSet<>();
//         hashSet.add(100);
//         hashSet.add(101);
//         hashSet.add(100);
//         hashSet.add(104);
//         hashSet.add(102);
//         hashSet.addAll(arrayList);
//         System.out.println(hashSet);
//         hashSet.removeAll(arrayList);
//         System.out.println(hashSet);

//     LinkedHashSet  - it preserve the order of insertion and store only unique elements and allow only one null

//         LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
//         linkedHashSet.addAll(newArrayList);
//         System.out.println(linkedHashSet);
//         linkedHashSet.remove(2);
//         linkedHashSet.add(2);
//         linkedHashSet.add(10);
//         linkedHashSet.add(100);
//         linkedHashSet.add(null);
//
//         System.out.println(linkedHashSet);

//         TreeSet - it implements the sortedset interface
//         conclusion - store elements in sorted order and not allow any null value

//         TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());
//         treeSet.addAll(newArrayList);
//         System.out.println(treeSet);
//         treeSet.add(1);
//         treeSet.add(0);
//         treeSet.add(6);
//         System.out.println(treeSet);
//         treeSet.add(2);
//         System.out.println(treeSet);

//         System.out.println( treeSet.descendingIterator().next());
//         Iterator<Integer> it = treeSet.iterator();
//         for (int i =0; i<treeSet.size();i++){
//             System.out.println(it.next());
//         }

//         treeSet.add(null); // give error null pointer exception
//         System.out.println(treeSet);
//         treeSet.add(null);
//         System.out.println(treeSet);

//        map interface - store unordered ,key:value pair
//          Map<Integer,Integer>  hashMap= new HashMap<>();

//            hashMap.put(0,10);
//            hashMap.putIfAbsent(1,20);
//            hashMap.putIfAbsent(1,20);
//            hashMap.put(3,200);
//         hashMap.put(5,200);
//         hashMap.put(-1,500);


//            hashMap.put(null,2);
//            hashMap.put(4,null);
//         System.out.println(hashMap);

//         hashMap.put(null,200);
//         hashMap.put(5,null);
//         System.out.println(hashMap);

//         sorted hashmap asc
//         Map<Integer, Integer> sortedByKey = new LinkedHashMap<>();
//         for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
//             sortedByKey.put(entry.getKey(), entry.getValue());
//         }
//
//         System.out.println("Sorted by keys: " + sortedByKey);

   // if hashmap contains any null then three map give null pointer exception
//    Map<Integer,Integer> newSortedKey = new TreeMap<>();
//    for (Map.Entry<Integer,Integer> e : hashMap.entrySet()){
//        newSortedKey.put(e.getKey(),e.getValue());
//    }
//         System.out.println(newSortedKey);



//   LinkedHashMap - store unorder and cam have only one null as a key and multiple null asa value

//     Map<Integer,Integer> linkedHashMap = new LinkedHashMap<>();
//     linkedHashMap.put(null,1);
//     linkedHashMap.put(0,2);
//
//     linkedHashMap.put(-1,4);
//         System.out.println(linkedHashMap);
//         linkedHashMap.put(null,9);
//         System.out.println(linkedHashMap);
//
//         linkedHashMap.put(20,null);
//         System.out.println(linkedHashMap);
//         linkedHashMap.put(20,2000);
//         System.out.println(linkedHashMap);
//
//         linkedHashMap.put(90,null);
//         linkedHashMap.put(100,null);
//         System.out.println(linkedHashMap);


//         TreeMap- not allow  even one null key but allows multiple null values

//         Map<Integer,Integer> treeMap = new TreeMap<>();
////         treeMap.put(null,1);
//         treeMap.put(9,3);
//
//         System.out.println(treeMap);
//         treeMap.put(1,3);
//         treeMap.put(-1,3);
//         treeMap.put(4,3);
//         treeMap.put(14,3);
//         System.out.println(treeMap);
//         treeMap.put(15,null);
//         treeMap.put(9,10);
//         System.out.println(treeMap);
//         treeMap.put(17,null);
//         treeMap.put(35,null);
//         System.out.println(treeMap);
     }

}
