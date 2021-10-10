/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.parking2;
/**
 *
 * @author santi
 */
public class Parking {
    
    private ParkingSpot current = null;
    private ParkingLot<Vehicle> circularParking;
    
    
    
    public Parking() {
        
        circularParking = new ParkingLot();
        for(int i = 0; i<=10; i++){
            circularParking.create(null);
        }
    }
    
    public void add(Vehicle molanoVehicles){
        
        //   il = contador izquierda(left)
        int il = 0;
        int ir = 0;
        
        if(current == null){
            circularParking.setFirst(current);
            current = circularParking.getFirst();
        }
        while(il <= 5 && ir <= 5){
            
            if(current)
    }
        
    }

    public ParkingLot<Vehicle> getCircularParking() {
        return circularParking;
    }

    public void setCircularParking(ParkingLot<Vehicle> circularParking) {
        this.circularParking = circularParking;
    }

    public ParkingSpot getCurrent() {
        return current;
    }

    public void setCurrent(ParkingSpot current) {
        this.current = current;
    }
    
    
}
