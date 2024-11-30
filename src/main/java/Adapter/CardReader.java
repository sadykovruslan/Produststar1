package Adapter;

public class CardReader implements Usb {
    MemoryCard memoryCard;

    public CardReader(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }
    public void connectionWithUsb(){
        memoryCard.insert() ;
        memoryCard.copyData();
        memoryCard.remove();
    }
}
