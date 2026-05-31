class ConvertToDecimal {
    public  static int convertToDecimal (String binary){
        int conversion = 1;
        int result = 0;
        for (int i=1; i<= binary.length(); i++){
            if(binary.charAt(binary.length()-i) == '1')
                result += conversion;
            conversion *=2;
        }
        return result;
    }
    public static void main(String[] args) {
        String binary = "1010110101111";
        int decimal_1 = convertToDecimal(binary);
        String binary_1 = "1101"; //ghi them du lieu khac cho binary
        int decimal_2 = convertToDecimal(binary_1); //them dong nay de test ghi de du lieu moi len bien binary
        System.out.println("the convert result is :" + decimal_1 + ", " + decimal_2 );
    }
}