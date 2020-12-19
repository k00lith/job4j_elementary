package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int rsl = -1;
        for (User value : users) {
            if (value.getUsername().equals(login)) {
                rsl = 1;
                break;
            }
        }
        if (rsl == -1) {
            throw new UserNotFoundException("No index found");
        }
        User userValid = new User(login, true);
        return userValid;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if ((!user.isValid()) || (user.getUsername().length() < 3)) {
            throw new UserInvalidException("Not valid user");
        }
        return true;
    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ie) {
            System.out.println("User not valid");
            ie.printStackTrace();
        } catch (UserNotFoundException nfe) {
            System.out.println("User not found");
            nfe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
