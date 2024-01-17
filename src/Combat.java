import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Combat {

    private ArrayList<Hero> heroList;
    private ArrayList<Monster> monsterList;



    public void combat(ArrayList<Hero> heroList, ArrayList<Monster> monsterList) {
        this.heroList = heroList;
        this.monsterList = monsterList;

        boolean heroTeamVitalityIsZero = false;
        boolean monsterTeamVitalityIsZero = false;

        int herosTeamLifes = heroList.size();
        int monstersTeamLifes = monsterList.size();

        String winnerIS = "";

        while(!heroTeamVitalityIsZero && !monsterTeamVitalityIsZero){

            for(Hero hero : heroList){

                if(hero.getHeroVitality() <= 0){

                    herosTeamLifes--;

                }

            }

            if(herosTeamLifes <= 0){

                heroTeamVitalityIsZero = true;
                winnerIS = "Monstres";

            }

            herosTeamLifes = heroList.size();

            herosAttacking(heroList, monsterList);

            for(Monster monster : monsterList){

                if(monster.getMonsterVitality() <= 0){

                    monstersTeamLifes--;

                }

            }

            if(monstersTeamLifes <= 0){

                monsterTeamVitalityIsZero = true;
                winnerIS = "Heros";

            }

            monstersTeamLifes = heroList.size();

            monstersAttacking(monsterList, heroList);

        }

        System.out.println("Les " + winnerIS + " gagnent le combat !");
    }

    public void herosAttacking(ArrayList<Hero> heroList, ArrayList<Monster> monsterList){

        Random random = new Random();
        int randomNbr = 0;

        for(Hero hero : heroList){

            randomNbr = (random.nextInt(monsterList.size()) + 1) - 1;

            System.out.println(hero.getHeroName() + " attaque " + monsterList.get(randomNbr).getMonsterName());
            System.out.println(monsterList.get(randomNbr).getMonsterName() + " perd " + hero.getHeroStrength() + " PV.");
            monsterList.get(randomNbr).setMonsterVitality(monsterList.get(randomNbr).getMonsterVitality() - hero.getHeroStrength());

        }

    }

    public void monstersAttacking(ArrayList<Monster> monsterList, ArrayList<Hero> heroList){

        Random random = new Random();
        int randomNbr = 0;

        for(Monster monster : monsterList){

            randomNbr = (random.nextInt(heroList.size()) + 1) - 1;

            System.out.println(monster.getMonsterName() + " attaque " + heroList.get(randomNbr).getHeroName());
            System.out.println(heroList.get(randomNbr).getHeroName() + " perd " + monster.getMonsterAttack() + " PV.");
            heroList.get(randomNbr).setHeroVitality(heroList.get(randomNbr).getHeroVitality() - monster.getMonsterAttack());

        }


    }

    public ArrayList<Hero> getHeroList() {
        return heroList;
    }

    public void setHeroList(ArrayList<Hero> heroList) {
        this.heroList = heroList;
    }

    public ArrayList<Monster> getMonsterList() {
        return monsterList;
    }

    public void setMonsterList(ArrayList<Monster> monsterList) {
        this.monsterList = monsterList;
    }
}
