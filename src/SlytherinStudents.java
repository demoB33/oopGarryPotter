public class SlytherinStudents extends HogwartsSchoolStudent{
    private int cunning;
    private int determination;
    private int ambition;
    private int ingenuity;
    private int thirstForPower;

    public SlytherinStudents(String name,
                             int magic,
                             int transgression,
                             int cunning,
                             int determination,
                             int ambition,
                             int ingenuity,
                             int thirstForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
    public int ability() {
        return cunning + determination + ambition + ingenuity + thirstForPower;
    }
    public void compareSlytherin(SlytherinStudents slytherinStudents) {
        int ability1 = this.ability();
        int ability2 = slytherinStudents.ability();
        if (ability1 > ability2) {
            System.out.println("Слизерин "
                    + getName()
                    + " лучше, чем Слизерин "
                    + slytherinStudents.getName()
                    + " Свойства первого: " + ability1
                    + " Свойства второго: " + ability2);
        } else if (ability2 > ability1) {
            System.out.println("Слизерин "
                    + slytherinStudents.getName()
                    + " лучше, чем Слизерин "
                    + getName()
                    + " Свойства первого: " + ability2
                    + " Свойства второго: " + ability1);
        } else {
            System.out.println("Слизерины равны : " + ability1 + " = " + ability2);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                " cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", ingenuity=" + ingenuity +
                ", thirstForPower=" + thirstForPower;
    }
}
