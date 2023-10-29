import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.firstUniqChar("leetcode"));

    }
    public int firstUniqChar(String s) {
        char[] array = s.toCharArray();
        int d = 1;
        for (int i = 0; i < array.length; i++) {
            d = 1;
           for (int j = 0; j < array.length; j++) {
               if (array[i] == array[j] && i!= j) {
                   d=0;
                   break;
               }
           }
           if(d==1) return i;

        }
        return -1;
    }
}
