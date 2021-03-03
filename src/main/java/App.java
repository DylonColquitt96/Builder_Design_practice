public class App {

    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Dylon", "Colquitt")
                .age(28)
                .phone("937-831-2781")
                .address("my address")
                .build();

        System.out.println(user1);

        User user2 = new User.UserBuilder("Eric", "Averbeck")
                .age(30)
                .address("Same address as Dylon")
                .build();
        System.out.println(user2);

        User user3 = new User.UserBuilder("Dejha", "Corbitt")
                .age(24)
                .build();
        School school1 = new School.SchoolBuilder("Wright Patt")
                .numberOfClasses(3)
                .numberOfBooks(5)
                .studentEmail("Email")
                .builder();
        System.out.println(user3.getFirstname() + " Is " + user3.getAge() +" and goes to school at " + school1.getSchoolName() + ". she goes to " +
                school1.getNumberOfClasses() + " classes and her email is " + school1.getStudentEmail());

        System.out.println("Both " + user1.getFirstname() + " and " + user3.getFirstname() + " goes to "+ school1.getSchoolName());
    }
}
