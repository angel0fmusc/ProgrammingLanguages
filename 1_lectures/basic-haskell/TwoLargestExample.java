public class TwoLargestExample {

    public static void main(String[] args) {

	if (args.length < 2) {
	    System.out.println("list is either empty or contains only one element");
	    System.exit(1);
	}

	int[] list = new int[args.length];
	for (int i = 0; i < args.length; i++) {
	    list[i] = Integer.parseInt(args[i]);
	}

	TwoLargest<Integer> twoLargest;

	// initialize two largest
	if (list[0] >= list[1]) {
	    twoLargest = new TwoLargest<Integer>(list[0],list[1]);
	}
	else {
	    twoLargest = new TwoLargest<Integer>(list[1],list[0]);
	}

	// iterate through list
	for (int i = 2; i < list.length; i++) {
	    twoLargest.update(list[i]);
	}

	System.out.println(twoLargest);
    }

}
