/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Mon, 6/27/2022
 * Time     : 15:04
 * Filename : Mutable
 */
// Khởi tạo class Mutable
public class Mutable {
    private String name;
    private String address;
    private String birthYear;

    // Tạo Constructor cho Class
    public Mutable(String name, String address, String birthYear) {
        this.name = name;
        this.address = address;
        this.birthYear = birthYear;
    }


    // Vì là Mutable nên sẽ có cả hai phương thức get và set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }
}

// Tạo class chứa các ví dụ
class MutableExercise {
    // Tạo một function thực thi ví dụ
    public static void exercise(){
        
        System.out.println("---Mutable---");
        // Tạo mới một biến Obj1 kiểu Mutable
        Mutable student1= new Mutable("Trong","36/99 Le Thi Hong","2001");
        // Tạo một obj2 có giá trị bằng obj1
        Mutable student2 = student1;

        // in obj1 ra màn hình console
        System.out.println(
                "obj1 element is: "+
                        "name: "+ student1.getName()+"\n"+
                        "address: "+student1.getAddress()+"\n"+
                        "birthYear: "+student1.getBirthYear()+"\n"
        );

        // Bởi vì là một biến Mutable nên obj2 có thể set lại giá trị của mình
        student2.setName("Thanh");
        student2.setAddress("64 Le Duc Tho");
        student2.setName("2002");
        // in obj2 ra màn hình console
        System.out.println(
                "obj2 element is: "+
                        "name: "+ student2.getName()+"\n"+
                        "address: "+student2.getAddress()+"\n"+
                        "birthYear: "+student2.getBirthYear()+"\n"
        );
    }
}
