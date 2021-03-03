public class School {

    //final attributes
    private final String schoolName;
    private int numberOfClasses;
    private int numberOfBooks;
    private String studentEmail;

    public School(SchoolBuilder builder) {
        this.schoolName = builder.schoolName;
        this.numberOfClasses = builder.numberOfClasses;
        this.numberOfBooks = builder.numberOfBooks;
        this.studentEmail = builder.studentEmail;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public int getNumberOfClasses() {
        return numberOfClasses;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", numberOfClasses=" + numberOfClasses +
                ", numberOfBooks=" + numberOfBooks +
                ", studentName='" + studentEmail + '\'' +
                '}';
    }

    public static class SchoolBuilder{
        private final String schoolName;
        private int numberOfClasses;
        private int numberOfBooks;
        private String studentEmail;

        public SchoolBuilder(String schoolName){
            this.schoolName = schoolName;
        }

        public SchoolBuilder numberOfClasses(int numberOfClasses){
            this.numberOfClasses = numberOfClasses;
            return this;
        }

        public SchoolBuilder numberOfBooks(int numberOfBooks){
            this.numberOfBooks = numberOfBooks;
            return this;
        }

        public SchoolBuilder studentEmail(String studentEmail){
            this.studentEmail = studentEmail;
            return this;
        }

        public School  builder(){
            School school = new School (this);
            validateSchoolObject(school);
            return school;

        }

        private void validateSchoolObject(School school) {
        }
    }
}
