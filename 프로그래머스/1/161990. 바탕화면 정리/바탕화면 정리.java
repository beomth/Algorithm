class Solution {
    public int[] solution(String[] wallpaper) {
        int maxRow, maxCol;
        int minRow, minCol;
        
        maxRow = maxCol = Integer.MIN_VALUE;
        minRow = minCol = Integer.MAX_VALUE;
        
        for(int i = 0; i < wallpaper.length; i++) {
            for(int j = 0; j < wallpaper[i].length(); j++) {
                if(wallpaper[i].charAt(j) == '#') {
                    maxRow = Math.max(maxRow, i);
                    maxCol = Math.max(maxCol, j);
                    minRow = Math.min(minRow, i);
                    minCol = Math.min(minCol, j);
                }
            }
        }
        
        return new int[]{minRow, minCol, maxRow+1, maxCol+1};
    }
}