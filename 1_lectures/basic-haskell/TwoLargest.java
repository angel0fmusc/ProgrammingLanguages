public class TwoLargest<Type extends Comparable<Type>> {
    private Type x0;
    private Type x1;
    
    public TwoLargest(Type x0, Type x1) {
	this.x0 = x0;
	this.x1 = x1;
    }
    
    public void update(Type y) {
	if (y.compareTo(x0) >= 0) {
	    x1 = x0;
	    x0 = y;
	}
	else if (y.compareTo(x1) >= 0) {
	    x1 = y;
	}
    }

    public String toString() {
	return "(" + x0 + "," + x1 + ")";
    }
}
