package com.geometry;

public class Line {
    private double x1, y1, x2, y2;
    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Line otherLine = (Line) obj;
        return Double.compare(otherLine.x1, x1) == 0 &&
                Double.compare(otherLine.y1, y1) == 0 &&
                Double.compare(otherLine.x2, x2) == 0 &&
                Double.compare(otherLine.y2, y2) == 0;
    }
    public static void main(String[] args) {
        Line line1 = new Line(1.0, 2.0, 3.0, 4.0);
        Line line2 = new Line(1.0, 2.0, 3.0, 4.0);
        Line line3 = new Line(5.0, 6.0, 7.0, 8.0);
        System.out.println("line1 equals line2: " + line1.equals(line2));
        System.out.println("line1 equals line3: " + line1.equals(line3));
    }
}

