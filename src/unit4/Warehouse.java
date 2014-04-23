/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author unscathed18
 */
public class Warehouse extends Container {
    private final double maxCapacity;
    
    public Warehouse(double capacity){
        maxCapacity = capacity;
    }
    
    @Override
    public boolean add(Package p){
        if(p.getVolume() + getVolume() <= maxCapacity){
            return super.add(p);
        }
        return false;
    }
    
    public Iterator<Package> getPackages(){
        List<Package> copyContents = new ArrayList<Package>(contents);
        Collections.sort(copyContents, new Comparator<Package>(){
            public int compare(Package p1, Package p2){
                if(p1.getVolume() < p2.getVolume()){
                    return -1;
                } else if(p1.getVolume() == p2.getVolume()){
                    return 0;
                }else {
                        return 1;
                }
            }
        });
        return copyContents.iterator();
    }
}
