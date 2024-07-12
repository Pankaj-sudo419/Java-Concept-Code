import com.encapsulation.EncapsulationExample;

public class Interview {
    public static void main(String[] args){
        EncapsulationExample encapsulationExample = new EncapsulationExample();
        EncapsulationExample e2 = new EncapsulationExample("Debayan",24,"It");
        encapsulationExample.setName("Pankaj");
        encapsulationExample.setAge(25);
        encapsulationExample.setProfession("Associate Analyst");
        System.out.println(e2.getName() +" "+ e2.getAge() + "  " +e2.getProfession());

        System.out.println("name:- " + encapsulationExample.getName()+
                "  age:- "+encapsulationExample.getAge() +
                "   profession:-  " +encapsulationExample.getProfession());
    }

}
