package binsearch.problem_744;

public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[] letters = {'t','t','x','x','y','y'};
        char target = 'r';
        char result = solution.nextGreatestLetter(letters, target);
        System.out.println(result);
    }

}

