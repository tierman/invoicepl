package pl.icreatesoftware.invoice.domain.model;

import java.math.BigDecimal;
import java.util.Currency;

class InvoiceItem {
    private short number;
    private String name;
    private Integer quantity;
    private Currency currency;
    private BigDecimal netAmount;
    private Vat vat;
}
