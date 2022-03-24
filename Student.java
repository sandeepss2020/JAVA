package lab2;

import java.util.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.Period;
import java.util.Calendar;

interface Age {
    LocalDate currentDate = LocalDate.now();
    int getAge();
}

class DateCreator {
    static Date createDate(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DATE, day);

        return cal.getTime();
    }

    static Date createDate(int year, int month, int day, int hour, int minute, int second) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month);
        cal.set(Calendar.DATE, day);
        cal.set(Calendar.HOUR, hour);
        cal.set(Calendar.MINUTE, minute);
        cal.set(Calendar.SECOND, second);

        return cal.getTime();
    }
}

public class Student {
    private String fname, lname;
    private Date dob;
    private int studentID;
    Classes attends;
    Course course;
    SubjectAttendance[] attendance;

    public Student(String fname, String lname, String dob, int studentID, Classes attends, Course course, SubjectAttendance[] attendance) {
        this.fname = fname;
        this.lname = lname;

        String[] dates = dob.split("/");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, Integer.parseInt(dates[0]));
        cal.set(Calendar.MONTH, Integer.parseInt(dates[1]));
        cal.set(Calendar.DATE, Integer.parseInt(dates[2]));
        this.dob = cal.getTime();

        this.studentID = studentID;
        this.attends = attends;
        this.course = course;
        this.attendance = attendance;
    }

    public String getStudentName() {
        return this.fname + this.lname;
    }

    public int getStudentAge() {
        Age age = new Age() {
            public int getAge() {
                final LocalDate studentDoB = dob.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                final Period difference = Period.between(studentDoB, currentDate);

                return difference.getYears();
            }
        };

        return age.getAge();
    }

    private void addAttendance() {
        this.attendance[0].addLectureAttendance(
            DateCreator.createDate(2022, 3, 20, 11, 0, 0), true
        );
        this.attendance[0].addLectureAttendance(
            DateCreator.createDate(2022, 3, 20, 12, 0, 0), true
        );
        this.attendance[0].addLectureAttendance(
            DateCreator.createDate(2022, 3, 22, 9, 0, 0), false
        );
        this.attendance[0].addLectureAttendance(
            DateCreator.createDate(2022, 3, 23, 13, 0, 0), true
        );

        this.attendance[1].addLectureAttendance(
            DateCreator.createDate(2022, 3, 20, 11, 0, 0), false
        );
        this.attendance[1].addLectureAttendance(
            DateCreator.createDate(2022, 3, 20, 12, 0, 0), false
        );
        this.attendance[1].addLectureAttendance(
            DateCreator.createDate(2022, 3, 22, 9, 0, 0), false
        );
        this.attendance[1].addLectureAttendance(
            DateCreator.createDate(2022, 3, 23, 13, 0, 0), true
        );
    }

    public void printStudentAttendancePercentage() {
        int totalConducted = 0, totalAttended = 0;

        for (int i = 0; i < attendance.length; i++) {
            totalConducted += this.attendance[i].getHoursConducted();
            totalAttended += this.attendance[i].getHoursAttended();
        }

        System.out.println("Total attendance percentage: " + (((float) totalAttended / totalConducted) * 100) + "%");
    }

    public static void main(String[] args) {
        Subject java = new Subject("MCA 372", "Java Programming", (byte) 4, (byte) 120, null, null);
        Subject ai = new Subject("MCA 341B", "Introduction to AI", (byte) 4, (byte) 120, null, null);
        Subject cn = new Subject("MCA 331", "Computer Networks", (byte) 4, (byte) 120, null, null);
        Subject ds = new Subject("MCA 371", "Data Structures in C", (byte) 4, (byte) 120, null, null);
        Subject[] subjects = { java, ai, cn, ds };
        
        SubjectAttendance javaAttendance = new SubjectAttendance(java);
        SubjectAttendance aiAttendance = new SubjectAttendance(ai);
        SubjectAttendance cnAttendance = new SubjectAttendance(cn);
        SubjectAttendance dsAttendance = new SubjectAttendance(ds);

        SubjectAttendance[] attendance = { javaAttendance, cnAttendance, dsAttendance, aiAttendance };

        Classes studentClass = new Classes(2147, 'A', (byte) 3, null, subjects);

        Student student = new Student("Ishaan", "Bose", "2000/04/28", 2147116, studentClass, new Course(), attendance);
        student.addAttendance();
        student.printStudentAttendancePercentage();
        
        System.out.println("AGE: " + student.getStudentAge());
    }
}
