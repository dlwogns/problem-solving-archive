https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

## Intuition
완전탐색으로 푼다면 시간초과가 난다.

121번은 선형탐색중 작은 요소를 저장하고, 탐색을 진행하면서 현재 값 - 작은 요소 의 max값을 구하면 된다.

122번은 당일 매수-매도가 가능하므로, 특정 일자 다음날 주가가 오르면 무조건 파는게 좋다. (그리디)
## Approach
