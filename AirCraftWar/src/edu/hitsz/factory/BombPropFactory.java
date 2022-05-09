package edu.hitsz.factory;

import edu.hitsz.prop.AbstractProp;
import edu.hitsz.prop.BombProp;

public class BombPropFactory extends AbstractPropFactory {

    public BombPropFactory() {
    }

    @Override
    public AbstractProp createProp(int locationX, int locationY, int speedX, int speedY) {
        return new BombProp(locationX, locationY, speedX, speedY);
    }
}
