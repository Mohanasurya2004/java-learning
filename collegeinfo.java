import java.util.Scanner;

public class collegeinfo {
    static void personal_info(String name,int age,long num){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("num:"+num);
    }
    static void collegeinfo(String name,int vm_no,int reg_no){
        System.out.println("name:"+name);
        System.out.println("vm_no:"+vm_no);
        System.out.println("reg_no:"+reg_no);
    }

    public static void main(String[] args) {
        personal_info("surya",21,9159631565L);
        collegeinfo("vtmt",14782,113122);
    }
}
