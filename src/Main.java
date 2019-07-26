public class Main {

    public static void main(String[] args) {
        //String[] name = {"Cristiano Ronaldo", "Dastan Tulokulov", "Mark Zuckerberg"};
        String[] name = new String[3];
        name[0] = "Cristiano Ronaldo";
        name[1] = "Dastan Tulokulov";
        name[2] = "Mark Zuckerberg";




        String[] names = new String[name.length + 1];
        for (int i = 0; i < name.length; i++) {
            names[i] = name[i];
        }
        names[name.length] = "Elon Musk";

        System.out.println("Привет мой друг!");
        System.out.println(".............................................");
        System.out.println("Сегодня мы будем желать доброго времени суток нашим друзьям, имена которых мы уже указали в нашем массиве!");
        System.out.println(".............................................");


        switch (names[3]) {
            case "Cristiano Ronaldo":
                System.out.println("Good morning " + names[0] + "!");
                break;
            case "Dastan Tulokulov":
                System.out.println("Good afternoon " + names[1] + "!");
                break;
            case "Mark Zuckerberg":
                System.out.println("Good evening " + names[2] + "!");
                break;
            case "Elon Musk":
                System.out.println("Good night " + names[3] + "!");
                break;
            default:
                System.out.println("Please check the case correctness");
                break;
        }
    }
}
