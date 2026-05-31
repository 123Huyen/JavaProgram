public class CreditCardValidator {
    // Method 1: Count the number of digits in an integer
    public static int digits(int x) {
        if (x==0) {
            return 1;
        }
        x = Math.abs(x);
        return (int) Math.log10(x) + 1;
    }

    // Method 2: Identify card network using IIN (Issuer Identification Number)
    public static String identifyIssuer (String cardNumber) {
        if(cardNumber == null || cardNumber.isEmpty()) {
            return "Unknown";
        }
        // card number length
        int n = cardNumber.length();

        // 1. Check 4-digit prefix
        if(n >= 4) {
            int prefix_4 = Integer.parseInt(cardNumber.substring(0,4));
            if (prefix_4 >= 2200 && prefix_4 <= 2204) return "MIR";
            if (prefix_4 >= 2221 && prefix_4 <= 2720) return "Mastercard";
            if (prefix_4 >= 3528 && prefix_4 <= 3589) return "JCB";
            if (prefix_4 == 6011)                     return "Discover";
        }
        // 2. Check 3-digit prefix
        if(n >= 3) {
            int prefix_3 = Integer.parseInt(cardNumber.substring(0,3));
            if (prefix_3 >= 300 && prefix_3 <= 305) return "Diners Club Intl";
            if (prefix_3 >= 644 && prefix_3 <= 649) return "Discover";
            if (prefix_3 == 508)                    return "RuPay";
        }
        // 3. Check 2-digit prefix
        if(n >= 2) {
            int prefix_2 = Integer.parseInt(cardNumber.substring(0,2));
            if (prefix_2 == 34 || prefix_2 == 37)                    return "American Express";
            if (prefix_2 >= 51 && prefix_2 <= 55)                    return "Mastercard";
            if (prefix_2 == 36 || prefix_2 == 38 || prefix_2 == 39)  return "Diners Club Intl";
            if (prefix_2 == 65)                                       return "Discover";
            if (prefix_2 == 62 || prefix_2 == 81)                    return "China UnionPay";
            if (prefix_2 == 31)                                       return "China T-Union";
            if (prefix_2 == 60 || prefix_2 == 82)                    return "RuPay";
            if (prefix_2 == 50 || (prefix_2 >= 56 && prefix_2 <= 69)) return "Maestro";
        }
        // 4. Check 1-digit prefix
        if(n >= 1) {
            int prefix_1 = Integer.parseInt(cardNumber.substring(0,1));
            if (prefix_1 == 4) return "Visa";
            if (prefix_1 == 1) return "UATP";
        }
        return "Unknown";
 
    }
    

    // Method 3: Classify account tier based on number of digits (int version)
    public static String classifyAccount (int cardNumber) {
        if (cardNumber < 0) {
            throw new IllegalArgumentException("Account number cannot be negative");
        }
        int classifyNum = digits(cardNumber);
        switch (classifyNum) {
            case 6: return "Standard";
            case 7: return "Premium";
            case 8: return "Gold";
            case 9: return  "Platinum";
            default: return "Invalid";
        }
    }

    // Method 3 (overload): Classify account tier based on card number string length
    public static String classifyAccount(String cardNumber) {
        if (cardNumber == null || cardNumber.isEmpty()) return "Invalid";
        int len = cardNumber.length();
        switch (len) {
            case 6: return "Standard";
            case 7: return "Premium";
            case 8: return "Gold";
            case 9: return  "Platinum";
            default: return "Invalid";
        }
    }

    // Method 4: Main - run tests
    public static void main(String[]args) { 
        String[] testCards = {
            "4111111111111111",   // Visa
            "5123456789012345",   // Mastercard (51–55)
            "2221000000000009",   // Mastercard (2221–2720)
            "378282246310005",    // American Express
            "6011111111111117",   // Discover
            "3530111333300000",   // JCB
            "30569309025904",     // Diners Club Intl
            "99"                  // Unknown
        };
       
        for (String card : testCards) {
            try {
                System.out.println("Testing : " + card + " -> " + identifyIssuer(card) + " | " + classifyAccount(card));
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } 
        }
    }
}