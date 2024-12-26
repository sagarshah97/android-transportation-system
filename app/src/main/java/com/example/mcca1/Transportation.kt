/**
 * This file contains the definition of the abstract Transportation class.
 */
package com.example.mcca1

/**
 * Transportation is an abstract base class representing a mode of transportation.
 * It defines common attributes shared by all types of transportation.
 * This class defines the common properties and methods for all types of transportation.
 *
 * @property name The name of the transportation.
 * @property ID The unique identifier of the transportation.
 *
 * This is an abstract class, so it can't be instantiated directly, but it serves as a blueprint
 * for concrete transportation types.
 */
abstract class Transportation(val name: String, val ID: Int) {}
