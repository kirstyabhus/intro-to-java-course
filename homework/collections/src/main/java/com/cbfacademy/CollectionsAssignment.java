package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;

public class CollectionsAssignment {

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
        list.removeIf(x -> (x < minValue));
    
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
        // create set from given collection
        Set<Integer> integersSet = new HashSet<>(integers);
        
        // sets cannot contain duplicates, so turning to set will remove duplicates
        if (integers.size() != integersSet.size()) {
            return true;
        } else {
            return false;
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
        // convert the collections to Sets
        Set<Integer> ints1Set = new HashSet<>(ints1);
        Set<Integer> ints2Set = new HashSet<>(ints2);


        // adds all elements from ints2 set into ints1 set IF THEY ARE NOT ALREADY IN THE SET
        // i.e. no duplicates will be added
        ints1Set.addAll(ints2Set);

        return new ArrayList<Integer>(ints1Set);
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
        Set<Integer> ints1Set = new HashSet<>(ints1);
        Set<Integer> ints2Set = new HashSet<>(ints2);

        // keeps only elements in ints1Set that are also present in ints2 set
        ints1Set.retainAll(ints2Set);

        // return set as ArrayList
        return new ArrayList<>(ints1Set);
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

        if (list.size() == 0) {
            return "";
        }

        HashMap<String, Integer> stringCount = new HashMap<>();

        // You should solve this problem in two stages: First iterate through
        // the list to count occurrences of each String.
        for (String s : list) {
            stringCount.compute(s, (key, val) -> (val == null) ? 1 : val+1);
        }
        
        // store the max value from the values in the count Map
        ArrayList<Integer> mapValues = new ArrayList<>(stringCount.values());
        // Integer maxValue = Collections.max(stringCount.values());
        Integer maxValue = Collections.max(mapValues);

        for (String s : list) {
            if (stringCount.get(s).equals(maxValue)) {
                return s;
            }
        }
        // Then iterate through
        // your counts to find the largest. You'll need a collection that allows
        // you to store a mapping from Strings to counts.
        // No nested loops or non-enhanced for-loops are allowed.
    }

    public static String getName() {
        return "Collections Assignment";
    }
}
