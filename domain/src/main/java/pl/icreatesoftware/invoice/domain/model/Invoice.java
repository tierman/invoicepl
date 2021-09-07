package pl.icreatesoftware.invoice.domain.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Invoice {
    private UUID uuid;
    private LocalDateTime createTime;
    private String invoiceNumber;
    private LocalDate sellingDate;
    private LocalDate issueDate;
    private String issuePlace;
    private Company seller;
    private Company buyer;
    private List<InvoiceItem> invoiceItemList;
    private Payment payment;
}
