/**
 * This file contains the definition of the Taxi class, which is a specific type of transportation.
 */
package com.example.mcca1

/**
 * Taxi is a subclass of Transportation and represents a taxi vehicle.
 *
 * @property name The name of the taxi.
 * @property ID The unique identifier of the taxi.
 * @property licensePlate The license plate of the taxi.
 * @property driverName The name of the taxi driver.
 * @property route The route the taxi is assigned to.
 */
class Taxi(name: String, ID: Int, val licensePlate: String, val driverName: String,
           var route: String) :
    Transportation(name, ID) {

    /**
     * Function startRide is used to initiate a taxi ride and print information about it.
     *
     * @return None.
     */
    fun startRide() {
        println("$name with ID $ID, driven by $driverName having license as $licensePlate " +
                "for route ${_getRoute()}")
    }

    /**
     * Private getter method _getRoute is used to retrieve the route
     * of the bus.
     *
     * @return A string representing the route.
     */
    fun _getRoute(): String {
        return route
    }

    /**
     * Private setter method _setRoute is used to set the route of the bus.
     *
     * @param newRoute An integer representing the new passenger capacity.
     */
    fun _setRoute(newRoute: String) {
        route = newRoute
    }
}
