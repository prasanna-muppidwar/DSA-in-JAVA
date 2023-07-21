![Java Files](https://img.shields.io/badge/dynamic/json?color=blue&label=Java%20Files&query=java_files&url=https://raw.githubusercontent.com/prasanna-muppidwar/DSA-in-JAVA/tree/main/src/com/example/ArrayProblems/java_file_count.json)





![Banner](https://github.com/prasanna-muppidwar/DSA-in-JAVA/blob/main/Java%20Github%20Banner.png)
## Searching 
Searching is the process of finding a specific element or value within a collection of data. The collection can be an array, linked list, tree, hash table, or any other data structure that stores data in an organized manner.
1. Linear Search:
   - Syntax: 
     ```java
     public static int linearSearch(int[] arr, int target) {
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] == target) {
                 return i;
             }
         }
         return -1;
     }
     ```
   - Time Complexity: O(n)
   - Space Complexity: O(1)
   - Use Case: When the array is unsorted or small.
   - Advantages: Simplicity and no requirement for the array to be sorted.

2. Binary Search:
   - Syntax:
     ```java
     public static int binarySearch(int[] arr, int target) {
         int left = 0;
         int right = arr.length - 1;
         while (left <= right) {
             int mid = left + (right - left) / 2;
             if (arr[mid] == target) {
                 return mid;
             } else if (arr[mid] < target) {
                 left = mid + 1;
             } else {
                 right = mid - 1;
             }
         }
         return -1;
     }
     ```
   - Time Complexity: O(log n)
   - Space Complexity: O(1)
   - Use Case: When the array is sorted.
   - Advantages: Efficient search algorithm for sorted arrays, as it eliminates half the remaining elements at each step.


## Sorting
Sorting is the process of arranging the elements of a collection in a specific order, such as ascending or descending. Sorting is an essential operation in computer science and plays a crucial role in various algorithms and applications.
1. Bubble Sort:
   - Syntax:
     ```java
     public static void bubbleSort(int[] arr) {
         int n = arr.length;
         for (int i = 0; i < n - 1; i++) {
             for (int j = 0; j < n - i - 1; j++) {
                 if (arr[j] > arr[j + 1]) {
                     int temp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = temp;
                 }
             }
         }
     }
     ```
   - Time Complexity: O(n^2)
   - Space Complexity: O(1)
   - Use Case: Small arrays or when simplicity is more important than efficiency.
   - Advantages: Simple to implement and understand.

2. Selection Sort:
   - Syntax:
     ```java
     public static void selectionSort(int[] arr) {
         int n = arr.length;
         for (int i = 0; i < n - 1; i++) {
             int minIndex = i;
             for (int j = i + 1; j < n; j++) {
                 if (arr[j] < arr[minIndex]) {
                     minIndex = j;
                 }
             }
             int temp = arr[minIndex];
             arr[minIndex] = arr[i];
             arr[i] = temp;
         }
     }
     ```
   - Time Complexity: O(n^2)
   - Space Complexity: O(1)
   - Use Case: Small arrays or when simplicity is more important than efficiency.
   - Advantages: Simple implementation and fewer swaps compared to other sorting algorithms.

3. Insertion Sort:
   - Syntax:
     ```java
     public static void insertionSort(int[] arr) {
         int n = arr.length;
         for (int i = 1; i < n; i++) {
             int key = arr[i];
             int j = i - 1;
             while (j >= 0 && arr[j] > key) {
                 arr[j + 1] = arr[j];
                 j--;
             }
             arr[j + 1] = key;
         }
     }
     ```
   - Time Complexity: O(n^2)
   - Space Complexity: O(1)
   - Use Case: Small arrays or when the array is nearly sorted.
   - Advantages: Efficient for small data sets and performs well on partially sorted arrays.

4. Merge Sort:
   - Syntax:
     ```java
     public static void mergeSort(int[] arr, int left, int right) {
         if (left < right) {
             int mid = left + (right - left) / 2;
             mergeSort(arr, left, mid);
             mergeSort(arr, mid + 1, right);
             merge(arr, left, mid, right);
         }
     }
     
     public static void merge(int[] arr, int left, int mid, int right) {
         int n1 = mid - left + 1;
         int n2 = right - mid;
         int[] L = new int[n1];
         int[] R = new int[n2];
         for (int i = 0; i < n1; ++i)
             L[i] = arr[left + i];
         for (int j = 0; j < n2; ++j)
             R[j] = arr[mid + 1 + j];
         int i = 0, j = 0;
         int k = left;
         while (i < n1 && j < n2) {
             if (L[i] <= R[j]) {
                 arr[k] = L[i];
                 i++;
             } else {
                 arr[k] = R[j];
                 j++;
             }
             k++;
         }
         while (i < n1) {
             arr[k] = L[i];
             i++;
             k++;
         }
         while (j < n2) {
             arr[k] = R[j];
             j++;
             k++;
         }
     }
     ```
   - Time Complexity: O(n log n)
   - Space Complexity: O(n)
   - Use Case: Large arrays or when stability is important.
   - Advantages: Efficient for large data sets, stable, and has a consistent time complexity.


```mkdir -p src/com/example/LinearSearch
mkdir -p src/com/example/BinarySearch to create new subfolders``` 
