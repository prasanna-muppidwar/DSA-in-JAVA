
![Banner](https://github.com/prasanna-muppidwar/DSA-in-JAVA/blob/main/Java%20Github%20Banner.png)

[![Java Files](https://img.shields.io/badge/dynamic/json?color=blue&label=Java%20Files&query=java_files&url=https://raw.githubusercontent.com/prasanna-muppidwar/DSA-in_JAVA/main/count-java-files.json)](./count-java-files.json)



![LeetCode Stats](https://leetcard.jacoblin.cool/mprasanna5557?theme=light&font=Baloo%202)

# Important

## Time Complexities
 Time complexity is a measure that helps us understand how the running time of an algorithm or the execution time of a specific operation grows with the size of the input data. It's essential to analyze time complexity to compare different algorithms and choose the most efficient one for a particular problem.

Time complexity is typically expressed using "Big O" notation, which describes an upper bound on the growth rate of the running time relative to the size of the input (n). Here are some common time complexities and their explanations:

1. O(1) - Constant Time Complexity:
An algorithm with constant time complexity means its running time does not depend on the input size; it takes the same amount of time regardless of the input. For example, accessing an element from an array by its index or performing a basic arithmetic operation is constant time.

2. O(log n) - Logarithmic Time Complexity:
An algorithm with logarithmic time complexity divides the problem into smaller subproblems and solves them efficiently. Each division reduces the problem size by a constant factor (typically 2), like in binary search. As the input grows, the running time increases, but at a slower rate than linear time.

3. O(n) - Linear Time Complexity:
An algorithm with linear time complexity means its running time grows linearly with the input size. For example, iterating through an array or a list requires examining each element once.

4. O(n log n) - Linearithmic Time Complexity:
This complexity arises in algorithms like efficient sorting techniques (e.g., Merge Sort and Quick Sort). These algorithms partition the data and sort them in a divide-and-conquer manner, resulting in a time complexity between linear and quadratic.

5. O(n^2) - Quadratic Time Complexity:
An algorithm with quadratic time complexity has nested loops that iterate over the input data. As the input size grows, the running time increases quadratically. This is common in nested loops like bubble sort or insertion sort.

6. O(n^3) and beyond - Polynomial Time Complexity:
Similarly to quadratic time complexity, algorithms with higher polynomial time complexity have nested loops, and the running time grows at a faster rate. O(n^3) is common in some cubic algorithms.

7. O(2^n) - Exponential Time Complexity:
An algorithm with exponential time complexity grows rapidly with the input size. Solving a problem using brute force or recursion without memoization often results in exponential complexity.

8. O(n!) - Factorial Time Complexity:
This is the worst time complexity, where the running time grows as the factorial of the input size. Solving problems using a brute force approach without pruning can lead to factorial complexity.


## Space Complexity

Space complexity refers to the amount of memory or space required by an algorithm to execute as a function of the input size. It helps us understand how the memory usage grows as the input size increases. Space complexity is also commonly expressed using "Big O" notation, just like time complexity.

There are two main components contributing to space complexity:

1. Auxiliary Space:
Auxiliary space refers to the extra space used by an algorithm apart from the input data. It includes space required for variables, temporary data structures, recursion stack, etc. The auxiliary space does not include the space required to hold the input data. For instance, if you're sorting an array of n elements, the space needed to hold the array itself is not considered auxiliary space.

2. Input Space:
Input space is the space required to store the input data itself. For instance, if you are given an array of n elements, the space needed to hold that array is part of the input space.

Here are some common space complexities and their explanations:

1. O(1) - Constant Space Complexity:
An algorithm has constant space complexity if it uses a fixed amount of additional memory that doesn't depend on the input size. It means the memory consumption remains constant, regardless of the input size.

2. O(log n) - Logarithmic Space Complexity:
An algorithm has logarithmic space complexity if it requires memory that grows logarithmically with the input size. It is common in algorithms like binary search or divide-and-conquer approaches.

3. O(n) - Linear Space Complexity:
An algorithm has linear space complexity if its memory usage increases linearly with the input size. For example, if an algorithm needs to create an array of size n to store the input data, it has linear space complexity.

4. O(n^2) - Quadratic Space Complexity:
An algorithm with quadratic space complexity uses memory that grows quadratically with the input size. This is often seen in algorithms with nested loops and 2D data structures.

5. O(n^k) - Polynomial Space Complexity:
For some algorithms with multiple nested loops or recursion, the space complexity can be polynomial in nature, where k is a constant exponent.

6. O(2^n) - Exponential Space Complexity:
An algorithm with exponential space complexity uses memory that grows exponentially with the input size. This is often seen in brute-force algorithms or algorithms with an exhaustive search.

The goal, similar to time complexity, is to design algorithms with lower space complexity to minimize memory usage and make them more efficient in terms of memory consumption. However, it's important to strike a balance between time and space complexity, as some algorithms might trade off one for the other. Additionally, certain problems may require specific algorithms with higher space complexity due to their inherent nature.

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
