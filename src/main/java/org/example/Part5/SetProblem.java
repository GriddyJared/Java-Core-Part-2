package org.example.Part5;

import java.util.HashSet;

import java.util.Set;


public class SetProblem {


    static class User {

        private String name;

        private int age;


        public User(String name, int age) {

            this.name = name;

            this.age = age;

        }

        public String getName() {

            return name;

        }

        public void setName(String name) {

            this.name = name;

        }

        public int getAge() {

            return age;

        }

        public void setAge(int age) {

            this.age = age;

        }

        @Override
        public boolean equals(Object obj) {
            User user = (User) obj;
            return age == user.age && name.equals(user.name);
        }

        @Override
        public int hashCode() {
            return name.hashCode();

        }
    }



    public static void main(String[] args) {

        Set<User> users = new HashSet<>();

        users.add(new User("Max", 27));

        users.add(new User("Veronika", 20));

        users.add(new User("Denis", 30));

        users.add(new User("Max", 27));

        
        if (users.size() == 3) {

            System.out.println("System works well!");

        } else {

            throw new RuntimeException("Users set size should be 3!");

        }

    }

}


