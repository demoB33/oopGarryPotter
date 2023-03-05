public class HogwartsSchoolStudent {
    private String name;
    private int magic;
    private  int transgression;

    public HogwartsSchoolStudent(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    private int ability(){
        return magic + transgression;
    }
    public void compareHogwarts(HogwartsSchoolStudent hogwartsSchoolStudent){
        int ability1 = this.ability();
        int ability2 = hogwartsSchoolStudent.ability();
        if (ability1 > ability2){
            System.out.println("Студент "
                    + getName()
                    + " лучше, чем студент "
                    + hogwartsSchoolStudent.getName()
                    + " Свойства первого: " + ability1
                    + " Свойства второго: " + ability2);
        } else if (ability2 > ability1) {
            System.out.println("Студент "
                    + hogwartsSchoolStudent.getName()
                    + " лучше, чем студент "
                    + getName()
                    + " Свойства первого: " + ability2
                    + " Свойства второго: " + ability1);
        } else {
            System.out.println("Студенты равны : " + ability1 + " = " + ability2);
        }
    }
    public void print(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Студент " +
                "ИМЯ = " + name +
                ", Мощность колдовства = " + magic +
                ", Трансгрессирование = " + transgression;
    }
}
