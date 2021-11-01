package pl.icreatesoftware.invoice.domain.ports;

import pl.icreatesoftware.invoice.domain.model.Invoice;

public interface InvoicePort {
    Invoice save(Invoice invoice);
}
