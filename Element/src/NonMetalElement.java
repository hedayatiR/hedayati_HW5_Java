public class NonMetalElement extends Element{

    public NonMetalElement(String symbol, int atomicNumber, double atomicWeight){
        super(symbol, atomicNumber, atomicWeight);
    }

    public  void describeElement(){
        System.out.println("Nonmetals are poor conductors.");
    }
}
