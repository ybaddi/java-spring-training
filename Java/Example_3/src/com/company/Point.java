package com.company;

public class Point {
    double abs;
    double ord;

    public Point(double abs, double ord) {
        this.abs = abs;
        this.ord = ord;
    }

    public double getAbs() {
        return abs;
    }

    public void setAbs(double abs) {
        this.abs = abs;
    }

    public double getOrd() {
        return ord;
    }

    public void setOrd(double ord) {
        this.ord = ord;
    }

    @Override
    public String toString() {
        return "Point{" +
                "abs=" + abs +
                ", ord=" + ord +
                '}';
    }

    double calculerDistance(Point p){
        return Math.sqrt(Math.pow((abs-p.abs),2) + Math.pow((ord-p.ord),2));
    }

    static double distance(Point p1, Point p2){
        return p1.calculerDistance(p2);
//        return Math.sqrt(Math.pow((p1.abs-p2.abs),2) + Math.pow((p1.ord-p2.ord),2));
    }

    Point calculeMilieu(Point p){
//        Point resultat = new Point(0.0,0.0);
//        double x = (abs+p.abs)/2;
//        double y = (ord+p.ord)/2;
//        resultat.abs=x;
//        resultat.ord=y;
//        return resultat;
         return new Point((abs+p.abs)/2, (ord+p.ord)/2);

    }

    public static void main(String[] args) {
        Point p = new Point(1.0,2.0);
        Point p2 = new Point(2.0,4.0);
        System.out.println(p);
        System.out.println(p2);


        System.out.println(p.calculerDistance(p2));
        System.out.println(Point.distance(p,p2));

        System.out.println(p.calculeMilieu(p2));
    }
}
