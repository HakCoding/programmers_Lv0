class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
			if(n % i == 0) { // 순서쌍인지 검사
				answer++; // 하나씩 증가
			}
		}
        return answer;
    }
}