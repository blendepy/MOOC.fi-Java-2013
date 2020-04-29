
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
            NHLStatistics.top(10);
        System.out.println(" ");
        
        System.out.println("Top 25 by penalty");
        NHLStatistics.sortByPenalties();
            NHLStatistics.top(25);
        System.out.println(" ");
        
        System.out.println("Stats for player Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
       
        System.out.println(" ");
        
        System.out.println("Stats for PHI");
        NHLStatistics.teamStatistics("PHI");
        System.out.println(" ");
        
        System.out.println("Anaheim Ducks by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
            
         
        
        
        
    }
}
