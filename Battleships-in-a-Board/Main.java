package org.example;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.countBattleships(new char[][]{});
    }
}

class Solution {
    public int countBattleships(char[][] board) {
        int answer = 0;
        int xSize = board.length;
        int ySize = board[0].length;
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                if (board[i][j] == 'X') {
                    if ((i == 0 || board[i - 1][j] == '.') && (j == 0 || board[i][j - 1] == '.')) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
