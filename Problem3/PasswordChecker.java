public class PasswordChecker {
    private final String password;

    public PasswordChecker(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password cannot be null.");
        }
        this.password = password;
    }

    public String getStrength() {
        if (password.length() < 6) {
            return "Weak";
        }
        if (password.length() <= 9) {
            return "Medium";
        }
        return "Strong";
    }

    public static void main(String[] args) {
        PasswordChecker shortPassword = new PasswordChecker("abcd");
        PasswordChecker mediumPassword = new PasswordChecker("abcdefgh");
        PasswordChecker strongPassword = new PasswordChecker("abcdefghij");

        System.out.println("abcd: " + shortPassword.getStrength());
        System.out.println("abcdefgh: " + mediumPassword.getStrength());
        System.out.println("abcdefghij: " + strongPassword.getStrength());
    }
}
