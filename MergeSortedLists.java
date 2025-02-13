import java.util.*;

public class MergeSortedLists {
    public static List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>(list1.size() + list2.size());
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                mergedList.add(list1.get(i++));
            } else {
                mergedList.add(list2.get(j++));
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i++));
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j++));
        }
        return mergedList;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(3, 7, 10, 8, 11, 9);
        List<Integer> list2 = Arrays.asList(1, 5, 2, 4, 6, 12);

        Collections.sort(list1);
        Collections.sort(list2);

        List<Integer> mergedList = mergeSortedLists(list1, list2);
        System.out.println("Merged List: " + mergedList);
    }
}
