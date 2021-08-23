package PatikaJava;

 class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


	public void addBulkExamNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
    }

    public void sozluNotuEkle(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.sozluNotu = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.sozluNotu = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.sozluNotu = kimya;
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.mat.sozluNotu  == 0|| this.fizik.sozluNotu == 0 || this.kimya.sozluNotu == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        double fizikAvarage = (this.fizik.note * 0.8) + (this.fizik.sozluNotu * 0.2);
        double kimyaAvarage = (this.kimya.note * 0.8) + (this.kimya.sozluNotu * 0.2);
        double matAvarage = (this.mat.note * 0.8) + (this.mat.sozluNotu * 0.2);
        this.avarage = (fizikAvarage + kimyaAvarage + matAvarage) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Kimya Notu : " + this.kimya.note);
    }

}

class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int sozluNotu;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.sozluNotu = 0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}

class Teacher {
    String name;
    String mpno;
    String branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }
}


public class Patika37  {
    public static void main(String[] args) {

        Course kimya = new Course("Kimya", "K101", "Kimya");
        Course fizik = new Course("Fizik", "F101", "Fizik");
        Course mat = new Course("Matematik", "M101", "Matematik");

        Teacher k1 = new Teacher("Marie Curie", "", "Kimya");
        Teacher f1 = new Teacher("Albert Einstein", "", "Fizik");
        Teacher m1 = new Teacher("Isaac Newton", "", "Matematik");

        kimya.addTeacher(k1);
        fizik.addTeacher(f1);
        mat.addTeacher(m1);

        kimya.printTeacher();
        fizik.printTeacher();
        mat.printTeacher();

        Student s1 = new Student("Muhammed Tosun", 1, "999", mat, fizik, kimya);
        s1.addBulkExamNote(55, 77, 99);
        s1.sozluNotuEkle(60, 80, 100);
        s1.printNote();
        s1.isPass();
    }
}
