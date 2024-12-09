class Solution {
    public int[] solution(int[] arr) {
        // 배열 길이가 1일 경우 [-1] 반환
        if (arr.length == 1) {
            return new int[]{-1};
        }

        // 최소값 찾기
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        // 최소값을 제외한 배열 생성
        int[] answer = new int[arr.length - 1];
        int index = 0; // answer 배열의 인덱스
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) {
                answer[index++] = arr[i];
            }
        }

        return answer;
    }
}
