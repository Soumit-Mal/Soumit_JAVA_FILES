
public class DefaultValues {
    public static void main(String[] args) {
        byte byteValue = 0;
        short shortValue = 0;
        int intValue = 0;
        long longValue = 0L;
        float floatValue = 0.0f;
        double doubleValue = 0.0d;
        char charValue = '\u0000';
        boolean booleanValue = false;

        System.out.println("byte: " + Byte.BYTES + " bytes, Default: " + byteValue);
        System.out.println("short: " + Short.BYTES + " bytes, Default: " + shortValue);
        System.out.println("int: " + Integer.BYTES + " bytes, Default: " + intValue);
        System.out.println("long: " + Long.BYTES + " bytes, Default: " + longValue);
        System.out.println("float: " + Float.BYTES + " bytes, Default: " + floatValue);
        System.out.println("double: " + Double.BYTES + " bytes, Default: " + doubleValue);
        System.out.println("char: " + Character.BYTES + " bytes, Default: " + (int) charValue);
        System.out.println("boolean: 1 bit, Default: " + booleanValue);
    }
}

