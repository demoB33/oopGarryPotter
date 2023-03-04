import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        GryffindorStudent harry = generateGryffindorStudent("Гарри Поттер");
        GryffindorStudent germ = generateGryffindorStudent("Гермиона Грейнджер");
        GryffindorStudent ron = generateGryffindorStudent("Рон Уизли");
        SlytherinStudents draco = generateSlytherinStudents("Драко Малфой");
        SlytherinStudents graham = generateSlytherinStudents("Грэхэм Монтегю");
        SlytherinStudents georgy = generateSlytherinStudents("Грегори Гойл");
        HufflepuffStudent zaharia = generateHufflepuffStudent("Захария Смит");
        HufflepuffStudent cedric = generateHufflepuffStudent("Седрик Диггори");
        HufflepuffStudent justin = generateHufflepuffStudent("Джастин Финч-Флетчли");
        RavenclawStudent zhou = generateRavenclawStudent("Чжоу Чанг");
        RavenclawStudent padma = generateRavenclawStudent("Падма Патил");
        RavenclawStudent marcus = generateRavenclawStudent("Маркус Белби");

        harry.print();
        ron.print();
        draco.print();
        graham.print();
        georgy.print();
        zaharia.print();
        cedric.print();
        justin.print();
        zhou.print();
        padma.print();
        marcus.print();

        harry.compareHogwarts(marcus);
        padma.compareRavenclaw(marcus);
        cedric.compareHufflepuff(justin);
        draco.compareSlytherin(georgy);



    }
    private static GryffindorStudent generateGryffindorStudent(String name){
        return  new GryffindorStudent (
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static HufflepuffStudent generateHufflepuffStudent(String name){
        return  new HufflepuffStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static SlytherinStudents generateSlytherinStudents(String name){
        return  new SlytherinStudents(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
    private static RavenclawStudent generateRavenclawStudent(String name){
        return  new RavenclawStudent(
                name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

}