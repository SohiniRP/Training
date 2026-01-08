package com.week3.designpatterns.creational.builder;

class User {
    private final String name;
    private final int age;
    private final String address;
    private final String phone;
    private final boolean isActive;

    private User(UserBuilder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.phone = builder.phone;
        this.isActive = builder.isActive;
    }

    @Override
    public String toString() {
        return name + " " + age + " " + address + " " + phone + " " + isActive;
    }

    public static class UserBuilder {
        private final String name;   // mandatory
        private final int age;       // mandatory
        private String address;      // optional
        private String phone;        // optional
        private boolean isActive;    // optional

        public UserBuilder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder isActive(boolean isActive) {
            this.isActive = isActive;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

