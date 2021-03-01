public class RadioactiveElement extends ChemicalElement {

    int halfLife;
    
    public RadioactiveElement(int atomicNumber,String symbol,String name,int halflife) {
        super(atomicNumber, symbol, name);
        this.halfLife = halflife;
    }
    
    public int getHalfLife() {
        return halfLife;
    }
    
}