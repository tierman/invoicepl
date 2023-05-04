package pl.icreatesoftware.invoice.domain.model;

import lombok.Builder;
import lombok.Getter;

import java.awt.image.BufferedImage;
import java.util.List;
import java.util.UUID;

@Getter
@Builder
public class Company {
    private UUID uuid;
    private String name;
    private Address address;
    private BufferedImage logo;
    private String nip;
    private List<AdditionalInfo> additionalInfos;
}
