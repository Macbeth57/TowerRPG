public class Monster {

    private String monsterName;
    private int monsterVitality;
    private int monsterAttack;
    private int monsterDefense;

    public Monster(String monsterName, int monsterVitality, int monsterAttack, int monsterDefense) {
        this.monsterName = monsterName;
        this.monsterVitality = monsterVitality;
        this.monsterAttack = monsterAttack;
        this.monsterDefense = monsterDefense;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public int getMonsterVitality() {
        return monsterVitality;
    }

    public void setMonsterVitality(int monsterVitality) {
        this.monsterVitality = monsterVitality;
    }

    public int getMonsterAttack() {
        return monsterAttack;
    }

    public void setMonsterAttack(int monsterAttack) {
        this.monsterAttack = monsterAttack;
    }

    public int getMonsterDefense() {
        return monsterDefense;
    }

    public void setMonsterDefense(int monsterDefense) {
        this.monsterDefense = monsterDefense;
    }

}
