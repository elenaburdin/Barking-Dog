package academy.learnprogrammimg;

public class BarkingDog {
    public static void main(String[] args) {
        shouldWakeUp(true, 1);
        shouldWakeUp(false,2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);

    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfTheDay) {
        if (hourOfTheDay < 0 || hourOfTheDay > 23) {
            return false;
        } else if (isBarking == true && hourOfTheDay < 8 || hourOfTheDay > 22){
            System.out.println("dog is not barking");
            return true;
        }
        return false;
    }
}
