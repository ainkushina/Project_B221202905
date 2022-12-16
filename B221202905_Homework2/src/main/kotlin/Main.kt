/*
NAME: NURAIN FITRI BINTI
SURNAME: MADZLAN
STUDENT ID: B221202905
COURSE NAME: SWE303 DESIGN PATTERN
HOMEWORK 3
 */

// Sorting Algorithm
// Let’s say we have two algorithms which are bubble sort and merge sort.

fun main() {
    val numbers = arrayOf(4, 56, 12, 79, 25, 2)
    sort(BubbleSortStrategy(), numbers) // Output: Numbers are sorted using Bubble sort.
    sort(MergeSortStrategy(), numbers) // Output: Numbers are sorted using Merge sort.
}

fun sort(sortStrategy: SortStrategy, numbers: Array<Int>) {
    sortStrategy.sort(numbers)
}

fun sort(algorithm: String, numbers: Array<Int>) {
    when (algorithm) {
        "Bubble" -> bubbleSort(numbers)
        "Merge" -> mergeSort(numbers)
        else -> throw IllegalArgumentException()
    }
}

fun bubbleSort(numbers: Array<Int>) {
    println("Numbers are sorted using Bubble sort.")
}

fun mergeSort(numbers: Array<Int>) {
    println("Numbers are sorted using Merge sort.")

}

//use this interface and pass it as an argument to the sort method in the driver.
interface SortStrategy {
    fun sort(numbers: Array<Int>)
}

class BubbleSortStrategy : SortStrategy {
    override fun sort(numbers: Array<Int>) {
        println("Numbers are sorted using Bubble sort.")
    }
}

class MergeSortStrategy: SortStrategy {
    override fun sort(numbers: Array<Int>) {
        println("Numbers are sorted using Merge sort.")
    }
}

/*
Summary:

In this case, the conditional statements required to choose the sorting method that will be applied to the numbers
have been entirely eliminated using the interface. We can extract the methods into an interface (SortStrategy) and
each implementation of the interface will have the respective sorting algorithm. If Insertion Sort is the
sorting algorithm that we wish to add or delete, we may implement the SortStrategy interface and send it to the
sort function. We are currently sorting the numbers by passing the sorting algorithm along with them.
The family of algorithms in this case sorting algorithms have been encapsulated and made interchangeable.
It is called Strategy Design Pattern.
 */