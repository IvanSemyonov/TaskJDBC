package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("Иван","Семенов", (byte) 19);
        userService.saveUser("Василий","Пупкин", (byte) 40);
        userService.saveUser("Егор","Маслов", (byte) 94);
        userService.saveUser("Пётр","Сидоров", (byte) 7);

        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }

        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
