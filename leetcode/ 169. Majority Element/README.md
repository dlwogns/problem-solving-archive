https://leetcode.com/problems/majority-element?envType=study-plan-v2&envId=top-interview-150
## Intuition
hashmap (key-value) 자료구조를 사용하여 나타내면 큰 무리없이 풀 수 있을 것으로 생각했다.
하지만 후속질문이 Time or Space complexity가 상수가 될 수 있는 경우가 있나? 이기 때문에 이거에 초점을 두고 추가적인 풀이를 하였다.
## Approach
1차원 배열의 모든 요소에 접근하지 않고 Majority Element를 구할 수 는 없다. 따라서 Time complexity는 O(N)이라 생각했다.<br>
key-value 자료구조를 사용한다면 최악의 경우가 N/2 개의 요소가 다른 요소인 경우이다. (Majority Element, 전체의 1/2 초과를 차지하는 요소가 무조건 증가하기 때문에)<br>
그러므로 O(N)의 Space Complexity를 가지게 된다.
<br><br>
하지만 결국 N/2 초과 요소가 같은 요소이기 때문에, int형 변수 두개로 풀이할 수 있다. (Space Complexity O(1))

```
int ret = 0;
int m = 0;
```
ret는 Majority element가 될 수를 나타내고, m은 그 숫자의 중요도를 나타낸다.<br>
선형 탐색을 하면서 중요도가 양수라면, 그 숫자는 Majority element가 된다.

```
for(int num : nums) {
            if(m == 0) ret = num;
            m += ret == num ? 1 : -1;
        }
```
왜냐하면 결국 Majority element는 N/2개 초과로 존재하기 떄문이다. <br>
Majority element의 개수에서 다른 숫자의 개수를 전부 다 빼더라도, 최소 1이 되기 때문이다.