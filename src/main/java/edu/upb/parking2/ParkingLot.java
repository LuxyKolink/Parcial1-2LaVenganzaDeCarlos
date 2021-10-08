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
public class ParkingLot <T extends Comparable<T>> implements IParkingLot<T>{
    
    private ParkingSpot first;
    private ParkingSpot last;
    private ParkingSpot current;

    public ParkingSpot getFirst() {
        return first;
    }

    public void setFirst(ParkingSpot first) {
        this.first = first;
    }

    public ParkingSpot getLast() {
        return last;
    }

    public void setLast(ParkingSpot last) {
        this.last = last;
    }

    public ParkingSpot getCurrent() {
        return current;
    }

    public void setCurrent(ParkingSpot current) {
        this.current = current;
    }
    
    public String print() {

        ParkingSpot current = first;
        String result = "";

        do{
            result += current.showInformation() + "\n";
            current = current.getNext();
        }while (current != first);

        return result;
    }

    @Override
    public void add(T spot) {
        
        ParkingSpot<T> current = new ParkingSpot(spot);
        //ParkingSpot<T> current = first;
        
        if (first == null){
            first = current;
            last = current;
            first.setNext(first);
            first.setPrevious(last);
        } else {
            last.setNext(current);
            current.setNext(first);
            current.setPrevious(last);
            last = current;
            first.setPrevious(last);
            
        }
    }
}
