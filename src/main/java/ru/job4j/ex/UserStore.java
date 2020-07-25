package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User result = null;
        for (int index = 0; index < users.length; index++) {
            if (users[index].getUsername().equals(login)) {
                result = users[index];
                break;
            }
        }
        if (result == null) {
            throw new UserInvalidException("User not found.");
        }
        return result;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException(" User is not valid.");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr", true)
        };
        User user;
        try {
            user = findUser(users, "Petr");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ui) {
            ui.printStackTrace();
        } catch (UserNotFoundException un) {
            un.printStackTrace();
        }
    }
}