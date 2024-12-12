import java.util.Scanner;
public class studentManager {
    Scanner sc = new Scanner(System.in);
    private student[] students;
    private int currentStudentIndex = 0;
    private int totalStudents = 10;
    private final int DEFAULT_NEW_SIZE = 10;

    public studentManager() {
        students = new student[DEFAULT_NEW_SIZE];
    }

    public void addStudent(){
        System.out.println("nhập thông tin học sinh mới: ");
        System.out.println("Enter student name: ");
        String name = sc.nextLine();
        System.out.println("Enter student age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter student id: ");
        String id = sc.nextLine().trim();

        for(int i = 0; i < currentStudentIndex; i++){
            if(students[i] != null && students[i].getId().trim().equalsIgnoreCase(id)){
                System.out.println("ID không được trùng");
                return;
            }
        }
        students[currentStudentIndex] = new student(id, age, name);
        resizeArray();
        currentStudentIndex++;
    }

    private void resizeArray() {
        if(currentStudentIndex == totalStudents){
            this.totalStudents = totalStudents + DEFAULT_NEW_SIZE;
            this.students = copyArray(totalStudents,this.students);
        }
    }

    private student[] copyArray(int totalStudents, student[] students) {
        student[] student = new student[totalStudents];
        for(int i = 0; i < students.length; i++){
            student[i] = students[i];
        }
        return student;
    }

    public void showAll() {
        for(student i : students){
            if(i != null){
                System.out.println("------------------");
                System.out.println(i.getName() + " " + i.getAge() + " " + i.getId());
            }
        }
    }

    public void changeInfo(){
        System.out.println("Nhập mã sinh viên cần sửa: ");
        String fixId = sc.nextLine().trim();
        student fixStudent = null;
        int index = -10;
        for(int i = 0; i < currentStudentIndex; i++){
            if(students[i] != null && students[i].getId().equalsIgnoreCase(fixId)){
                fixStudent = students[i];
                index = i;
                break;
            }
        }
        if(fixStudent != null && index >= 0){
            fixStudent.showInfo();

            System.out.println("nhập thông tin học sinh cần chỉnh sửa, nếu để trống giữ thông tin như cũ: ");
            System.out.println("Enter new student name: ");
            String newName = sc.nextLine();
            if(!newName.isEmpty()){
                students[index].setName(newName);
            }

            System.out.println("Enter new student age: ");
            String newAge = sc.nextLine();
            if(!newAge.isEmpty()){
                students[index].setAge(Integer.parseInt(newAge));
            }

            System.out.println("Enter new student id: ");
            String newId = sc.nextLine();
            if(!newId.isEmpty()){
                students[index].setId(newId);
            }
            System.out.println("Student infomation updated successfully! ");

        }else{
            System.out.println("id student not found");
        }
    }

    public void delete(){
        System.out.println("Nhập mã sinh viên cần xóa: ");
        String deleteId = sc.nextLine().trim();
        boolean success = false;
        for(int i = 0; i < currentStudentIndex; i++){
            if(students[i] != null && deleteId.equalsIgnoreCase(students[i].getId()))
            {
                success = true;
            }
        }
        if(!success){
            System.out.println("id student not found");
            return;
        }
        for(int i = 0; i < currentStudentIndex; i++){ //0 ... 5
            if(students[i] != null && !deleteId.equalsIgnoreCase(students[i].getId())){
                continue;
            }
            for(int j = i; j < currentStudentIndex; j++){
                if(j == currentStudentIndex - 1){
                    students[j] = null;
                }else {
                    students[j] = this.students[j + 1];
                }
            }
            System.out.println("delete student successfully");
            this.currentStudentIndex--;
        }
    }

    public void find(){
        System.out.println("Nhập tên sinh viên cần tìm: ");
        String findName = sc.nextLine().trim();
        boolean success = false;
        for(int i = 0; i < currentStudentIndex; i++){
            if(students[i] != null && findName.equalsIgnoreCase(students[i].getName()))
            {
                success = true;
                students[i].showInfo();
            }
        }
        if(!success){
            System.out.println("không tìm thấy tên sinh viên cần tìm");
            return;
        }
    }
}
