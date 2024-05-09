package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public int getTotal() {
		return total;
	}
  
    private static final int maksymalnyRozmiarDanych = 12;

	private static final int wartoscBledu = -1;

	private static final int indeksOstatniegoElementu = 11;

	private int[] numbers = new int[maksymalnyRozmiarDanych];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == wartoscBledu;
    }

    public boolean isFull() {
        return total == indeksOstatniegoElementu;
    }

    protected int peekaboo() {
        if (callCheck())
            return wartoscBledu;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return wartoscBledu;
        return numbers[total--];
    }

}
