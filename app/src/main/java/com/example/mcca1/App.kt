/**
 * This file contains a sample implementation of a transportation system.
 */
package com.example.mcca1

/**
 * Function main is the main entry point of the program.
 *
 * @param args The command-line arguments (not used in this program).
 * @return None.
 */
fun main() {
    // Creating instances of transportation types (Train, Taxi, Bus) and initializing
    // them with specific attributes.
    val train = Train("Super Fast Express Train", 11029, 200, 120.0, "C-to-D")
    val taxi1 = Taxi("Yellow Taxi", 78, "XYZ123", "Alex", "A-to-b")
    val taxi2 = Taxi("Town Trip Taxi", 95, "XYZ879", "Michael", "E-to-F")
    val bus1 = Bus("Vagabond Bus", 398, 50, "B-to-C")
    val bus2 = Bus("Wayfair Bus", 77654, 65, "D-to-E")

    // Using getter-setter methods to modify passenger capacity and speed for
    // specific transportation instances.
    bus1._setPassengerCapacity(55)
    bus2._setPassengerCapacity(70)
    train._setPassengerCapacity(250)
    train._setSpeed(150.0)
    taxi1._setRoute("A-to-B")

    // Printing a message to describe the transportation system.
    println("Transportation system for reaching from Point A to Point F:")
    println("")

    // Initiating rides and routes for transportation instances.
    taxi1.startRide()
    bus1.startRoute()
    train.startJourney()
    bus2.startRoute()
    taxi2.startRide()
}
