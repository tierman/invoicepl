package pl.icreatesoftware.invoice.domain.model;

import pl.icreatesoftware.invoice.domain.ports.InvoicePort;

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
    private Entity seller;
    private Entity buyer;
    private List<InvoiceItem> invoiceItemList;
    private Payment payment;

    private InvoicePort repository;

    public Invoice save() {
        return repository.save(this);
    }
}
