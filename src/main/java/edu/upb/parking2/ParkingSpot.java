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
public class ParkingSpot <T extends Comparable<T>>{
    
    private ParkingSpot<T> next;
    private ParkingSpot<T> previous;
    private T value;

    public ParkingSpot(ParkingSpot<T> next, ParkingSpot<T> previous, T value) {
        this.next = next;
        this.previous = previous;
        this.value = value;
    }

    public ParkingSpot(ParkingSpot<T> next, T value) {
        this.next = next;
        this.value = value;
    }

    public ParkingSpot(T value) {
        this.value = value;
    }
    

    public ParkingSpot<T> getNext() {
        return next;
    }

    public void setNext(ParkingSpot<T> next) {
        this.next = next;
    }

    public ParkingSpot<T> getPrevious() {
        return previous;
    }

    public void setPrevious(ParkingSpot<T> previous) {
        this.previous = previous;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
    
    public String showInformation(){
        
        return value.toString();
    }
    
    
}
