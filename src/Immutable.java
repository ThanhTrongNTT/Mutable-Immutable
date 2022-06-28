/**
 * Create by: IntelliJ IDEA
 * User     : trongnt
 * Date     : Mon, 6/27/2022
 * Time     : 15:05
 * Filename : Immutable
 */
public class Immutable {
    private String name;
    private String address;
    private String birthYear;

    public Immutable(String name, String address, String birthYear) {
        this.name = name;
        this.address = address;
        this.birthYear = birthYear;
    }

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
class ImmutableExercise{
    public static void Exercise(){
        System.out.println("---Immutable---");
        Immutable Obj1 = new Immutable("Trong","36/99 Le Thi Hong","2001");
        Immutable Obj2 = new Immutable("Thanh","64 Le Duc Tho","2002");
        System.out.println(
                "obj1 element is: "+
                        "name: "+ Obj1.getName()+"\n"+
                        "address: "+Obj1.getAddress()+"\n"+
                        "birthYear: "+Obj1.getBirthYear()+"\n"
        );
        System.out.println(
                "obj2 element is: "+
                        "name: "+ Obj2.getName()+"\n"+
                        "address: "+Obj2.getAddress()+"\n"+
                        "birthYear: "+Obj2.getBirthYear()+"\n"
        );
    }
}