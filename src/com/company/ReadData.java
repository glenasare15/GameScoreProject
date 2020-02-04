package com.company;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadData {
    public static void Test() throws Exception {
        // Create a File instance
        File file = new File("C:\\Users\\surface\\Desktop\\GameSheet\\GameScoreSheet.txt");
        if (!file.exists()) {
            System.out.println("File does not exists");
            System.exit(0);

        }
        Scanner input = new Scanner(file).useDelimiter(",");
        ArrayList<GameScore>gameScorelist = new ArrayList<GameScore>();

        int numberofHeaderColumns = 0;
        // boolean can only store true or false
        boolean isHeaderok = false;
        while (input.hasNext()) {
            if (isHeaderok == false){
                String playerFirstName = input.next();
                numberofHeaderColumns +=1;
                String playerLastName = input.next();
                numberofHeaderColumns +=1;
                String playerGameDate = input.next();
                numberofHeaderColumns  +=1;
                String playerScore = input.next();
                numberofHeaderColumns  +=1;


            }

            if (numberofHeaderColumns==4) {
                isHeaderok = true;
                System.out.println(" The number of Columns required where found");
            } else {
                System.out.println(" The number of columns required where not found");
                System.exit(0);
            }
            if (isHeaderok == true){
                try {
                    GameScore score = new GameScore();
                    score.setFirstName(input.next());
                    score.setLastname(input.next());
                    score.setGameDate(input.next());
                    double tempValue = Double.parseDouble(input.next());
                    score.setGameScore(tempValue);
                    gameScorelist.add(score);
                }
                catch (Exception ex){
                    break;
                }


            }
        }
        input.close();
        System.out.println(" The number of Gamers Read" + gameScorelist.size());

        for (GameScore item :gameScorelist) {
            System.out.println("Player First Name =: "+item.getFirstName());
            System.out.println("Player Last Name =: "+item.getLastname());
            System.out.println("Player Game Date =: "+item.getGameDate());
            System.out.println("Player Game Score =: "+item.getGameScore());
            System.out.println("The number of Game score Read =: "+gameScorelist.size());
            System.out.println("---------------------------------------------------");
        }

    }

}
