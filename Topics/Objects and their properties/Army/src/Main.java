class Army {

    public static void createArmy() {
        // Create all objects here
        // Creating 5 Unit objects
        new Unit("Unit1");
        new Unit("Unit2");
        new Unit("Unit3");
        new Unit("Unit4");
        new Unit("Unit5");

        // Creating 3 Knight objects
        new Knight("Knight1");
        new Knight("Knight2");
        new Knight("Knight3");

        // Creating 1 General object
        new General("General1");

        // Creating 1 Doctor object
        new Doctor("Doctor1");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}