public class Hero {

    private String heroName;
    private int heroLevel = 1;
    private int heroVitality = 80;
    private int heroStrength = 5;
    private int heroIntelligence = 5;
    private int heroAgility = 5;
    private int heroDefense = 0;
    private int heroCriticalChance = 5;

    public Hero(String heroName) {
        this.heroName = heroName;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getHeroLevel() {
        return heroLevel;
    }

    public void setHeroLevel(int heroLevel) {
        this.heroLevel = heroLevel;
    }

    public int getHeroVitality() {
        return heroVitality;
    }

    public void setHeroVitality(int heroVitality) {
        this.heroVitality = heroVitality;
    }

    public int getHeroStrength() {
        return heroStrength;
    }

    public void setHeroStrength(int heroStrength) {
        this.heroStrength = heroStrength;
    }

    public int getHeroIntelligence() {
        return heroIntelligence;
    }

    public void setHeroIntelligence(int heroIntelligence) {
        this.heroIntelligence = heroIntelligence;
    }

    public int getHeroAgility() {
        return heroAgility;
    }

    public void setHeroAgility(int heroAgility) {
        this.heroAgility = heroAgility;
    }

    public int getHeroDefense() {
        return heroDefense;
    }

    public void setHeroDefense(int heroDefense) {
        this.heroDefense = heroDefense;
    }

    public int getHeroCriticalChance() {
        return heroCriticalChance;
    }

    public void setHeroCriticalChance(int heroCriticalChance) {
        this.heroCriticalChance = heroCriticalChance;
    }
}
