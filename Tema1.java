class Student {
    int numarMatricol;
    String nume;
    String prenume;
    String formatieDeStudiu;

    public Student(int numarMatricol, String nume, String prenume, String formatieDeStudiu){
        this.numarMatricol=numarMatricol;
        this.nume=nume;
        this.prenume=prenume;
        this.formatieDeStudiu=formatieDeStudiu;
    }

    public String toString(){
        return "Student- "+"nr matricol: "+numarMatricol+", nume: "+nume+", prenume: "+prenume+", formatie de studiu: "+formatieDeStudiu+" -";
    }
}

public class Tema1{
    public static void main(String[] args) {
        Student s1 = new Student(580, "Horga", "Antonia", "ISM");

        System.out.println(s1);
    }
}