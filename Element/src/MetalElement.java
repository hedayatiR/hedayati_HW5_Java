public class MetalElement extends Element {

    public MetalElement(String symbol, int atomicNumber, double atomicWeight){
        super(symbol, atomicNumber, atomicWeight);
    }

    public void describeElement(){
        System.out.println("metals are good conductors of electricity.");
    }
}
