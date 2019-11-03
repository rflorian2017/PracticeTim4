package transformation.model;

import java.util.ArrayList;
import java.util.List;

public class Decimal extends Number implements BinaryConverter{
    long number;
    public Decimal(String value) {
        super(value);
    }

    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public String convertToBinary() {
        number = Long.parseLong(value);
        return transform(number);
    }

    private String transform(long number) {
        String numberInBinaryForm = "";
        List<String> digits = new ArrayList<>();
        while (number > 0) {
            digits.add(number%2 + "");
            number = number/2;
        }
        for (int i = digits.size() - 1; i >= 0; i--) {
            numberInBinaryForm+= digits.get(i);
        }


        return numberInBinaryForm;
    }
}
