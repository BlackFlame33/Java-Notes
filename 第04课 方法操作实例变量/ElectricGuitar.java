class ElectricGuitar {
    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;

    String getbrand() {
        return brand;
    }

    void setbrand(String abrand) {
        brand = abrand;
    }

    int getnumOfPickups() {
        return numOfPickups;
    }

    void setnumOfPickups(int num) {
        numOfPickups = num;
    }

    boolean getrockStarUsesIt() {
        return rockStarUsesIt;
    }

    void setrockStarUsesIt(boolean yesOrNo) {
        rockStarUsesIt = yesOrNo;
    }

    public static void main(String[] args) {
        ElectricGuitar myGuitar = new ElectricGuitar();
        myGuitar.setbrand("Love Live!");
        myGuitar.setnumOfPickups(6);
        myGuitar.numOfPickups = 10;
        myGuitar.setrockStarUsesIt(true);
        myGuitar.rockStarUsesIt = false;
        System.out.println(myGuitar.getbrand());
        System.out.println(myGuitar.getnumOfPickups());
        if (myGuitar.getrockStarUsesIt()) {
            System.out.println("I'm playing my ElectriGuitar!");
        } else {
            System.out.println("I'm not playing my ElectriGuitar!");
        }
    }
}
