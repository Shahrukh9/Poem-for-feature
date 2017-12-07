public class Student {

    public static void main(String[] args) {

    }

    public static int sum(int math,int c,int vb,int data,int gate)  {

        System.out.println("Student Six Subject Marks");
        int sum = math + c + vb + data + gate;
        System.out.println("Sum"+sum);
        return sum;
    }
    public static int percent() {
        int per = (sum(3,3,3,3,33)/100);
        System.out.println("Percent"+per);
        System.out.println("Hello Github");
        return  per;
    }
    
    public static void grate() {
        switch (percent()) {
            case 1: System.out.println("Grade A");

        }
    }
}
