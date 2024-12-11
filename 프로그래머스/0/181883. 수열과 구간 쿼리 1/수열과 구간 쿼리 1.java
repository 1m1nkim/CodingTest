class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int a = queries.length;   
        int b = queries[0].length;
         for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0]; // 시작 인덱스
            int e = queries[i][1]; // 끝 인덱스
            for (int j = s; j <= e; j++) { // s부터 e까지 반복
                arr[j]++; // 각 인덱스의 값을 1씩 증가
            }
        }
        return arr;
    }
}