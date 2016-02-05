package labtest01;

import java.util.Iterator;

/**
 * Utility class with a driver program and some 
 * sample items and inventories.
 */
public final class Driver
{
	private static final Item ITEM_CEREAL = new Item("Cereal", 1, 200);
	private static final Item ITEM_JAM = new Item("Jam", 2, 400);
	private static final Item ITEM_BUTTER = new Item("Butter", 3, 250);
	
	private static final Item[] ITEMS = { ITEM_CEREAL, ITEM_JAM, ITEM_BUTTER };
		
	private Driver() {}
	
	/**
	 * @param pArgs Not used
	 */
	public static void main(String[] args) {
		Inventory pInventory = new Inventory("Driver");
		pInventory.stock(ITEM_CEREAL,5);
		pInventory.stock(ITEM_JAM, 5);
		pInventory.stock(ITEM_BUTTER, 5);
		
		Corporation corp = Corporation.get();
		corp.addInventory(pInventory);
		
		Iterator<Item> it = pInventory.iterator();
		
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}
