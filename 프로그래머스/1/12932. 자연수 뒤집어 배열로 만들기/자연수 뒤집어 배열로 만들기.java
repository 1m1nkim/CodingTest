class Solution {
    public int[] solution(long n) {
        return new StringBuilder(String.valueOf(n))
                .reverse()
                .toString()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}
//n을  stringbuilder 형으로 만들어서 거꾸로하고 문자열로 바꾸고하나씩 나눠서 int형 배열로 리턴