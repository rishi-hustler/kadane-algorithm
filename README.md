# Kadane’s Algorithm (Java)

## 📌 Overview

**Kadane’s Algorithm** is an efficient **dynamic programming technique** used to find the **maximum sum of a contiguous subarray** within a one-dimensional array of integers.

It works in **linear time**, making it one of the most optimal solutions for this problem.

---

## 🚀 Algorithm Used

**Kadane’s Algorithm (Maximum Subarray Problem)**

### Key Idea:

* Maintain two variables:

  * `currentMax` → maximum sum ending at current position
  * `maxSoFar` → maximum sum found so far
* At each step, decide whether to extend the current subarray or start a new one

---

## 🧮 Time and Space Complexity

| Complexity Type | Value  |
| --------------- | ------ |
| Time            | `O(n)` |
| Space           | `O(1)` |

Where `n` is the number of elements in the array.

---

## 🛠️ Requirements

* Java 8 or later
* Any Java IDE or terminal

---

## 📂 Project Structure

```
KadaneAlgorithm.java
README.md
```

---

## ▶️ How to Run

1. Compile the program:

   ```bash
   javac KadaneAlgorithm.java
   ```
2. Run the program:

   ```bash
   java KadaneAlgorithm
   ```

---

## 📋 Program Options

```
1. Find Maximum Subarray Sum
2. Exit
```

---

## ⌨️ Input Format

* Enter number of elements
* Enter integer elements (can be positive or negative)

---

## ✅ Sample Input

```
Number of elements: 8
Elements: -2 -3 4 -1 -2 1 5 -3
```

---

## 📤 Sample Output

```
Maximum Subarray Sum: 7
```

---

## 🧠 Key Concepts

* Dynamic Programming
* Subarray problems
* Greedy decision making
* Optimal substructure

---

## 🔧 Notes

* Works correctly even when all elements are negative
* Returns the largest (least negative) element in such cases
* Finds sum only (not the subarray itself)

---

## 📚 Applications

* Stock market analysis
* Maximum profit/loss calculations
* Signal processing
* Competitive programming problems

---

## 📝 License

Free to use for academic, lab, and interview preparation.
