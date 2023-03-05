public class HufflepuffStudent extends HogwartsSchoolStudent{
    private int diligence;
    private int loyalty;
    private int honesty;

    public HufflepuffStudent(String name,
                             int magic,
                             int transgression,
                             int diligence,
                             int loyalty,
                             int honesty) {
        super(name, magic, transgression);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
    public int ability(){
        return diligence + loyalty + honesty;
    }
    public void compareHufflepuff(HufflepuffStudent hufflepuffStudent){
        int ability1 = this.ability();
        int ability2 = hufflepuffStudent.ability();
        if (ability1 > ability2){
            System.out.println("Пуффендуец "
                    + getName()
                    + " лучше, чем Пуффендуец  "
                    + hufflepuffStudent.getName()
                    + " Свойства первого: " + ability1
                    + " Свойства второго: " + ability2);
        } else if (ability2 > ability1) {
            System.out.println("Пуффендуец  "
                    + hufflepuffStudent.getName()
                    + " лучше, чем Пуффендуец  "
                    + getName()
                    + " Свойства первого: " + ability2
                    + " Свойства второго: " + ability1);
        } else {
            System.out.println("Пуффендурцы равны : " + ability1 + " = " + ability2);
        }
    }
    @Override
    public String toString() {
        return super.toString() +
                " diligence=" + diligence +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty;
    }
}
