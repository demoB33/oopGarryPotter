public class GryffindorStudent extends HogwartsSchoolStudent {
    private int nobility;
    private  int honor;
    private int bravery;

    public GryffindorStudent(String name,
                             int magic,
                             int transgression,
                             int nobility,
                             int honor,
                             int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }
    public int ability(){
        return nobility+ honor + bravery;
    }
    public void compareGryffindor(GryffindorStudent gryffindorStudent){
        int ability1 = this.ability();
        int ability2 = gryffindorStudent.ability();
        if (ability1 > ability2){
            System.out.println("Гриффиндорец "
                    + getName()
                    + " лучше, чем Гриффиндорец "
                    + gryffindorStudent.getName()
                    + " Свойства первого: " + ability1
                    + " Свойства второго: " + ability2);
        } else if (ability2 > ability1) {
            System.out.println("Гриффиндорец "
                    + gryffindorStudent.getName()
                    + " лучше, чем Гриффиндорец "
                    + getName()
                    + " Свойства первого: " + ability2
                    + " Свойства второго: " + ability1);
        } else {
            System.out.println("Гриффиндорцы равны : " + ability1 + " = " + ability2);
        }
    }
    @Override
    public String toString() {
        return super.toString() +
                " nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;
    }
}
