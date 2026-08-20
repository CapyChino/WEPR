package murach.data;

import murach.business.User;

public class UserDB {

    public static int insert(User user) {
        // Placeholder: book later connects a real database.
        // For now just pretend the insert succeeded.
        System.out.println("UserDB.insert: "
                + user.getEmail() + ", "
                + user.getFirstName() + " "
                + user.getLastName());
        return 1;
    }
}
