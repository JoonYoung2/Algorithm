package chatgpt.sort;

import java.util.Arrays;

/*
	병합 정렬 (Merge Sort)
	문제: 배열을 정렬하는 알고리즘.
	동작 원리:
	배열을 절반으로 나눔.
	각각 재귀적으로 정렬.
	두 배열을 병합하여 정렬된 배열을 만듦.
 */
public class MergeSort_01 {
	public static void mergeSort(int[] arr, int left, int right) {
        if (left >= right) return; // 기저 조건

        int mid = (left + right) / 2;
        // 분할 단계
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);

        // 병합 단계
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;

        // 두 부분 배열을 병합
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) temp[k++] = arr[i++];
            else temp[k++] = arr[j++];
        }

        // 남은 원소 병합
        while (i <= mid) temp[k++] = arr[i++];
        while (j <= right) temp[k++] = arr[j++];
        // 정렬된 결과를 원래 배열에 복사
        System.arraycopy(temp, 0, arr, left, temp.length);
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
