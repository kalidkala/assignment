import java.util.Date;

public class Loan {

    private Date loanDate;
    private Date returnDate;

    public Book myBook;
    public Member myMember;

    // Constructor
    public Loan(Date loanDate, Date returnDate, Book myBook, Member myMember) {
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.myBook = myBook;
        this.myMember = myMember;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    // Optional: Setters if you want to allow updating dates
    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
