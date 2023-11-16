public class Student {
  private String name;
  private String email;
  protected Subject subject;

  public Student(String name, String email) {
      this.name = name;
      this.email = email;
      this.subject = null;
  }

  public String getName() {
      return this.name;
  }

  public String getEmail() {
    return this.email;
  }
  public void setEmail(String email) {
     this.email = email;
  }
  public void setSubject(Subject subject) {
    this.subject = subject;
  }
  public Subject getSubject() {
    return this.subject;
  }  
}
