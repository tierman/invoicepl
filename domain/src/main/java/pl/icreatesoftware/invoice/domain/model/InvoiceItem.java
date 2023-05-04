package pl.icreatesoftware.invoice.domain.model;

import lombok.Builder;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Currency;

@Builder
@EqualsAndHashCode
class InvoiceItem {
    private String name;
    private Integer quantity;
    private Currency currency;
    private BigDecimal netAmount;
    private Vat vat;
}
