package pl.icreatesoftware.invoice.domain.ports;

import pl.icreatesoftware.invoice.domain.model.Address;

public interface AddressPort {
    Address save(Address address);
}
