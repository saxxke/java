import java.util.ArrayList;

public class find {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 4, 4, 5 };
        System.out.println(Find(arr, 4, 0));

        System.out.println(findIndex(arr, 4, 0));

        System.out.println(findIndexLast(arr, 4, arr.length - 1));

        findAllIndex(arr, 4, 0);
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> ans = findAllIndex1(arr, 4, 0, list1);
        System.out.println(ans);
        System.out.println(list1);

        System.out.println(findAllIndex2(arr, 4, 0));

    }

    static boolean Find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || Find(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

    static int findIndexLast(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndexLast(arr, target, index - 1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }

    static ArrayList<Integer> findAllIndex1(int[] arr, int target, int index, ArrayList<Integer> list1) {
        if (index == arr.length) {
            return list1;
        }
        if (arr[index] == target) {
            list1.add(index);
        }
        return findAllIndex1(arr, target, index + 1, list1);
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list2 = new ArrayList<>();

        if (index == arr.length) {
            return list2;
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list2.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

        list2.addAll(ansFromBelowCalls);

        return list2;
    }

}