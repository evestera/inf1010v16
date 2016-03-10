import java.util.function.*;

public class Oppgave2 {
    public static void main(String[] args) {
        // 2. Fyll inn to lambda-uttrykk slik at utskriften fra programmet blir:
        // 4 ? 5 = 9
        // 4 ? 5 = 20
        doSomeCalculation(fyll inn her);
        //doSomeCalculation(fyll inn her);
    }

    public static void doSomeCalculation(IntBinaryOperator op) {
        int result = op.applyAsInt(4, 5);
        System.out.println("4 ? 5 = " + result);
    }
}

// Dette grensesnittet ligger i java.util.function:
/*
interface IntBinaryOperator {
    int	applyAsInt(int left, int right);
}
*/
