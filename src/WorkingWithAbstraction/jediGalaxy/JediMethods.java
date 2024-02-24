package WorkingWithAbstraction.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class JediMethods {

    public JediMethods() {
    }

    public static void fillTheMatrix(int rows, int cols, int[][] matrix) {
        int value = 0;
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                matrix[i][j] = value++;
            }
        }
    }

     static void evilMovement(int evilRow, int evilCol, int[][] matrix) {
        while (evilRow >= 0 && evilCol >= 0) {
            if (evilRow < matrix.length && evilCol < matrix[0].length)
            {
                matrix[evilRow] [evilCol] = 0;
            }
            evilRow--;
            evilCol--;
        }
    }

    static long getSumOfCollectedStars(int jediRow, int jediCol, int[][] matrix, long sumOfCollectedStars) {
        while (jediRow >= 0 && jediCol < matrix[1].length)
        {
            if (jediRow < matrix.length && jediCol >= 0 && jediCol < matrix[0].length)
            {
                sumOfCollectedStars += matrix[jediRow][jediCol];
            }

            jediCol++;
            jediRow--;
        }
        return sumOfCollectedStars;
    }

    static int[] getPositions(String command) {
        return Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();

    }

    static long CrossTheGalaxyAndCollectAllPossibleStars(String command, Scanner scanner, int[][] matrix, long sumOfCollectedStars) {
        while (!command.equals("Let the Force be with you")) {

            int[] evilPos = getPositions(scanner.nextLine());
            int evilRow = evilPos[0];
            int evilCol = evilPos[1];

            evilMovement(evilRow, evilCol, matrix);

            int[] JediPos = getPositions(command);
            int jediRow = JediPos[0];
            int jediCol = JediPos[1];

            sumOfCollectedStars = getSumOfCollectedStars(jediRow, jediCol, matrix, sumOfCollectedStars);

            command = scanner.nextLine();
        }
        return sumOfCollectedStars;
    }
}
