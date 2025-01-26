class Solution {
    public int[] solution(int[] arr) {
        int a=-1;
        int b=-1;
        //0번 인덱스에 있을 수도있어서 0으로 두면 안됨
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 2){
                a=i;
                break;
            }
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if(arr[i] == 2){
                b=i;
                break;
            }
        }
        
        if (a == -1 || b == -1) {
            return new int[]{-1};
        }
        
        int[] answer = new int[b-a+1];
        for(int i=a; i<=b; i++){
            answer[i-a] = arr[i];
        }
        return answer;
    }
}