public class StudentMain {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S000" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Trev";
                        case 5 -> "Cat";
                        default -> "Anonymous";
                    },
                    "01/01/2000",
                    "Java Class");

            System.out.println(s);
        }

        Student pojoStudent = new Student("S0006", "Ann",
                "01/01/2001", "Java Class");
        LPAStudent recordStudent = new LPAStudent("S0007", "Bill",
                "01/02/2001", "Java Class");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java Exam 13");
//        recordStudent.setClassList(recordStudent.classList() + ", Java Exam 13");

        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());
    }

}
