## Sum primes
Give an even number process caculator export 2 number whose sum equal to the given number. 

#### Example 1
```
Input : 4
Output: [2, 2]
```
#### Example 2

```
Input : 100
Output: [3, 97]
```
#### Example 3
```
Input : 1000000
Output: [17, 999983]
```
> If there are more than one solutions possible, return the lexicographically smaller solution.
```
If [a, b] is one solution with a <= b,
and [c,d] is another solution with c <= d, then
[a, b] < [c, d] 
If a < c OR a==c AND b < d. 
```
