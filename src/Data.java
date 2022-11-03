public class Data {

    private static String symbols = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_0123456789";

    public static boolean validate (String login,
                                    String password,
                                    String confirmPassword) {
        try {
            check(login,password,confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    private static void check (String login,
                               String password,
                               String confirmPassword) throws WrongLoginException, WrongPasswordException{
        if (!validate(login)) {
            throw new WrongLoginException("Логин невалидный!");
        }
        if (!validate(password)) {
            throw new WrongPasswordException("Пароль невалидный!");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли должны совпадать!");
        }
    }

    private static boolean validate (String z) {
        if (z.length() > 20) {
            return false;
        }
        for (int i = 0; i < z.length(); i++) {
            if (!symbols.contains(String.valueOf(z.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
