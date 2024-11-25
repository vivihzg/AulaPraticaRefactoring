public class TextStatement extends Statement {
    protected String header(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    protected String rentalDetail(Rental rental) {
        return "\t" + rental.getMovie().getTitle() + "\t" +
               String.valueOf(rental.getCharge()) + "\n";
    }

    protected String footer(Customer aCustomer) {
        return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n" +
               "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
               " frequent renter points";
    }
}
