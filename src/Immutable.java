/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Mon, 6/27/2022
 * Time     : 15:05
 * Filename : Immutable
 */
// Khởi tạo class Immutable
public class Immutable {
    private String name;
    private String address;
    private String birthYear;

    // Tạo Constructor cho Class
    public Immutable(String name, String address, String birthYear) {
        this.name = name;
        this.address = address;
        this.birthYear = birthYear;
    }

    // Bởi vì là Class immutable nên chỉ có phương thức get chứ kh được quyền set
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getBirthYear() {
        return birthYear;
    }
}

// Khởi tạo class để ví dụ
class ImmutableExercise{
    // Tạo một function để chạy ví dụ
    public static void exercise(){

        // Vì là Immutable nên chỉ gán được giá trị lúc tạo và không được sửa đổi trong suốt quá trình tương tác với biến
        System.out.println("---Immutable---");
        Immutable student1 = new Immutable("Trong","36/99 Le Thi Hong","2001");
        Immutable student2 = new Immutable("Thanh","64 Le Duc Tho","2002");
        System.out.println(
                "obj1 element is: "+
                        "name: "+ student1.getName()+"\n"+
                        "address: "+student1.getAddress()+"\n"+
                        "birthYear: "+student1.getBirthYear()+"\n"
        );
        System.out.println(
                "obj2 element is: "+
                        "name: "+ student2.getName()+"\n"+
                        "address: "+student2.getAddress()+"\n"+
                        "birthYear: "+student2.getBirthYear()+"\n"
        );
    }
}