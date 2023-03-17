class Solution {
    public boolean solution(String s) {
        return (s.length() == 4 || s.length() == 6)
                && s.chars()
                .filter(Character::isDigit)
                .count() == s.length();
    }
}
