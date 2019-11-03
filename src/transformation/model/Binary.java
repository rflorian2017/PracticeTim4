package transformation.model;

public class Binary extends Number implements DecimalConverter {

    public Binary(String value) {
        super(value);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String convertToDecimal() {
        long sum = 0;
        for(int i = 0; i< value.length(); i ++ ) {
            int digit = Integer.parseInt(Character.toString(value.charAt(i)));
            sum += Math.pow(2, i) * digit;
        }
        return sum + "";
    }


}
