package Practice6;

public class Pr06_2 {
    public static void main(String[] args) {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);
    }
}
class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    int Total(){
    return kor+eng+math;
    }

    float Average(){
    float tmp = (float)Total()/3;
    return (Math.round(tmp*10f))/10f;
    }
    public String info(){
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math+ "," + Total() + "," + Average();
    }
}
