public class App {
    public static void main(String[] args) {

        Subject subject = new Subject("Programacao", "Facil");
        System.out.println(subject.getName() + " - " + subject.getDifficultyLevel());
        Student student = new Student("Andrey", "D5R8n@exemplo.com");
        System.out.println(student.getName() + " - " + student.getEmail());
        student.setEmail("TROCAR@TROCADO.com");
        System.out.println(student.getName() + " - " + student.getEmail());
        System.out.println(student.getName() + " - " + student.getEmail() + " -" + student.getSubject());
        student.setSubject(subject);
        System.out.println(student.getName() + " - " + student.getEmail() + " -" + student.subject.getName() + " - "
                + student.subject.getDifficultyLevel());

    }
}
