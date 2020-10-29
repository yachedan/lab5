package com.company;

public class Ring {
    private double radius;
    private double thickness;
    private double wideness;

    public Ring (double radius, double thickness, double wideness)
    {
        this.radius = radius;
        this.thickness = thickness;
        this.wideness = wideness;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    public double getWideness() {
        return wideness;
    }

    public void setWideness(double wideness) {
        this.wideness = wideness;
    }
    public double outerLength(){
        return (2*Math.PI*this.getRadius());
    }
    public double innerLength(){
        return (2*Math.PI*(this.getRadius()-this.getThickness()));
    }
    public double area() {
        return (Math.PI*this.getRadius()*this.getRadius());
    }
    public double innerArea(){
        double innerRadius = this.getRadius() - this.getThickness();
        return(Math.PI*innerRadius*innerRadius);
    }
    public double outerArea(){
        return (this.area()-this.innerArea());
    }
    public double volume(){
        return(this.area()*this.getWideness());
    }
    public double innerVolume(){
        return(this.innerArea()*this.getWideness());
    }
    public double outerVolume(){
        return(this.outerArea()*this.getWideness());
    }

    //has

    @Override
    public String toString() {
        return "Ring{" +
                "radius=" + radius+
                ", thickness=" + thickness +
                ", wideness=" + wideness +
                ", outerLength=" + outerLength()+
                ", innerLength=" + innerLength()+
                ", area=" + area()+
                ", innerArea=" + innerArea()+
                ", outerArea=" + outerArea()+
                ", volume=" + volume()+
                ", innerVolume=" + innerVolume()+
                ", outerVolume=" + outerVolume()+
                '}';
    }

}
