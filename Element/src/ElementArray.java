public class ElementArray {
    public static void main(String[] args) {
        Element[] elements = new Element[4];
        elements[0] = new MetalElement("Fe", 26, 55.845);
        elements[1] = new NonMetalElement("O", 8, 15.999);
        elements[2] = new MetalElement("Al", 13, 26.982);
        elements[3] = new MetalElement("I", 53, 126.90);

        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i].getSymbol() + " atomic number is " + elements[i].getAtomicNumber() +
                    ". Its atomic weight is " + elements[i].getAtomicWeight());
            elements[i].describeElement();
            System.out.println();
        }
    }
}
