import java.util.Scanner;

public  class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        byte HP = 3;
        int mapSize = 5,
                xPoss = 1 + mapSize / 2,
                yPoss = 1 + mapSize / 2,
                stepsCounter = 0;
        String person = "Mc",
                monsterA = "Mb",
                monsterB  = "Mm";
        String map =
                "+ —— + —— + —— +\n"
                + "|    |    |    |\n"
                + "+ —— + —— + —— +\n"
                + "|    | " + monsterA + " |    |\n"
                + "+ —— + —— + —— +\n"
                + "| " + person + " |    |    |\n"
                + "+ —— + —— + —— +";
        System.out.println(map);
        System.out.println("HP героя: " + HP);
        System.out.print("Начать игру?: (Y/N) ");

        String beginAnswer = scanner.nextLine();
        System.out.println("Ты выбрал:\t" + beginAnswer);


    }
}