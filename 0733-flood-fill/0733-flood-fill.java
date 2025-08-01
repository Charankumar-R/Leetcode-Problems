class Solution {
    public void floodFillSolve(int[][] image, int sr, int sc, int color, boolean[][] visited, int originalColor) {
        if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length) return;
        if (visited[sr][sc]) return;
        if (image[sr][sc] != originalColor) return;
        visited[sr][sc] = true;
        image[sr][sc] = color;
        floodFillSolve(image, sr + 1, sc, color, visited, originalColor);
        floodFillSolve(image, sr - 1, sc, color, visited, originalColor);
        floodFillSolve(image, sr, sc + 1, color, visited, originalColor);
        floodFillSolve(image, sr, sc - 1, color, visited, originalColor);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if (originalColor == color) return image;
        boolean[][] visited = new boolean[image.length][image[0].length];
        floodFillSolve(image, sr, sc, color, visited, originalColor);

        return image;
    }
}