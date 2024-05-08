public class Computer {

    private int storageSpace;
    public String printerModel;
//    private boolean isPrinterConnected;

    public Computer(int storageSpace){
        this.storageSpace = storageSpace;
        this.printerModel = "";
//        this.isPrinterConnected = false;
    }

    public int getStorage(){
        return this.storageSpace;
    }

    public void addStorage(int storageToBeAdded){
        this.storageSpace += storageToBeAdded;
    }

    public void setPrinterProperty(String newPrinterModel){
        this.printerModel = newPrinterModel;
    }

    public String getPrinterProperty(){
        return this.printerModel;
    }

    public void printMessage(String stringToBePrinted){
        System.out.println(stringToBePrinted);
    }

}
