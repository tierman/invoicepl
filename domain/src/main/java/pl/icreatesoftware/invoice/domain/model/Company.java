package pl.icreatesoftware.invoice.domain.model;

import java.util.List;
import java.util.UUID;

public class Company {
    private UUID uuid;
    private String name;
    private Address address;
    private String nip;
    private List<AdditionalInfo> additionalInfos;
}
