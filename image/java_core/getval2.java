import java.util.Scanner;

@FunctionalInterface
interface cars {
    String fuel = "diesel";
    int wheels = 4;

    void setValue(String b, String c);

    String getValues();
}

class car implements cars {
    private String color;
    private String model;

    @Override
    public void setValue(String b, String c) {
        color = b;
        model = c;
    }

    @Override
    public String getValues() {
        return fuel + " " + color + " " + model + " " + wheels;
    }
}

public class getval2 {
    public static void main(String[] args) {


        cars aud=new cars()
		{
             @Override
    public void setValue(String b, String c) {
        color = b;
        model = c;
    }

    @Override
    public String getValues() {
        return fuel + " " + color + " " + model + " " + wheels;
    }
		};
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the values of b and c");
        String b = s.next();
        String c = s.next();

        char choice = 'y';

        do {
            System.out.println("Enter a choice");
            int x = s.nextInt();
            System.out.println("1 - mercedes");
            System.out.println("2 - audi");
            System.out.println("3 - ford");

            car mer = new car();
            car aud = new car();
            car forCar = new car();

            switch (x) {
                case 1:
                    mer.setValue(b, c);
                    System.out.println(mer.getValues());
                    break;
                case 2:
                    aud.setValue(b, c);
                    System.out.println(aud.getValues());
                    break;
                case 3:
                    forCar.setValue(b, c);
                    System.out.println(forCar.getValues());
                    break;
            }

            System.out.println("Do you wish to continue? (y/n)");
            choice = s.next().charAt(0);
        } while (choice == 'y');
    }
}
