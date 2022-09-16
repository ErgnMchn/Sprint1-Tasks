public class Envolope {
    private final double firstEnvelopeHeight;
     private final double firstEnvelopeWidth;
    private final double secondEnvelopeHeight;
    private final double secondEnvelopeWidth ;
    
    public Envolope(double firstEnvelopeHeight, double firstEnvelopeWidth, double secondEnvelopeHeight, double secondEnvelopeWidth) {
        this.firstEnvelopeHeight = firstEnvelopeHeight;
        this.firstEnvelopeWidth = firstEnvelopeWidth;
        this.secondEnvelopeHeight = secondEnvelopeHeight;
        this.secondEnvelopeWidth = secondEnvelopeWidth;
    }


    public double getFirstEnvelopeHeight() {
        return firstEnvelopeHeight;
    }

    public double getFirstEnvelopeWidth() {
        return firstEnvelopeWidth;
    }

    public double getSecondEnvelopeHeight() {
        return secondEnvelopeHeight;
    }

    public double getSecondEnvelopeWidth() {
        return secondEnvelopeWidth;
    }

    public void printResultOfAnalysis(){
        if ((firstEnvelopeHeight <= secondEnvelopeHeight && firstEnvelopeWidth <= secondEnvelopeWidth) && (firstEnvelopeWidth<=secondEnvelopeHeight && firstEnvelopeHeight<=secondEnvelopeWidth)) {
            System.out.println("first envelope can fit into the second envelope");
        } else {
            System.out.println("the first envelope cannot fit into the second envelope");
        }
    }
}
