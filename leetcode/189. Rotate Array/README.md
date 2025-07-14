https://leetcode.com/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150
## Intuition
배열을 하나 생성한다면 쉽게 풀 수 있는 문제이지만, Space Complexity O(1)로 해결할 수 있다는 힌트가 있기 때문에 이 부분에 초점을 두고 문제를 풀었다.
## Approach
회전한 배열 자체를 return해줘야 하므로 배열의 모든 값을 바꿔준다는 생각을 가지고 있어야 한다. Time Complexity는 O(N)이다.

Space Complexity가 O(1)이 되려면 결국 따로 배열을 생성해주지 않고, 주어진 배열에서 내용을 바꿔주면서 알고리즘을 진행해야 한다.<br>
하나씩 써보면서 하면 편한데

1 2 3 4 5 6일때 k = [1, 2, 3, 4, 5, 6]이라 하면

k=1 -> 6 1 2 3 4 5 <br>
k=2 -> 5 6 1 2 3 4<br>
k=3 -> 4 5 6 1 2 3

즉, 처음부터 k번째의 원소까지가 arr[arr.length - k]부터 arr[arr.length]까지의 숫자이다.<br>
이걸 다시보면 결국 배열 전체를 회전하고, 0:k까지 회전, k:arr.length까지 회전한 결과가 된다.

```
reverse(0, nums.length-1, nums);
reverse(0, k-1, nums);
reverse(k, nums.length-1, nums);
```