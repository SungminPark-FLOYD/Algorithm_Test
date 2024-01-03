class Solution {
    public int solution(String[][] board, int h, int w) {
        int[][] dir = {{0,-1}, {0,1}, {-1, 0}, {1,0}};


        int count = 0;
        for(int[] d : dir) {
            int h_check = h + d[0];
            int w_check = w + d[1];

            if(h_check>=0 && w_check >= 0 && board.length > h_check && board[0].length > w_check) {
                if (board[h][w].equals(board[h_check][w_check]))
                    count++;
            }
        }
        return count;
    }
}