import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Combat combat = new Combat();

        Hero hero1 = new Hero("Louis");
        Hero hero2 = new Hero("Joelle");

        ArrayList<Hero> heroList = new ArrayList<>();
        heroList.add(hero1);
        heroList.add(hero2);

        combat.setHeroList(heroList);

        Monster monster1 = new Monster("Pito", 50, 5, 1);
        Monster monster2 = new Monster("Pahya", 50, 5, 1);

        ArrayList<Monster> monsterList = new ArrayList<>();
        monsterList.add(monster1);
        monsterList.add(monster2);

        combat.setMonsterList(monsterList);


        combat.combat(heroList,monsterList);

    }
}