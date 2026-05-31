class OctalToDecimal {
    public static int octalToDecimal (String octal){
        int result = 0;
        int power = 1; //8^0 = 1

        for (int i = octal.length() - 1; i >= 0; i--){
            int digit = octal.charAt(i) - '0'; 
            result += digit * power;
            power *= 8;
        }
        return result;
    }
    public static void main(String[] args) {
        String octal = "17";
        int decimal = octalToDecimal(octal);
        System.out.println("Octal " + octal + " is " + decimal);
    }
}
