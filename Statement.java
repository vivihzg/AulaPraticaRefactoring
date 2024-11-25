import java.util.Enumeration;

public abstract class Statement {
    public String value(Customer aCustomer) {
        String result = header(aCustomer);
        Enumeration<Rental> rentals = aCustomer.getRentals();
        
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += rentalDetail(each);
        }
        
        result += footer(aCustomer);
        return result;
    }

    protected abstract String header(Customer aCustomer);

    protected abstract String rentalDetail(Rental rental);

    protected abstract String footer(Customer aCustomer);
}
