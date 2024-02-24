package WorkingWithAbstraction.jediGalaxy;

import java.util.Scanner;

import static WorkingWithAbstraction.jediGalaxy.JediUtils.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = getPositions(scanner.nextLine());
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        fillTheMatrix(rows, cols, matrix);

        String command = scanner.nextLine();

        long sumOfCollectedStars = 0;

        sumOfCollectedStars = CollectAllPossibleStars(command, scanner, matrix, sumOfCollectedStars);

        System.out.println(sumOfCollectedStars);
            
    }

}
