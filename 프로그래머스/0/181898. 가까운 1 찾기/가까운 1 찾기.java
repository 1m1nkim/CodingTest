class Solution {
    public int solution(int[] arr, int idx){
        int answer = -1;
         for(int i=idx; i<arr.length; i++){
             if(arr[i] == 1){
                 answer = i; break;
             }
         }
        return answer;
    }
}

//idx 인덱스 이후에 1이 나오냐, 나오면 그 인덱스 안나오면 -1