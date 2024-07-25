public class InsertionSort {
    public void sort(int[] toSort){
        for (int key, i = 0,j = 1; j < toSort.length; j++) {
            key = toSort[j];
            i = j-1;
            while (i >= 0 && toSort[i] > key) {
                toSort[i + 1] = toSort[i];
                i--;
            }
            toSort[i + 1] = key;
        }
    }
}