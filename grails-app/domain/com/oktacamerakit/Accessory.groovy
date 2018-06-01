package com.oktacamerakit

class Accessory {

    static constraints = {
    }

    User owner

    String name

    String category

    Integer numberAvailable

    static belongsTo = [camera: Camera]

    String toString() {
        return name
    }
    
}





