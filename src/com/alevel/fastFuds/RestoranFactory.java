package com.alevel.fastFuds;

import com.alevel.fastFuds.burgers.BurgerFactory;
import com.alevel.fastFuds.mac.MacFactory;

public class RestoranFactory {

    public BurgerFactory burgerFactory;
    public MacFactory macFactory;

    public  RestoranFactory() {
        burgerFactory = new BurgerFactory();
        macFactory = new MacFactory();
    }

    public enum PropertyRestoran {
        WIFI,  PARKOVKA, LOCATIONCENTER, SKIDKI, METRO, SPICESOUS, VELOPARKOVKA
    }

    public Restoran greatRestoran(RestoranType type){
        switch (type){
            case MAC:
              return macFactory.greatNewMac();
            case BURGER:
                return burgerFactory.greatNewBurger();
        }throw new RestoranNotEnouth();

    }

    public  enum RestoranType{
        MAC, BURGER
    }

    public class RestoranNotEnouth extends RuntimeException{

    }
}
