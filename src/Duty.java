
import java.math.BigDecimal;
import java.time.LocalDate;

public class Duty extends Note {
    private BigDecimal debtAmount;

    public Duty(String text, LocalDate localDate, NoteType noteType) {
        super(text, localDate, noteType);
    }

    public void setDebtAmount(BigDecimal debtAmount) {
        this.debtAmount = debtAmount;
    }

    public BigDecimal getDebtAmount() {
        return debtAmount;
    }


}
