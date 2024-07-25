
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    
    public boolean largerThan(Apartment compared) {
        int totalArea = this.rooms * this.squares;
        int totalAreaCompared = compared.rooms * compared.squares;
        
        if (totalArea > totalAreaCompared) {
            return true;
        }
        
        if (totalArea < totalAreaCompared) {
            return false;
        }
        
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        int totalPrice = this.princePerSquare * this.squares;
        int totalPriceCompared = compared.princePerSquare * compared.squares;
        
        if (totalPrice < totalPriceCompared) {
            return totalPriceCompared - totalPrice;
        }
       
        return totalPrice - totalPriceCompared;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int totalPrice = this.princePerSquare * this.squares;
        int totalPriceCompared = compared.princePerSquare * compared.squares;
        
        if (totalPrice > totalPriceCompared) {
            return true;
        }

        if (totalPrice < totalPriceCompared) {
            return false;
        }
        
        return false;
    }
}
