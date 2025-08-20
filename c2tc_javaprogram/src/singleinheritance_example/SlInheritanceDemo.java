package singleinheritance_example;

public class SlInheritanceDemo {
    public static void main(String[] args) {
        Trainer t = new Trainer (112, "Thamizhselvan", "Puducherry", 
                                52, "Lead", "Chennai/Puducherry");
        System.out.println(t);
        
        Person p = new Person(113,"dharshini","Puducherry");
        System.out.println(p);
    }
}