class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int min = arr[0];
        int j=0;
        if(arr.length == 1){
            return new int[]{-1};
        }
        for(int i=1; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] != min){
                answer[j++] = arr[i];
            }
        }
        return answer;
    }
}

/*
      int min = Arrays.stream(arr).min().getAsInt();
      return Arrays.stream(arr).filter(i -> i != min).toArray();
      이게 더 좋은 코드 같음
*/