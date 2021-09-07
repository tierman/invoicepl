package pl.icreatesoftware.invoice.domain.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Payment {
    private PaymentMethod paymentMethod;
    private LocalDate paymentDate;
    private BigDecimal payedAmount;
    private String amountAsText;
    private String bankName;
    private String bankAccount;
}
