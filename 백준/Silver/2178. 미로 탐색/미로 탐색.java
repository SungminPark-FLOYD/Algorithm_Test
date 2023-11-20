import java.io.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws IOException {	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] canGo = new int[n][m];
        for (int i = 0; i < n; i++) {
            String temp = br.readLine();
            String[] splited = temp.split("");
            for (int j = 0; j < m; j++) {
                canGo[i][j] = Integer.parseInt(splited[j]);
            }
        }


        int[][] board = new int[n][m];
        board[0][0] = 1;

        int[] controlY = new int[]{0, 0, 1, -1};
        int[] controlX = new int[]{1, -1, 0, 0};

        LinkedList<int[]> needVisited = new LinkedList<>();
        needVisited.add(new int[]{0, 0});
        while (!needVisited.isEmpty()) {
            int[] now = needVisited.removeFirst();

            for (int i = 0; i < 4; i++) {
                int nextY = now[0] + controlY[i];
                int nextX = now[1] + controlX[i];
                if (-1 < nextY && nextY < n && -1 < nextX && nextX < m) {
                    if (board[nextY][nextX] == 0 && canGo[nextY][nextX] == 1) {
                        needVisited.add(new int[]{nextY, nextX});
                        board[nextY][nextX] = board[now[0]][now[1]] + 1;
                    }
                }
            }

        }
        System.out.println(board[n - 1][m - 1]);

    }
}