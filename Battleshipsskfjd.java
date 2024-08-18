import java.util.Random;
import java.util.Scanner;

public class Battleshipsskfjd {

    public static void main(String[] args) {
        char[][] playerGrid = new char[10][10];
        char[][] computerGrid = new char[10][10];
        int playerShips = 5;
        int computerShips = 5;
        
        initializeGrid(playerGrid);
        initializeGrid(computerGrid);
        placeShips(playerGrid);
        placeShips(computerGrid);
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        while (playerShips > 0 && computerShips > 0) {
            System.out.println("Your turn:");
            displayGrid(playerGrid);
            playerShips = playerTurn(computerGrid, scanner);
            if (playerShips == 0) {
                System.out.println("Congratulations! You won!");
                break;
            }
            
            System.out.println("Computer's turn:");
            computerShips = computerTurn(playerGrid, random);
            if (computerShips == 0) {
                System.out.println("Game over. Computer won!");
                break;
            }
        }
    }

    public static void initializeGrid(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = '.';
            }
        }
    }

    public static void displayGrid(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void placeShips(char[][] grid) {
        Random random = new Random();
        for (int ship = 0; ship < 5; ship++) {
            int row = random.nextInt(10);
            int col = random.nextInt(10);
            if (grid[row][col] == 'S') {
                ship--;
            } else {
                grid[row][col] = 'S';
            }
        }
    }

    public static int playerTurn(char[][] grid, Scanner scanner) {
        System.out.println("Enter coordinates to attack (row col):");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        if (grid[row][col] == 'S') {
            System.out.println("Hit!");
            grid[row][col] = 'X';
            return countShips(grid);
        } else {
            System.out.println("Miss!");
            grid[row][col] = 'O';
            return countShips(grid);
        }
    }

    public static int computerTurn(char[][] grid, Random random) {
        int row = random.nextInt(10);
        int col = random.nextInt(10);
        if (grid[row][col] == 'S') {
            System.out.println("Computer hit at: " + row + " " + col);
            grid[row][col] = 'X';
            return countShips(grid);
        } else {
            System.out.println("Computer missed at: " + row + " " + col);
            grid[row][col] = 'O';
            return countShips(grid);
        }
    }

    public static int countShips(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 'S') {
                    count++;
                }
            }
        }
        return count;
    }
}