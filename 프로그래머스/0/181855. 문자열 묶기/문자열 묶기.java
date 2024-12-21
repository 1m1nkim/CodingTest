class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int max = 0;
        int a[] = new int[strArr.length];
        for(int i =0; i<strArr.length; i++){
            a[i] = strArr[i].length();
        }
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if(a[i] == a[j]){
                    answer++;
                }
            }
            if(answer >= max){
                max = answer;
            }
            answer = 0 ;
        }
        return max;
    }
}