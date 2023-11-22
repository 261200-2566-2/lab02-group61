class Lab02 {
    public static void main(String[] args) {
        // Create AirPurifier objects
        AirPurifier airPurifier1 = new AirPurifier();
        AirPurifier airPurifier2 = new AirPurifier();

        airPurifier1.powerOn();
        int totalPurifiedAir = AirPurifier.getTotalAirPurifiers();
        System.out.println("Total Air Purified: " + totalPurifiedAir+"%");
        airPurifier2.powerOff();
    }

    public static class AirPurifier {
            public int serialNo;
            public String model;
            public String color;

        private static int totalAirPurifiers = 99;

        public AirPurifier(String model, String color ,int serialNo) {
            this.serialNo = serialNo;
            this.model = model;
            this.color = color;
            totalAirPurifiers++;
        }

        public AirPurifier() {

        }

        public void powerOn() {
            System.out.println("Air purifier powered on.");
        }

        public void powerOff() {
            System.out.println("Air purifier powered off.");
        }

        public static int getTotalAirPurifiers() {
            return totalAirPurifiers;
        }
    }
}

