import java.util.ArrayList;

public class FinanceReport {
    private final ArrayList<Payment> payments;
    private String fio;
    private int day;
    private int month;
    private int year;


    public FinanceReport(String fio, int year, int month, int day) {
        payments = new ArrayList<Payment>();
        this.fio = fio;
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public FinanceReport(FinanceReport report) {
        this(report.getFio(), report.getYear(), report.getMonth(), report.getDay());

        for(int i = 0; i < report.count(); i++){
            payments.add(report.getPayment(i).getClone());
        }
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }


    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }


    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int count(){
        return payments.size();
    }

    public void clear(){
        payments.clear();
    }

    public void addPayment(Payment payment){
        payments.add(payment);
    }

    public void removePayment(Payment payment){
        payments.remove(payment);
    }

    public Payment getPayment(int index){
        return payments.get(index);
    }

    @Override
    public String toString() {
        StringBuilder paymentsStr = new StringBuilder();
        for(int i = 0; i < count(); i++){
            paymentsStr.append(getPayment(i)+"\n");
        }
        return String.format("Автор: %s, дата: %d.%d.%d, Платежи: [\n%s]", fio, year, month, day, paymentsStr);


    }
}
