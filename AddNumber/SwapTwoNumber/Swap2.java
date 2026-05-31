package AddNumber.SwapTwoNumber;

class Swap2 {
    // Swapping the Values Without Using Third Variable by using sum and differences concepts of math.
    //Thuật toán: Có 3 bước tiêu chuẩn như được liệt kê dưới đây:
    //Sự khác biệt của số thứ hai so với số đầu tiên được lưu trữ trong ô bộ nhớ nơi số đầu tiên đã được lưu trữ.
    //Tổng của cả hai số được lưu trữ trong ô nhớ thứ hai (số).
    //Sự khác biệt của số đầu tiên với số thứ hai được tính toán và lưu trữ trong ô bộ nhớ nơi giá trị đầu tiên ban đầu được lưu trữ.
    static void swapValuesWithoutThirdVariable (int [] values) {
        //difference of second number from first number is stored in first variable
        values[0] = values[0] - values[1];
        //sum of both numbers is stored in second variable
        values[1] = values[0] + values[1];
        //difference of first number with second number is calculated and stored in first variable
        values[0] = values[1] - values[0];
    }
    public static void main(String[] args){
        int [] values = {10, 145};
        swapValuesWithoutThirdVariable(values);
        System.out.println("Value of m is " + values[0] + " and value of n is " + values[1]);
    }
}
