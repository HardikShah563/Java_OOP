interface student {
    void persnInfStu();
}

interface teacher {
    void persnInfTea();
}

class Exp5_1 implements student, teacher {
    public void persnInfStu() {
        System.out.println("Student details:-\nName: XYZ\nGrade: TY BTech\nBranch: ETRX\n");
    }

    public void persnInfTea() {
        System.out.println("Teacher details:-\nName: ABC\nNumber of years of experience: 20\nDegree: PhD in Physics");
    }

    public static void main(String args[]) {
        Exp5_1 ob = new Exp5_1();
        System.out.println("Hardik Shah    |    16010221025\n");
        ob.persnInfStu();
        ob.persnInfTea();
    }
}
