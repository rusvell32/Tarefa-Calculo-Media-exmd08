public class ProgramaP {

    public static void main (String args[]) {
        Media m = new Media();
        if (m.media >= 7) {
            System.out.println("sua media é " + m.media);
            System.out.println("você passou.");
        } else {
            System.out.println("sua media é " + m.media);
            System.out.println("você reprovou");
        }


    }
}
