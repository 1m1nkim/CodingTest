class Solution {
    public long solution(long n) {
        long sqrt = (long) Math.sqrt(n);
        if(sqrt * sqrt == n){
            return (long) Math.pow(sqrt + 1, 2);
        }else{
            return -1;
        }
    }
}
//왜 굳이 long 형으로 문제 내는지,,, 열받아 죽겠ㄲ음 ,,