class InputValidator {
    public static boolean isEmpty(String s){
        return s == null || s.trim().isEmpty();
    }

    public static boolean validPrice(double p){
        return p > 0;
    }
}
