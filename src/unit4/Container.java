/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit4;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author unscathed18
 */
public class Container {
    // Generics
    List<Package> contents;
    
    public Container(){
        contents = new LinkedList<Package>();
    }
    
    public boolean add(Package p){
        return !contents.contains(p) && contents.add(p);
    }
    
    public boolean remove(Package p){
        return contents.remove(p);
    }
    
    public double getVolume(){
        double volumen = 0.0;
        for(Package p : contents){
            volumen += p.getVolume();
        }
        return volumen;
    }
    
    public int size(){
        return contents.size();
    }
    
    public void clear(){
        contents.clear();
    }
    
    public boolean contains(Package p){
        return contents.contains(p);
    }
    
}
