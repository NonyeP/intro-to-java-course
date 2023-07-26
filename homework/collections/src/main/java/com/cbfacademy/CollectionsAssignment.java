package com.cbfacademy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionsAssignment {
    public static void main(String[] args) {
        //numbers = new ArrayList<>(List.of(8, 12, 4, 10, 13, 5, 2, 12, 11, 14));
        //Integer[] a = new Integer[]{213, 54, 91, 187, 2001, 2023}; //[Fizz, Fizz, 91, 187, Fizz, 2023];
        //String[] a1 = new String[]{"Apple","Boy","Cat","Boy","Cat","Boy"};
        //String[] a2 = new String[]{};
        List<Integer> numbers;
        numbers = new ArrayList<>(List.of(8, 12, 4, 10, 13, 5, 2, 12, 11, 14)); //= Arrays.asList(a);
        removeSmallInts(numbers, 10);
        //     List<Integer> b = new ArrayList<>();
    //     b.add(1);
    //     b.add(2);
    //     b.add(4);
    //     b.add(8);
    //     b.add(11);
    //     b.add(13);
    //     b.add(17);
    //     List<String> names = Arrays.asList(a1);
    //     List<String> names2 = Arrays.asList(a2);


    //     System.out.println(mostFrequent(names));
    //     System.out.println(mostFrequent(names2));
    //     System.out.println();
    //     Collection<Integer> numbers2 = new ArrayList<>();
    //     numbers2.add(2);
    //     numbers2.add(1);
    //     numbers2.add(2);
    //     numbers2.add(3);

    //     Collection<Integer> numbers3 = new ArrayList<>();
    //     numbers3.add(3);
    //     numbers3.add(4);
    //     numbers3.add(4);
    //     numbers3.add(5);

    //     System.out.println("Collection1 = " + numbers2);
    //     System.out.println("Collection2 = " +numbers3);
    //     System.out.println(inBoth(numbers2,numbers3));
    //     System.out.println(inEither(numbers2,numbers));
    //     System.out.println(containsDuplicates(numbers2));


    //    removeSmallInts(b,15);
    }

    /**
     * This method removes all values from the provided list that are smaller
     * than the indicated integer. The remaining elements retain their original
     * ordering.
     *
     * @param list   - the list of integers
     * @param minValue the minimum value to retain
     */
    public static void removeSmallInts(List<Integer> list, int minValue) {
        // Your solution must traverse the list from last to first element
        // removing any values less than minValue.
        int min = minValue;
                int x = 0;
                List<Integer> list2 = new ArrayList<>();//reversed list
                List<Integer> list3 = new ArrayList<>();//list of numbers less than min = newReverse list
                for (int i = list.size() - 1; i >= 0; --i) {
                    x = list.get(i);
                    list2.add(list.get(i));
                   

                    if (x < min) {
                        
                        list3.add(x);
                        list2.remove(Integer.valueOf(x));
                    }
                    
                }
                System.out.println("List of Numbers less than input = " + list3);
                System.out.println("New Reverse List = " + list2);

    }

    /**
     * This method returns true if the provided collection contains any
     * duplicate elements.
     *
     * @param integers - a collection of integers
     * @return true if integers contains duplicates, false otherwise
     */
    public static boolean containsDuplicates(Collection<Integer> integers) {
        // Your solution must not use any loops.
        boolean flag = false;
        System.out.println("Collection size = " + integers.size());
            Set<Integer> duplicates = new HashSet<>();
            duplicates.addAll(integers);
            System.out.println("Set size = " + duplicates.size());
            if (integers.size() > duplicates.size()) {
                System.out.println("Collection contains duplicates.");
                flag = true;
                return flag;
            } else {
                System.out.println("Collection does not contain duplicates.");
                flag = false;
                return flag;
            }
        
    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * either of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order.
     * <p>
     * For example, if the two arguments contain {2, 1, 2, 3} and {3, 4, 4, 5},
     * the returned ArrayList will contain {1, 2, 3, 4, 5}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return A sorted ArrayList containing the integers that appear in either
     * collection.
     */
    public static ArrayList<Integer> inEither(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.
        SortedSet<Integer>  list = new TreeSet<>();
            list.addAll(ints1);
            list.addAll(ints2);
            System.out.println("List 1 = " + ints1);
            System.out.println("List 2 = " + ints2);
            System.out.println("Merged and sorted list = " + list);
            ArrayList<Integer> arr= new ArrayList<>();
            arr.addAll(list);
            System.out.println("Sorted arraylist = " + arr);
          return arr;
    }

    /**
     * This method returns an ArrayList containing all elements that appear in
     * both of the two collection arguments. There will be no duplicate values
     * in the resulting ArrayList. The values in the returned ArrayList must be
     * in sorted order. For example, if the two arguments contain {2, 1, 2, 3} and
     * {3, 4, 4, 5}, the returned ArrayList will contain {3}. The original
     * collections will not be modified.
     *
     * @param ints1 - the first collection
     * @param ints2 - the second collection
     * @return An ArrayList containing the integers that appear in both
     * collections.
     */
    public static ArrayList<Integer> inBoth(Collection<Integer> ints1, Collection<Integer> ints2) {
        // This must be done with no loops.
        SortedSet<Integer> list1 = new TreeSet<>();
        list1.addAll(ints1);
        System.out.println("New Sorted list of collection1 = " + list1);
        SortedSet<Integer> list2 = new TreeSet<>();
        list2.addAll(ints2);
        System.out.println("New Sorted list of collection2 = " + list2);
        System.out.println("The common integers are: ");
        list1.retainAll(list2);//lists of common integers are kept in list1
        ArrayList<Integer> arr = new ArrayList<>();
        arr.addAll(list1);//common integers
        return arr;
        
        
    }

    /**
     * This method returns the String that appears most frequently in the
     * provided list. For example, if the input list contains the elements
     * {"Bob", "Alice", "Bob"}, this method will return "Bob". If there are
     * ties, any of the most frequently occurring elements may be returned.
     * If the list is empty, return the empty string "".
     *
     * @param list - a list of Strings
     * @return the most frequently occurring String
     */
    public static String mostFrequent(List<String> list) {
        // You should solve this problem in two stages: First iterate through
        // the list to count occurrences of each String. Then iterate through
        // your counts to find the largest. You'll need a collection that allows
        // you to store a mapping from Strings to counts.
        // No nested loops or non-enhanced for-loops are allowed.
        Map<String, Integer> map = new HashMap<>();
            String freq = "";
            Map.Entry<String, Integer> max = null;

            if (list.isEmpty()) {
                System.out.println("list is empty");
                return freq;
            } else {
            for (String t : list) {
                Integer val = map.get(t);
                map.put(t, val == null ? 1 : val + 1);
            }



            for (Map.Entry<String, Integer> e : map.entrySet()) {
                if (max == null || e.getValue() > max.getValue())
                    max = e;
            }



                List<String> newList = new ArrayList<>();
                newList.addAll(list);

                String[] arr = null;    //convert newList to array as list
                arr = newList.toArray(new String[newList.size()]);
                System.out.println(Arrays.toString(arr));  //print array to String

                //get unique elements in the array
                Map<String, Integer> duplicate = Arrays.stream(arr).collect(Collectors.toMap(Function.identity(),
                        c -> 1, Math::addExact));
                System.out.println("\n2. Unique elements in String[] array : \n");
                duplicate
                        .entrySet()
                        .stream()
                        .forEach(entry -> System.out.println(entry.getKey()));

                //get duplicated elements iin the array
                System.out.println("\n3. Duplicate elements in String[] array : \n");
                duplicate
                        .entrySet()
                        .stream()
                        .filter(entry -> entry.getValue() > 1)
                        .forEach(entry -> System.out.println(entry.getKey()));
                System.out.println("\n4. Map Key as c and value as its duplicate count : \n");
                duplicate.forEach(
                        (key, value) -> System.out.println("Key : " + key + "\t Count : " + value));

                int maxValueInMap = (Collections.max(duplicate.values()));
                System.out.println(maxValueInMap);
    

            }
            System.out.println("String that contains max value = " + max.getKey());
            return max.getKey();
    }

    public static String getName() {
        return "Collections Assignment";
    }
}
