public class Computer {

    private int storageSpace;
    private String printerModel;

    // constructor
    public Computer(int storageSpace){
        this.storageSpace = storageSpace;
        // Use empty string to denote printer is disconnected.
        this.printerModel = "";
    }

    // method for getting storage space
    public int getStorage(){
        return this.storageSpace;
    }

    // method for adding storage
    public void addStorage(int storageToBeAdded){
        this.storageSpace += storageToBeAdded;
    }

    // method for setting printer property
    public void setPrinterProperty(String newPrinterModel){
        this.printerModel = newPrinterModel;
    }

    public String getPrinterProperty(){
        return this.printerModel;
    }

    public void printMessage(String stringToBePrinted){
        // Check if printerModel string is empty string
        // if not empty print message
        if (this.printerModel != ""){
            System.out.println(stringToBePrinted);
        } else {
            System.out.println("Error! No printer connected!");
        }

    }

}
