package hotel_manage;

import java.util.Scanner;

public class faculty {
    public static void main(String[] args) {
        facultys ft = new facultys();
        attendance at = new attendance();
        login lg = new login();
        leave lv = new leave();
        course cs = new course();


        ft.facultys_details(101, "Rohit Sharma", 26, "rohitsharma@gmail.com", "computer science", "associate prof",
                "coordinator", "9876540234", 45000);
        ft.facultys_details_display();

        at.attendance_details("9:00", "4:00", 28, 3, 90);
        at.attendance_details_display();

        lg.login_details(123, "user", 787, "admin");
        lg.login_details_display();

        lv.leave_details(001, 23 / 03 / 22, "medical", 6);
        lv.leave_details_display();

        cs.course_details("CS-05", "MCA", "MCA123", "C Programming", "CAT");
        cs.course_details_display();

        

    }
}

// facultys class

class facultys {
    int facultys_id;
    String facultys_name;
    int facultys_age;
    String facultys_email;
    String facultys_dept;
    String facultys_designation;
    String facultys_role;
    String facultys_mobileno;
    int salary;

    public void facultys_details(int facultys_id, String facultys_name, int facultys_age,String facultys_email,String facultys_dept,
            String facultys_designation,
            String facultys_role, String facultys_mobileno, int salary) {
        this.facultys_id = facultys_id;
        this.facultys_name = facultys_name;
        this.facultys_age = facultys_age;
        this.facultys_email = facultys_email;
        this.facultys_dept = facultys_dept;
        this.facultys_designation = facultys_designation;
        this.facultys_role = facultys_role;
        this.facultys_mobileno = facultys_mobileno;
        this.salary = salary;

    }

    public void facultys_details_display() {
        System.out.println(
                "THE FOLLOWIG OUTPUT SHOWS ALL POSSILE CLASSES THAT ARE USED IN facultys DOMAIN WITH SOME VALUES ");
        System.out.println("\nThe Inputs are static input passed from objects of respective classes ");

        System.out.println("*********facultys DETAILS************");
        System.out.println("facultys id :" + facultys_id);
        System.out.println("facultys name :" + facultys_name);
        System.out.println("facultys age :" + facultys_age);
        System.out.println("facultys email :" + facultys_email);
        System.out.println("facultys dept :" + facultys_dept);
        System.out.println("facultys designation :" + facultys_designation);
        System.out.println("facultys role :" + facultys_role);
        System.out.println("facultys mobileno :" + facultys_mobileno);
        System.out.println("salary :" + salary);
        System.out.println("**************************************");
    }
}

// login class

class login {
    int user_id;
    String user_password;
    int admin_id;
    String admin_password;

    public void login_details(int user_id, String user_password, int admin_id, String admin_password) {
        this.user_id = user_id;
        this.user_password = user_password;
        this.admin_id = admin_id;
        this.admin_password = admin_password;

    }

    public void login_details_display() {
        System.out.println("********Login Details*********");
        System.out.println("user id:" + user_id);
        System.out.println("user password:" + user_password);
        System.out.println("admin id:" + admin_id);
        System.out.println("admin password:" + admin_password);
        System.out.println("******************************************");

    }
}

// attendance class

class attendance {
    String in_time;
    String out_time;
    int days_present;
    int days_absent;
    int attendance_percentage;

    public void attendance_details(String in_time, String out_time, int days_present, int days_absent,
            int attendance_percentage) {
        this.in_time = in_time;
        this.out_time = out_time;
        this.days_present = days_present;
        this.days_absent = days_absent;
        this.attendance_percentage = attendance_percentage;
    }

    public void attendance_details_display() {
        System.out.println("***********Attendance details*********");
        System.out.println("in_time:" + in_time);
        System.out.println("out_time:" + out_time);
        System.out.println("days_present:" + days_present);
        System.out.println("days_absent:" + days_absent);
        System.out.println("attendance_percentage:" + attendance_percentage);

    }

}

// leave class//

class leave {
    int leave_id;
    int leave_date;
    String leave_desc;
    int leave_period;

    public void leave_details(int leave_id, int leave_date, String leave_desc, int leave_period) {
        this.leave_id = leave_id;
        this.leave_date = leave_date;
        this.leave_desc = leave_desc;
        this.leave_period = leave_period;
    }

    public void leave_details_display() {
        System.out.println("***********Leave Details*********");
        System.out.println("leave_id:" + leave_id);
        System.out.println("leave_date:" + leave_date);
        System.out.println("leave_desc:" + leave_desc);
        System.out.println("leave_period:" + leave_period);

    }
}

// course class//

class course {
    String course_id;
    String course_name;
    String subject_id;
    String subject_name;
    String subject_type;

    public void course_details(String course_id, String course_name, String subject_id, String subject_name,
            String subject_type) {
        this.course_id = course_id;
        this.course_name = course_name;
        this.subject_id = subject_id;
        this.subject_name = subject_name;
        this.subject_type = subject_type;
    }

    public void course_details_display() {
        System.out.println("***********Course Details*********");
        System.out.println("course_id:" + course_id);
        System.out.println("course_name:" + course_name);
        System.out.println("subject_id:" + subject_id);
        System.out.println("subject_name:" + subject_name);
        System.out.println("subject_type:" + subject_type);

    }
}
