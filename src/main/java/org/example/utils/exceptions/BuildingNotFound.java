
package org.example.utils.exceptions;

public class BuildingNotFound extends Exception {
    public BuildingNotFound() {}

    // Constructor that accepts a message
    public BuildingNotFound(String message)
    {
        super(message);
    }
}