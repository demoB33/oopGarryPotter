public class RavenclawStudent extends HogwartsSchoolStudent {
    private int cleverness;
    private int wisdom;
    private int wit;
    private int creativity;

    public RavenclawStudent(String name,
                            int magic,
                            int transgression,
                            int cleverness,
                            int wisdom,
                            int wit,
                            int creativity) {
        super(name, magic, transgression);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    public int ability(){
        return cleverness + wisdom + wit + creativity;
    }
    public void compareRavenclaw(RavenclawStudent ravenclawStudent){
        int ability1 = this.ability();
        int ability2 = ravenclawStudent.ability();
        if (ability1 > ability2){
            System.out.println("Когтевранец "
                    + getName()
                    + " лучше, чем Когтевранец "
                    + ravenclawStudent.getName()
                    + " Свойства первого: " + ability1
                    + " Свойства второго: " + ability2);
        } else if (ability2 > ability1) {
            System.out.println("Когтевранец "
                    + ravenclawStudent.getName()
                    + " лучше, чем Когтевранец "
                    + getName()
                    + " Свойства первого: " + ability2
                    + " Свойства второго: " + ability1);
        } else {
            System.out.println("Когтевранцы равны : " + ability1 + " = " + ability2);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                " cleverness=" + cleverness +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creativity=" + creativity;
    }
}
