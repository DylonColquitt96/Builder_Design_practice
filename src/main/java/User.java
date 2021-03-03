public class User {

    //final attributes
    private final String firstname;// required
    private final String lastname;// required
    private final int age;//optional
    private final String phone;//optional
    private final String address;//optional

    private User(UserBuilder builder) {
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    //Only getters to keep immutability
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString(){
        return "User: " +this.firstname +", "+this.lastname+", "+this.age +", "+this.phone +". "+this.address;
    }

    public static class UserBuilder{
        private final String firstname;// required
        private final String lastname;// required
        private  int age;//optional
        private  String phone;//optional
        private String address;//optional

        public UserBuilder(String firstname, String lastName){
            this.firstname = firstname;
            this.lastname = lastName;
        }
        public UserBuilder age(int age){
            this.age = age;
            return this;
        }
        public UserBuilder phone(String phone){
            this.phone = phone;
            return this;
        }

        public UserBuilder address(String address){
            this.address = address;
            return this;
        }

        //Return the final constructed User object
        public User build(){
            User user = new User(this);
            validateUserObject(user);
            return user;
        }

        private void validateUserObject(User user) {
            //Does basic validation to check
            //If user object does not break any assumptions of system
        }

    }


}

