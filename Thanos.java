import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Thanos {

    public static void main(String[] args) {

        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);
        
        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");

        // TODO 1 : Create a TreeMap where :
        Comparator<Hero> comparator = new Comparator<Hero>() {  
            @Override  
            public int compare(Hero orig, Hero compare) {  
                return orig.getName().compareTo(compare.getName());  
            }  
        };  
        Map<Hero, Flower> treeClassroom = new TreeMap<>(comparator);

        treeClassroom.put(hulk, rose);  
        treeClassroom.put(blackWidow, violet);  
        treeClassroom.put(captainAmerica, lily);  
        treeClassroom.put(thor, rose);
        treeClassroom.put(vision, tulip);
        treeClassroom.put(scarletWitch, rose);
        treeClassroom.put(doctorStrange, violet);

        // Hulk, Thor and Scarlet Witch have a Rose
        // Vision has a Tulip
        // Captain America has a Lily
        // Doctor Strange and Black Widow have a Violet

        // TODO 2 : Print if `begonia` is contained in the TreeMap
        System.out.println(treeClassroom.containsValue(begonia));

        // TODO 3 : For each hero, alphabetically, print the corresponding flower
        for (Hero hero : treeClassroom.keySet()) {  
            Flower flower = treeClassroom.get(hero);  
            System.out.println(hero.getName() + ": " + flower.getName());  
        }

    }
}
