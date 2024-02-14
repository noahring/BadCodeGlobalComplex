import java.util.ArrayList;public class M {ArrayList<A> aList = new ArrayList<>();public M() {super();this.aList = new ArrayList<A>();}public void a(String n, String t, double r) {A a = null;
        if (t.equals("H")){a = new H(n, 0, r);} else if (t.equals("S")) {a = new S(n, 0, r);} 	else if (t.equals("C")) {a = new C(n, 0, r);}
aList.add(a);}public void s(A a, double w) {a.s(w);}
public ArrayList<Double> p() {
ArrayList<Double> p = new ArrayList<>();
for (A a :aList) {p.add(a.c());}
return p;}}
