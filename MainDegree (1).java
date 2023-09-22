import java.io.*;

class Degree {
    void getDegree() {
        System.out.println("I got a degree");
    }
}

class Undergraduate extends Degree {
    void getDegree() {
        System.out.println("I am an Undergraduate");
    }
}

class Postgraduate extends Degree {
    void getDegree() {
        System.out.println("I am a Postgraduate");
    }
}

class MainDegree {
    public static void main(String[] args) {
        Degree c = new Degree();
        Undergraduate a = new Undergraduate();
        Postgraduate b = new Postgraduate();
        c.getDegree();
        a.getDegree();
        b.getDegree();
    }
}
