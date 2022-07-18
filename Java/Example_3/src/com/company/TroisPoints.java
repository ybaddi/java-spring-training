package com.company;

public class TroisPoints {
    Point premier;
    Point deuxieme;
    Point troisieme;

    public TroisPoints(Point premier, Point deuxieme, Point troisieme) {
        this.premier = premier;
        this.deuxieme = deuxieme;
        this.troisieme = troisieme;
    }

    public Point getPremier() {
        return premier;
    }

    public void setPremier(Point premier) {
        this.premier = premier;
    }

    public Point getDeuxieme() {
        return deuxieme;
    }

    public void setDeuxieme(Point deuxieme) {
        this.deuxieme = deuxieme;
    }

    public Point getTroisieme() {
        return troisieme;
    }

    public void setTroisieme(Point troisieme) {
        this.troisieme = troisieme;
    }

    boolean sontAlignes(){
       return (premier.calculerDistance(deuxieme) == premier.calculerDistance(troisieme) + deuxieme.calculerDistance(troisieme))
               || (premier.calculerDistance(troisieme) == premier.calculerDistance(deuxieme) + deuxieme.calculerDistance(troisieme))
               || (deuxieme.calculerDistance(troisieme) == premier.calculerDistance(troisieme) + premier.calculerDistance(deuxieme));
    }

    boolean sontIsocele(){
        return (premier.calculerDistance(deuxieme) == premier.calculerDistance(troisieme))
                || (premier.calculerDistance(deuxieme) == deuxieme.calculerDistance(troisieme))
                || (deuxieme.calculerDistance(troisieme) == premier.calculerDistance(troisieme));
    }

    public static void main(String[] args) {
        // scanner
        Point p1 = new Point(1.0,2.0);
        Point p2 = new Point(2.0,4.0);
        Point p3 = new Point(3.0,6.0);

        TroisPoints tp = new TroisPoints(p1,p2,p3);
        System.out.println(tp.sontAlignes());

        System.out.println(tp.sontIsocele());

    }
}
