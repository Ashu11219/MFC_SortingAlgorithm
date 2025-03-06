# Sorting Algorithm Comparison

This Java program compares the performance of three basic sorting algorithms: **Bubble Sort**, **Selection Sort**, and **Insertion Sort**. It measures the time taken by each algorithm to sort arrays of different sizes and provides a clear comparison of their efficiency.

## Algorithms Implemented

1. **Bubble Sort**: Repeatedly swaps adjacent elements if they are in the wrong order.
2. **Selection Sort**: Selects the smallest element from the unsorted portion and swaps it with the first unsorted element.
3. **Insertion Sort**: Builds the sorted array one element at a time by inserting each element into its correct position.

## How It Works

- The program generates random arrays of sizes `1000`, `5000`, and `10000`.
- It measures the time taken by each sorting algorithm to sort these arrays.
- The results are printed in milliseconds for easy comparison.


## Observations

- **Bubble Sort** is the slowest due to its high number of swaps.
- **Selection Sort** performs better than Bubble Sort but is slower than Insertion Sort.
- **Insertion Sort** is the fastest among the three for small to moderately sized arrays.

## Time Complexity

- **Bubble Sort**: \(O(n^2)\)
- **Selection Sort**: \(O(n^2)\)
- **Insertion Sort**: \(O(n^2)\) (but faster in practice for small datasets)
