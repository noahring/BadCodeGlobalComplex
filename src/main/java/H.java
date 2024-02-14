
public class H extends A {public H(String n, double w, double r) {super(n, w, r);}@Override
    public double c() {if(this.m()<=40) {return this.m() * this.y;} else {double o = this.m() - 40;double op = (float) (this.y * 1.5 * o); return this.y*40+op;}}}
