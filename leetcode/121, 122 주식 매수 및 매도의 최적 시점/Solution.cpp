// LeetCode 121: Best Time to Buy and Sell Stock
// LeetCode 122: Best Time to Buy and Sell Stock II
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int mv = 987654321, ans = 0;

        for(auto e : prices) {
            if(e > mv) ans = max(ans, e-mv);
            else if(e < mv) mv = e;
        }
        return ans;
    }

    int maxProfit(vector<int>& prices) {
        int cur = prices[0], ans=0;
        for(int i=1; i<prices.size(); i++) {
            if(prices[i] > cur)  {
                ans += prices[i] - cur;
                cur = prices[i];
            }else if(prices[i] < cur) {
                cur = prices[i];
            }
        }
        return ans;
    }
};