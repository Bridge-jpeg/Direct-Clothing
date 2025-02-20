class Inventory {

    int topOrBottom;
    int genderSelect;
    int chooseItem;
    int displayOrder = chooseItem - 1;

    public void displayItemAndPrice(String[] String, double[] doubles){
        System.out.println(" ");
        for (int i = 0, x = 1; i < String.length; i++, x++) {
            System.out.println(x+ " "+ String[i] + ": " + doubles[i]);
        }
    }
//    Change myArray to String [] String and myArray2 to double [] doubles
    public String order(int chooseItem, String[] String){
        displayOrder = chooseItem - 1;
        return String[displayOrder];
    }
    public double orderPrice(int chooseItem, double[] doubles){
        displayOrder = chooseItem - 1;
        return + doubles[displayOrder];
    }
}
