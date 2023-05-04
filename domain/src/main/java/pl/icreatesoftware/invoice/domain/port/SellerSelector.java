package pl.icreatesoftware.invoice.domain.port;

import pl.icreatesoftware.invoice.domain.model.Company;

public interface SellerSelector {
    Company select();
}
