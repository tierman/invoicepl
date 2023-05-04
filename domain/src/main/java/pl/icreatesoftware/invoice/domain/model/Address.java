package pl.icreatesoftware.invoice.domain.model;

import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
class Address {
    private UUID uuid;
    private String city;
    private String post;
    private String postalCode;
    private String province;
    private String street;
    private String buildingNumber;
    private String flatNumber;
}
