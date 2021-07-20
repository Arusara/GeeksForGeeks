public class BinarySearch {

    public static void main(String[] args) {
        int inputArr[] = new int[] {0, 5, 5, 5, 5, 5,6};
        int x = 1;
        int index = binarySearch(inputArr, x);
        System.out.println(index);
        if (index > inputArr.length-1 || index <0) {
            System.out.println("The element is not found");
        } else {
            System.out.println("The element is found");
            // traverse two direction to find the count.
            // left
            int count =1;
            int i = index-1;
            while(i>=0 && inputArr[i]==x) {
                count++;
                i--;
            }
            // right
            int j = index+1;
            while (j<inputArr.length && inputArr[j]==x) {
                count++;
                j++;
            }
            System.out.println("The frequency of element is:: "+count);
        }
    }

    private static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length-1;

        while(left<=right) {

            int middle = left +(right-left)/2;

            if (arr[middle] == x) {
                return middle;
            }

            if (arr[middle]>x) {
                right = middle -1;
            } else {
                left = middle +1;
            }

        }
        return -1;
    }
}
