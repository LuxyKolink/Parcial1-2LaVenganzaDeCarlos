/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkingLot;
import edu.upb.parking2.Driver;
import edu.upb.parking2.Parking;
import edu.upb.parking2.Vehicle;

/**
 *
 * @author santi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Parking parking = new Parking();
        
        Driver driver1 = new Driver(123, true);
        Vehicle vehicle1 = new Vehicle("ACA-321", "Toyota", driver1);
        
        Driver driver2 = new Driver(234, true);
        Vehicle vehicle2 = new Vehicle("DFR-193", "Toyota", driver2);
        
        Driver driver3 = new Driver(345, true);
        Vehicle vehicle3 = new Vehicle("HDJ-065", "Toyota", driver3);
        
        Driver driver4 = new Driver(456, true);
        Vehicle vehicle4 = new Vehicle("UIO-089", "Toyota", driver4);
        
        Driver driver5 = new Driver(567, true);
        Vehicle vehicle5 = new Vehicle("NDW-122", "Toyota", driver5);
        
        Driver driver6 = new Driver(678, true);
        Vehicle vehicle6 = new Vehicle("AKW-676", "Toyota", driver6);
        
        Driver driver7 = new Driver(789, true);
        Vehicle vehicle7 = new Vehicle("ANC-323", "Toyota", driver7);
        
        Driver driver8 = new Driver(890, true);
        Vehicle vehicle8 = new Vehicle("CPR-879", "Toyota", driver8);
        
        Driver driver9 = new Driver(135, true);
        Vehicle vehicle9 = new Vehicle("CKY-265", "Toyota", driver9);
        
        Driver driver10 = new Driver(357, true);
        Vehicle vehicle10 = new Vehicle("APO-970", "Toyota", driver10);
        
        Driver driver11 = new Driver(579, true);
        Vehicle vehicle11 = new Vehicle("XXX-898", "Toyota", driver11);
        
        parking.add(vehicle1);
        parking.add(vehicle2);
        parking.add(vehicle3);
        parking.add(vehicle4);
        parking.add(vehicle5);
        parking.add(vehicle6);
        parking.add(vehicle7);
        parking.add(vehicle8);
        parking.add(vehicle9);
        parking.add(vehicle10);
        parking.add(vehicle11);
        
        parking.getCircularParking().print();
        
    }
    
}
