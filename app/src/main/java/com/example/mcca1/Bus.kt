/**
 * This file contains the definition of the Bus class, which is a specific type of transportation.
 */
package com.example.mcca1

/**
 * Bus is a subclass of Transportation and represents a bus vehicle.
 *
 * @property name The name of the bus.
 * @property ID The unique identifier of the bus.
 * @property _passengerCapacity The passenger capacity of the bus (private).
 * @property routeNumber The route number the bus is assigned to.
 */
class Bus(name: String, ID: Int, private var _passengerCapacity: Int, val routeNumber: String) :
    Transportation(name, ID) {

    /**
     * Function startRoute is used to initiate a bus route and print information about it.
     *
     * @return None.
     */
    fun startRoute() {
        println("$name with ID $ID for route $routeNumber. (Passenger capacity: " +
                "${_getPassengerCapacity()})")
    }

    /**
     * Constructor with validation logic.
     *
     * @throws IllegalArgumentException if passenger capacity is less than or equal to 0.
     */
    init {
        require(_passengerCapacity > 0) { "Passenger capacity must be greater than 0" }
    }

    /**
     * Private getter method _getPassengerCapacity is used to retrieve the passenger
     * capacity of the bus.
     *
     * @return An integer representing the passenger capacity.
     */
    fun _getPassengerCapacity(): Int {
        return _passengerCapacity
    }

    /**
     * Private setter method _setPassengerCapacity is used to set the passenger capacity of the bus.
     *
     * @param newCapacity An integer representing the new passenger capacity.
     * @throws IllegalArgumentException if newCapacity is less than or equal to 0.
     */
    fun _setPassengerCapacity(newCapacity: Int) {
        require(newCapacity > 0) { "Passenger capacity must be greater than 0" }
        _passengerCapacity = newCapacity
    }
}
