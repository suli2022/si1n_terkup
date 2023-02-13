/*
* File: Cone.java
* Author: Sallai András
* Copyright: 2023, Sallai András
* Group: Szoft I-1 N
* Date: 2023-02-13
* Github: https://github.com/sulie2022/
* Licenc: GNU GPL
*/

public class Cone {
    double calcVolume(double radius, double height) {
        double volume = (1.0/3.0) * 
        Math.pow(radius, 2) *
        Math.PI *
        height;
        return volume; 
    }    
}
