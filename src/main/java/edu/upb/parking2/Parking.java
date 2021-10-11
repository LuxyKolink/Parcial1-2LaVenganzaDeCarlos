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
    
    //ParkingSpot lefty = Parking.this.getCurrent();
    //ParkingSpot righty = Parking.this.getCurrent();
    
    private ParkingSpot current = null;
    private ParkingLot<Vehicle> circularParking;
    
    public Parking() {
        
        circularParking = new ParkingLot();
        for(int i = 0; i<=10; i++){
            circularParking.create(null);
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
    
    
    public void add(Vehicle molanoVehicle){
        
        //   il = contador izquierda(left)
        int i = 0;
        
        
        Vehicle newVehicle = molanoVehicle;
        
        if(current == null){
            //circularParking.setFirst(current);
            current = circularParking.getFirst();
        }
        
        ParkingSpot lefty = Parking.this.getCurrent();
        ParkingSpot righty = Parking.this.getCurrent();
        
        while(i <= 5){
            
            if(righty.getValue() == null || righty.getValue() == "IsEmpty"){
                current = righty;
                current.setValue(newVehicle);
                return;
            }
            
            righty = righty.getNext();
        
            if(lefty.getValue() == null || lefty.getValue() == "IsEmpty"){
                current = lefty;
                current.setValue(newVehicle);
                return;
            }
        
            lefty = lefty.getNext();
            i++;
    }
        
    }
    
    public void delete(String licensePlate){
        
        ParkingSpot deleteVehicle = circularParking.getFirst();
        
        String vehicleDelete = licensePlate;
        
        for(int i = 0; i<10; i++){
            
        }
    }
    
}
