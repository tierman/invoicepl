package pl.icreatesoftware.invoice.domain.model;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import pl.icreatesoftware.invoice.domain.port.InvoiceNumberGenerator;
import pl.icreatesoftware.invoice.domain.port.SellerSelector;

import java.time.OffsetDateTime;
import java.util.*;

@Getter
public class Invoice {
    private UUID uuid;
    private OffsetDateTime createTime;
    private String number;

    @Setter
    private OffsetDateTime sellingDate;
    private OffsetDateTime issueDate;
    private String issuePlace;
    private Company seller;

    @Setter
    private Company buyer;

    private final List<InvoiceItem> items = new ArrayList<>();

    @Setter
    private Payment payment;

    public static Invoice create(InvoiceNumberGenerator generator,
                                 SellerSelector selector) {
        var invoice = new Invoice();
        invoice.uuid = UUID.randomUUID();
        invoice.createTime = OffsetDateTime.now();
        invoice.number = generator.generate();
        invoice.seller = selector.select();
        invoice.issueDate = OffsetDateTime.now();
        invoice.issuePlace = invoice.getSeller().getAddress().getCity();

        return invoice;
    }

}
