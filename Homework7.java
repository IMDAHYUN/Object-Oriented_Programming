abstract class Printer{
    protected String model; //모델명
    protected int printedCount; //현재까지의 출력 매수
    protected int availableCount; //출력 가능 매수
    Printer(String model, int availableCount){
        this.model = model;
        this.availableCount = availableCount;
    }
    public abstract boolean print();
}
class InkjetPriner extends Printer { //잉크
    public InkjetPriner(String model, int availableCount) {
        super(model, availableCount);
    }

    @Override
    public boolean print() {
        if (availableCount == 0) {
            System.out.printf("%s: %d매째 인쇄 실패 - 잉크 부족.\n", model, printedCount + 1);
            return false;
        } else {
            printedCount++;
            availableCount--;
            return true;
        }
    }
}
class LaserPrinter extends Printer {
    public LaserPrinter(String model, int availableCount) {
        super(model, availableCount);
    }

    public boolean print() {
        if (availableCount == 0) {
            System.out.printf("%s: %d매째 인쇄 실패 - 토너 부족.\n", model, printedCount + 1);
            return false;
        } else {
            printedCount++;
            availableCount--;
            return true;
        }
    }
}
public class Homework7 {
    public static void main(String[] args){
        InkjetPriner inkjet = new InkjetPriner("Brother DCP-T720DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while(inkjet.print());
        while(laser.print());
    }
}
