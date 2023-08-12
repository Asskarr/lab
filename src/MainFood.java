public class MainFood {
    public static void main(String[] args) {
        SphereGold sphereGold = new SphereGold(2);
        SphereGold sphereGold1 = new SphereGold();
        sphereGold1.setRadius(3);

        System.out.println("The first spheregold's radius is " + sphereGold.getRadius());
        System.out.println("The second spheregold's radius is " + sphereGold1.getRadius());

        System.out.println("The first spheregold's volume is " + sphereGold.getVolume());
        System.out.println("The second spheregold's volume is " + sphereGold1.getVolume());
    }
}
