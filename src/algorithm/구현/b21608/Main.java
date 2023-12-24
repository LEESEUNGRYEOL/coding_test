package algorithm.구현.b21608;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Student {
    int studentNumber;
    int[] likeList;
    boolean isSeated;
    int[] possibleSeat;

    Student(int studentNumber, int[] likeList) {
        this.studentNumber = studentNumber;
        this.likeList = likeList;
        this.isSeated = false;
    }
}

public class Main {

    public static void printStudent(Student student){
        System.out.println("========================");
        System.out.println("학생의 번호는: "+student.studentNumber);
        System.out.println("학생이 좋아하는 리스트: "+Arrays.toString(student.likeList));
        System.out.println("학생이 앉았는지: "+ student.isSeated);
        System.out.println();
    }


//    public static int[][] cou
//
//    public static int countVoidSeat(Student student, int[][] arr){
//
//    }
//
//    public static int countLikeSeat(Student student, int[][] arr){
//
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Student> studentList = new ArrayList<>();
        int[][] result = new int[N+1][N+1];
        for (int i = 1; i <= N * N; i++) {
            int student = scanner.nextInt();
            int[] tmp = new int[4];
            for (int j = 0; j < 4; j++) {
                tmp[j] = scanner.nextInt();
            }
            studentList.add(new Student(student, tmp));
        }

//        for(Student student: studentList){
//            printStudent(student);
//        }



    }

}
