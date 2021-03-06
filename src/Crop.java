public abstract class Crop extends Plant implements Sellable, Paintable    {
    
    int sellPrice;

    @Override
    public int getSellPrice()   {
        return sellPrice;
    }

    @Override
    public boolean equals(Object other) {
        if(!(other instanceof Crop))    {
            return false;
        }
        Crop temp = (Crop)other;
        return temp.getID().equals(getID());
    }
}
