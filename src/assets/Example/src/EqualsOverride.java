class EqualsOverride1 {
    private String name;
    private int secondName;
    public EqualsOverride1(String name ,int secondName ) {
        this.name = name;
        this.secondName = secondName;
    }

//    @Override
//    public boolean equals(Object o) {
//        System.out.println("inside equal");
//        EqualsOverride1 c = (EqualsOverride1) o;
//        return c.name.equals(this.name) && c.secondName == (this.secondName);
//    }

    @Override
    public boolean equals(Object o) {
        System.out.println("inside equal");
        EqualsOverride1 c = (EqualsOverride1) o;
        return CharSequence.compare(c.name,name) == 0 && Integer.compare(c.secondName,secondName)==0;
    }
}

public class EqualsOverride {

    public static void main(String args[]) {
        EqualsOverride1 S1 = new EqualsOverride1("Jegan",10);
        EqualsOverride1 S2 = new EqualsOverride1("Jegan",10);
        Boolean boo = S1.equals(S2) ;
        System.out.println("Check :" + boo);
    }
}


