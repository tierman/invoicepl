package pl.icreatesoftware.invoice.domain.model;

import pl.icreatesoftware.invoice.domain.ports.InvoicePort;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Invoice {

    private UUID uuid;
    private ZonedDateTime createTime;
    private String invoiceNumber;
    private ZonedDateTime sellingDate;
    private ZonedDateTime issueDate;
    private String issuePlace;
    private Entity seller;
    private Entity buyer;
    private final List<InvoiceItem> invoiceItemList = new ArrayList<>();
    private Payment payment;

    private InvoicePort repository;

    public Invoice create(Invoice invoice) {


        return repository.save(this);
    }
}
