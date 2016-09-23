Bubble Sort
=======================

## Description

 - BUBBLE SORT is based on the idea of repeatedly comparing pairs of adjacent elements, then switching positions if they exist in the wrong order.
 - It's worse case algorithmic time complexity is QUADRATIC or O(n^2).

## To Do:

- Accepts keyboard input to set size of array.
- Generate random numbers to array accordingly.
- Show unsorted random numbers.
- Show sorted numbers after.

## Pseudocode:

    START PROGRAM
    
     SET array[], size, x, y, swap;
    
     FOR (x = 0; x < size-1; x++)
         FOR (y = 0; y < size-x-1; y++)
            IF (array[y] > array[y+1])
                swap = array[y];
                array[y] = array[y+1];
                array[y+1] = swap;
    
    END PROGRAM 