package com.travel.model;

import java.io.Serializable;

public class UserRouteAssco implements Serializable {

    private static final long serialVersionUID = -8511488053558493610L;
    private int id;
    private int routeId;
    private int userId;
        
    public int getId() {
        return this.id;
    }

    public UserRouteAssco setId(int id) {
        this.id = id;
        return this;
    }
        
    public int getRouteId() {
        return this.routeId;
    }

    public UserRouteAssco setRouteId(int routeId) {
        this.routeId = routeId;
        return this;
    }
        
    public int getUserId() {
        return this.userId;
    }

    public UserRouteAssco setUserId(int userId) {
        this.userId = userId;
        return this;
    }

}
