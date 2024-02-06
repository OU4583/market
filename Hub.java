//Michael Appiah
//Oscar Umana
import java.util.Scanner;
import java.util.ArrayList;
public class Hub
{
    private static int total = 0;
    

    public static void main(String[] args)
    {
        //AllStars
        ArrayList<String> tse = new ArrayList<String>();
        ArrayList<String> tsw = new ArrayList<String>();
        ArrayList<String> n1e = new ArrayList<String>();
        ArrayList<String> n1w = new ArrayList<String>();

        ArrayList<String> roster = new ArrayList<String>();


    
        Scanner sc = new Scanner(System.in);
        //AllStar Eastern Conference
        n1e.add("Giannis Antetokounmpo");
        n1e.add("Kevin Durant");
        n1e.add("Joel Embiid");
        n1e.add("Jayson Tatum");
        n1e.add("Donovan Mitchell");
        n1e.add("Kyrie Irving");
        n1e.add("Bam Adebayo ");
        n1e.add("Jaylen Brown");
        n1e.add("DeMar DeRozan");
        n1e.add("Tyrese Haliburton");
        n1e.add("Jrue Holiday");
        n1e.add("Julius Randle");
        n1e.add("Pascal Siakam ");
        //Eastern Teams
        tse.add("Milwaukee Bucks");
        tse.add("Pheonix SUns");
        tse.add("Philadelphia 76ers");
        tse.add("Boston Celtics");
        tse.add("Cleveland Cavaliers");
        tse.add("Dallas Mavericks");
        tse.add("Miami Heat");
        tse.add("Boston Celtics");
        tse.add("Chicago Bulls");
        tse.add("Indiana Pacers");
        tse.add("Milwakee Bucks");
        tse.add("New York Knicks");
        tse.add("Toronto Raptors");
        tse.add("Orlando Magic");
        tse.add("Detroit Pistons");
        tse.add("Charlotte Hornets");

        //AllStar Western Conference
        n1w.add("Lebron James");
        n1w.add("Nikola Jokic");
        n1w.add("Zion Williamson");
        n1w.add("Stephen Curry");
        n1w.add("Luka Doncic");
        n1w.add("Anthony Edwards");

        n1w.add("De’Aaron Fox");
        n1w.add("Paul George ");
        n1w.add("Shai Gilgeous-Alexander");
        n1w.add("Jaren Jackson Jr.");
        n1w.add("Damian Lillard");
        n1w.add("Lauri Markkanen");
        n1w.add("Ja Morant");
        n1w.add("Domantas Sabonis");

        //Western Teams
        tsw.add("LA Lakers");
        tsw.add("Denver Nuggets");
        tsw.add("New Orleans Pelicans");
        tsw.add("Golden State Warriors");
        tsw.add("Dallas Mavericks");
        tsw.add("Minnesota Timberwolves");
        tsw.add("Sacramento Kings");
        tsw.add("LA Clippers");
        tsw.add("Oklahoma City Thunder");
        tsw.add("Memphis Grizzlies");
        tsw.add("Portland Trail Blazers");
        tsw.add("Utah Jazz");
        tsw.add("Memphis Grizzlies");
        tsw.add("Sacramento Kings");



        System.out.println("Would you like a Western Conference Player or a Eastern Conference Player? or type stop to end");
        String c = sc.nextLine();
        while(!(c.equals("stop"))){
        if(c.equals("Western") || c.equals("Western Conference") || c.equals("West") || c.equals("western") || c.equals("western conference") || c.equals("west")){
            System.out.println("Please put Max when you reached 5 players or enter the full name of a All-Star Western Conference Player: ");
            c = sc.nextLine();
            for(int i = 0; i < n1w.size(); i ++){
                if(c.equals(n1w.get(i).toLowerCase()) || c.equals(n1w.get(i))){
                    roster.add(c);
                    int val = (int)(Math.random() * (60000000 - 20000000));
                    System.out.println("Player found: ");
                    Stars person = new Stars(tsw.get(i), n1w.get(i), val);
                    System.out.println(person.toString());
                    total = total + val;

                }
                if(!(c.equals(n1w.get(i).toLowerCase()) || c.equals(n1w.get(i)))){
                    System.out.println("Player Not Found, please try again.");
                }
                if(c.equals("max") || c.equals("Max")){
                    int average = total / 5;
                    System.out.println("The average amount of value between the players is : " + average);
                    System.out.println("Would you like to do a trade?");
                    c = sc.nextLine();
                    if(c.equals("yes") || c.equals("Yes")){
                        System.out.println("Please type in the player you would like to trade: ");
                        c = sc.nextLine();
                        roster.remove(c);
                        System.out.println("Please type in a player you would like from the western conference");
                        c = sc.nextLine();
                        for(int j = 0; j < n1w.size(); j++){
                            if(c.equals(n1w.get(j))){
                                roster.add(c);
                                System.out.println("Player found, trade succesfull");
                                System.out.println("New Player\n" + c.toString());
                                System.out.println("Your roster is : " + roster);
                            }
                            if(!(c.equals(n1w.get(j)))){
                                System.out.println("Player not found");
                            }
                            
                        }
                
                    }
                }
            }   
            System.out.println(roster);
        }
        else if(c.equals("Eastern") || c.equals("Eastern Conference") || c.equals("East") || c.equals("eastern") || c.equals("eastern conference") || c.equals("east")){
            System.out.println("Please put Max when you reached 5 players or enter the full name of a All-Star Eastern Conference Player:  ");
            c = sc.nextLine();
            for(int i = 0; i < n1e.size(); i ++){
                
                if(c.equals(n1e.get(i).toLowerCase()) || c.equals(n1e.get(i))){
                    roster.add(c);
                    int val = (int)(Math.random() * (60000000 - 20000000));
                    System.out.println("Player found: ");
                    Stars p = new Stars(tse.get(i), n1e.get(i), val);
                    System.out.println(p.toString());
                    total = total + val;
 
                }
                if(c.equals("max") || c.equals("Max")){
                    int average = total / 5;
                    System.out.println("The average amount of value between the players is : " + average);
                    System.out.println("Would you like to do a trade?");
                    c = sc.nextLine();
                    if(c.equals("yes") || c.equals("Yes")){
                        System.out.println("Please type in the player you would like to trade: ");
                        c = sc.nextLine();
                        roster.remove(c);
                        System.out.println("Please type in a player you would like from the eastern conference");
                        c = sc.nextLine();
                        for(int j = 0; j < n1w.size(); j++){
                            if(c.equals(n1e.get(j))){
                                roster.add(c);
                                System.out.println("Player found, trade succesfull");
                                System.out.println("New Player\n" + c.toString());
                                System.out.println("Your roster is: " + roster);
                            }
                            if(!(c.equals(n1e.get(j)))){
                                System.out.println("Player not found. Please try again.");
                            }
                            
                        }
                
                    }
                }
                
                    
                
            }
                        System.out.println(roster);

    }
        else{
            System.out.println("Conference Not Available");
        }
        System.out.println("Would you like a Western Conference Player or a Eastern Conference Player? or type stop to end");
        c = sc.nextLine();


        }
        System.out.println("The Trading deadline has been reached.");
    }
}
