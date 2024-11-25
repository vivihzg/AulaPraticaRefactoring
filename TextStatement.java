import java.util.Enumeration;

public class TextStatement extends Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = header(aCustomer);

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += rentalDetail(each);
        }
        result += footer(aCustomer);
        return result;
    }

    private String header(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    private String rentalDetail(Rental rental) {
        return "\t" + rental.getMovie().getTitle() + "\t" +
                String.valueOf(rental.getCharge()) + "\n";
    }

    private String footer(Customer aCustomer) {
        return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n" +
                "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                " frequent renter points";
    }
}
