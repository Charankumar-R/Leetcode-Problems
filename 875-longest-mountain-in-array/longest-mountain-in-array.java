class Solution {
        public int longestMountain(int[] A) {
        int max = 0, i = 1, N = A.length;
        
        while (i < N) {
            int up = 0, down = 0;
            
            while (i < N && A[i - 1] < A[i]) { i++; up++;   }
            while (i < N && A[i - 1] > A[i]) { i++; down++; }
            
            if (up > 0 && down > 0) max = Math.max(max, up + down + 1);
            
            while (i < N && A[i - 1] == A[i]) i++;
        }
        return max;
    }
}