package com.travel.model;

import java.io.Serializable;

public class Path implements Serializable {

    private static final long serialVersionUID = 2556112422543627738L;
    private int id;
    private int routeId;
    private double xStart;
    private double yStart;
    private double xEnd;
    private double yEnd;
    private int coordinateId;
        
    public int getId() {
        return this.id;
    }

    public Path setId(int id) {
        this.id = id;
        return this;
    }
        
    public int getRouteId() {
        return this.routeId;
    }

    public Path setRouteId(int routeId) {
        this.routeId = routeId;
        return this;
    }
        
    public double getXStart() {
        return this.xStart;
    }

    public Path setXStart(double xStart) {
        this.xStart = xStart;
        return this;
    }
        
    public double getYStart() {
        return this.yStart;
    }

    public Path setYStart(double yStart) {
        this.yStart = yStart;
        return this;
    }
        
    public double getXEnd() {
        return this.xEnd;
    }

    public Path setXEnd(double xEnd) {
        this.xEnd = xEnd;
        return this;
    }
        
    public double getYEnd() {
        return this.yEnd;
    }

    public Path setYEnd(double yEnd) {
        this.yEnd = yEnd;
        return this;
    }
        
    public int getCoordinateId() {
        return this.coordinateId;
    }

    public Path setCoordinateId(int coordinateId) {
        this.coordinateId = coordinateId;
        return this;
    }

}
