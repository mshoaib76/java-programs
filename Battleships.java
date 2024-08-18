 import java.util.Scanner;

public class Battleships {
    public static void main(String[] args) {

        int playerG[][]=new int[10][10];
        int computerG[][]=new int[10][10];
        int ps=0,cs=0;
        int r=0,c = 0;

        Scanner s=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<9;j++)
            {
                playerG[i][j]=0;
                computerG[i][j]=0;
            }
        }
        //for player placing grids
        for(int i=0;i<2;i++)
        {
            playerG[i][2]=1;
        }
        for(int i=1;i<=3;i++)
        {
            playerG[i][4]=1;
        }
        for (int i=4;i<8;i++)
        {
            playerG[i][0]=1;
        }
        for (int i=5;i<9;i++)
        {
            playerG[i][9]=1;
        }
        //for computer placing girds
        for(int i=0;i<2;i++)
        {
            int j=2;
            computerG[i][j]=1;
        }
        for(int i=1;i<=3;i++)
        {
            int j=4;
            computerG[i][j]=1;
        }
        for (int i=4;i<8;i++)
        {

            int j=0;
            computerG[i][j]=1;
        }
        for (int i=5;i<9;i++)
        {
            int j=9;
            computerG[i][j]=1;
        }
        //testing conditons
        while (ps<3 && cs<3)
        {

            System.out.println("player turn");
            System.out.println("enter the grid for row");
            r=s.nextInt();
            System.out.println("Enter the grid for colum");
            c=s.nextInt();
            // for player to choice the grid
            if(computerG[r][c]==1)
            {
                System.out.println("player Hits");
                ps++;
                System.out.println("player score is ="+ps);
                System.out.println("computer score is ="+cs);

            }
            else {
                System.out.println("player Miss");
                System.out.println("player score is ="+ps);
                System.out.println("computer score is = "+cs);
            }
            //for random choice of computer
            r= (int) (Math.random()*10);
            c= (int) (Math.random()*10);
            if(playerG[r][c]==1)
            {
                System.out.println("Computer hit the grid");
                cs++;
                System.out.println("player score is ="+ps);
                System.out.println("computer score is ="+cs);
            }
            else {
                System.out.println("Computer miss the grid");
                System.out.println("player score is ="+ps);
                System.out.println("computer score is ="+cs);
            }
        }
        //wining logic
        if (ps==15)
        {
            System.out.println("you win the game \n computer is loser");
        }
        if (cs== 15)
        {
            System.out.println("computer win the game \n you are loser ");
        }
    }
}
