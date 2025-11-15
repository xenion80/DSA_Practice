class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[1001];

        for (int n : arr1) freq[n]++;

        int idx = 0;

        for (int n : arr2) {
            while (freq[n] > 0) {
                arr1[idx++] = n;
                freq[n]--;
            }
        }

        for (int n = 0; n < freq.length; n++) {
            while (freq[n] > 0) {
                arr1[idx++] = n;
                freq[n]--;
            }
        }

        return arr1;
    }
}
