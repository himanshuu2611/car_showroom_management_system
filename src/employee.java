import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.UUID;

public class employee extends showroom implements utility {
    String Employee_id;
    String Employee_name;
    int Employee_age;
    String Emp_department;

    @Override
    public void get_details() {
        System.out.println("ID : "+Employee_id);
        System.out.println("Name : "+Employee_name);
        System.out.println("Age : "+Employee_age);
        System.out.println("Department : "+Emp_department);
        System.out.println("Showroom Name : "+showroom_name);
    }

    @Override
    public void set_details() {
        Scanner sc=new Scanner(System.in);
        UUID vvid=UUID.randomUUID();
        Employee_id=String.valueOf(vvid);
        System.out.println("========Enter Employee Details=======");
        System.out.println();
        System.out.println("Employee Name : ");
        Employee_name=sc.nextLine();
        System.out.println("Employee Age :");
        Employee_age=sc.nextInt();
        sc.nextInt();
        System.out.println("Employee department : ");
        Emp_department=sc.nextLine();
        System.out.println("Showroom Name : ");
        showroom_name=sc.nextLine();

    }
}
