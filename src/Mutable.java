/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Mon, 6/27/2022
 * Time     : 15:04
 * Filename : Mutable
 */
public class Mutable {
    private String name;
    private String address;
    private String birthYear;

    public Mutable(String name, String address, String birthYear) {
        this.name = name;
        this.address = address;
        this.birthYear = birthYear;
    }

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

class MutableExercise {
    public static void Exercise(){
        System.out.println("---Mutable---");
        Mutable Obj1 = new Mutable("Trong","36/99 Le Thi Hong","2001");
        Mutable Obj2 = Obj1;
        System.out.println(
                "obj1 element is: "+
                        "name: "+ Obj1.getName()+"\n"+
                        "address: "+Obj1.getAddress()+"\n"+
                        "birthYear: "+Obj1.getBirthYear()+"\n"
        );
        Obj2.setName("Thanh");
        Obj2.setAddress("64 Le Duc Tho");
        Obj2.setName("2002");
        System.out.println(
                "obj2 element is: "+
                        "name: "+ Obj2.getName()+"\n"+
                        "address: "+Obj2.getAddress()+"\n"+
                        "birthYear: "+Obj2.getBirthYear()+"\n"
        );
    }
}
