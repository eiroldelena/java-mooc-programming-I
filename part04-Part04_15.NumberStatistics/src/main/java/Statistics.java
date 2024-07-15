
public class Statistics {
    private int count;
    private int sum;
    
    public void Statistics() {
       this.count = 0;
       this.sum = 0;
    }
    
    public void addNumber(int number) {
        this.sum = this.sum + number;
        this.count++;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        // so average will not become NaN when 0/0
        if (this.count == 0) {
            return 0.0;
        }

        return this.sum / (double) this.count;
    }
}
