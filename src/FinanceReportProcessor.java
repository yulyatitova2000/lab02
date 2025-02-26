public class FinanceReportProcessor {
    public static FinanceReport familyFilter(FinanceReport source, char c){
        FinanceReport report = new FinanceReport(source.getFio(), source.getYear(), source.getMonth(), source.getDay());

        for(int i = 0; i < source.count(); i++){
            Payment payment = source.getPayment(i);
            if(payment.getFio().charAt(0) == c){
                report.addPayment(payment.getClone());
            }
        }

        return report;
    }

    public static FinanceReport amountFilter(FinanceReport source, int amount){
        FinanceReport report = new FinanceReport(source.getFio(), source.getYear(), source.getMonth(), source.getDay());

        for(int i = 0; i < source.count(); i++){
            Payment payment = source.getPayment(i);
            if(payment.getAmount() < amount){
                report.addPayment(payment.getClone());
            }
        }

        return report;
    }
}
