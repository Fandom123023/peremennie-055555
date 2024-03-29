import java.math.RoundingMode;
import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a = 40000;
        byte b = 22;
        float f = 3.75f;
        System.out.println(f);
        int x = 40000;
        System.out.println(x);
        byte y = 22;
        System.out.println(y);
        float r = 27.12f;
        System.out.println(r);
        byte m = 67;
        System.out.println(m);
        int j = 569;
        System.out.println(j);
        short k = 27897;
        System.out.println(k);
        long u = 987678965549L;
        System.out.println(u);
        double h = 159;
        System.out.println(h);
        double z = 2.786;
        System.out.println(z);
        short ludmilla = 23;
        short anna = 27;
        short ekaterina = 30;
        int paper = 480;
        float student = (float) 480 / (ludmilla + anna + ekaterina );
        System.out.println(" На каждого ученика рассчитано " + student + " листов бумаги.");
        short bottleInMinute = 16 / 2;
        System.out.println( bottleInMinute );
        int c = 20;
        int s = 24 * 60;
        int v = s*3;
        int n = s*30;
        System.out.println(" За 20 минут машина произвела " + bottleInMinute * c + " штук бутылок.");
        System.out.println( " За сутки машина произвела " + bottleInMinute * s +  " штук бутылок.");
        System.out.println(" за трое суток машина произвела " + bottleInMinute * v + " штук бутылок.");
        System.out.println("За 20 минут машина произвела " + bottleInMinute * n + " штук бутылок.");
        int allBox = 120;
        int whiteBox = 2;
        int brownBox = 4;
        int roomBox = whiteBox + brownBox;
        int rooms = allBox / roomBox;
        int whiteRoom = whiteBox * rooms;
        int brownRoom = brownBox * rooms;
        System.out.println(" «В школе, где " + rooms + " классов, нужно " + whiteRoom + " банок белой краски и " + brownRoom +
                " банок коричневой краски».");
        int bananas = 5;
        int milk = 105;
        int iceCreamBriquette = 2;
        int eggs =4;
        int bananWeight = 80;
        int milkPortion = 2;
        int iceCreamBriquetteWeight =100;
        int eggsWeight = 70;
        int cocktail = (bananas * bananWeight) + (milk * milkPortion) + (iceCreamBriquette * iceCreamBriquetteWeight) +
                (eggs * eggsWeight);
        float cocktailKg = cocktail / 1000f;
        System.out.println(cocktail);
        System.out.println(cocktailKg);
        float allWeight = 7f;
        float weightDayMin = 0.25f;
        float weightDayMax = 0.5f;
        float weightDayMidl = (weightDayMin + weightDayMax) / 2;
        float dayLosingMin = allWeight / weightDayMax;
        float dayLosingMax = allWeight / weightDayMin;
        float dayLosingMidl = allWeight/ weightDayMidl;
        double mm= Math.ceil(dayLosingMidl);
        System.out.println(dayLosingMin);

        System.out.println(mm);
        System.out.println(dayLosingMax);
        int masha1 = 67760;
        int denis1 = 83690;
        int kristina1 = 76230;
        float salaryPercentage = 0.1f;
        float masha2 = masha1 + (masha1 * salaryPercentage);
        float denis2 = denis1 + (denis1 * salaryPercentage);
        float kristina2 = kristina1 +( kristina1 * salaryPercentage);
        float yearSalaryMashaOld = masha1*12f;
        float yearSalaryMashaNew =masha2* 12f;
        float yearSalaryDenisOld =denis1 * 12f;
        float yearSalaryDenisNew = denis2 * 12f;
        float yearSalaryKristinaOld = kristina1 * 12f;
        float yearSalaryKristinaNew = kristina2 *12f;
        float differenceSalaryMasha = yearSalaryMashaNew - yearSalaryMashaOld;
        float differenceSalaryDenis = yearSalaryDenisNew - yearSalaryDenisOld;
        float differenceSalaryKristina = yearSalaryKristinaNew - yearSalaryKristinaOld;
        System.out.println(" «Маша теперь получает " + masha2 + "  рублей. Годовой доход вырос на " + differenceSalaryMasha  + " рублей».");
        System.out.println(" «Денис  теперь получает " + denis2 + "  рублей. Годовой доход вырос на " + differenceSalaryDenis  + " рублей».");
        System.out.println(" «Кристина  теперь получает " + kristina2 + "  рублей. Годовой доход вырос на " + differenceSalaryKristina  + " рублей».");






























    }
}