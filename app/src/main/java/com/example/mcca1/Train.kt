/**
 * This file contains the definition of the Train class,
 * which is a specific type of transportation.
 */
package com.example.mcca1

/**
 * Train is a subclass of Transportation and represents a train vehicle.
 *
 * @property name The name of the train.
 * @property ID The unique identifier of the train.
 * @property passengerCapacity The passenger capacity of the train.
 * @property speed The speed of the train.
 * @property route The route the train is assigned to.
 */
class Train(name: String, ID: Int,
            var passengerCapacity: Int,
            var speed: Double,
            val route: String
) : Transportation(name, ID) {

    /**
     * Function startJourney is used to initiate a train journey
     * and print information about it.
     *
     * @return None.
     */
    fun startJourney() {
        println("$name with ID $ID for route $route. (Passenger capacity: " +
                "${_getPassengerCapacity()}, Speed: ${_getSpeed()})")
    }

    /**
     * Constructor with validation logic.
     *
     * @throws IllegalArgumentException if passenger capacity is less than or equal to 0
     * or if speed is less than or equal to 0.
     */
    init {
        require(passengerCapacity > 0) { "Passenger capacity must be greater than 0" }
        require(speed > 0.0) { "Speed must be greater than 0" }
    }

    /**
     * Private getter method _getPassengerCapacity is used
     * to retrieve the passenger capacity of the train.
     *
     * @return An integer representing the passenger capacity.
     */
    fun _getPassengerCapacity(): Int {
        return passengerCapacity
    }

    /**
     * Private getter method _getSpeed is used
     * to retrieve the speed of the train.
     *
     * @return A double representing the speed.
     */
    fun _getSpeed(): Double {
        return speed
    }

    /**
     * Private setter method _setPassengerCapacity is used
     * to set the passenger capacity of the train.
     *
     * @param newCapacity An integer representing the new passenger capacity.
     * @throws IllegalArgumentException if newCapacity is less than or equal to 0.
     */
    fun _setPassengerCapacity(newCapacity: Int) {
        require(newCapacity > 0) { "Passenger capacity must be greater than 0" }
        passengerCapacity = newCapacity
    }

    /**
     * Private setter method _setSpeed is used
     * to set the speed of the train.
     *
     * @param newSpeed A double representing the new speed.
     * @throws IllegalArgumentException if newSpeed is less than or equal to 0.
     */
    fun _setSpeed(newSpeed: Double) {
        require(newSpeed > 0.0) { "Speed must be greater than 0" }
        speed = newSpeed
    }
}
