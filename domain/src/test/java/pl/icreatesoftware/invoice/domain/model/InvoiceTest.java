package pl.icreatesoftware.invoice.domain.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import pl.icreatesoftware.invoice.domain.port.InvoiceNumberGenerator;
import pl.icreatesoftware.invoice.domain.port.SellerSelector;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    private static final String NUMBER = "2023/01/01/00001";
    private static final String CITY = "Warsaw";
    private InvoiceNumberGenerator generatorMock;
    private SellerSelector selectorMock;

    @BeforeEach
    void setUp() {
        generatorMock = Mockito.mock(InvoiceNumberGenerator.class);
        selectorMock = Mockito.mock(SellerSelector.class);
        Mockito.when(generatorMock.generate()).thenReturn(NUMBER);
        Mockito.when(selectorMock.select()).thenReturn(prepareSeller());
    }

    @Test
    void createAnEmptyInvoice() {
        //given
        //when
        var invoice = Invoice.create(generatorMock, selectorMock);

        //then
        assertNotNull(invoice);
        assertEquals(NUMBER, invoice.getNumber());
        assertEquals(CITY, invoice.getIssuePlace());
    }

    @Test
    void addItemsToInvoiceCorrectly() {
        //given
        var invoice = Invoice.create(generatorMock, selectorMock);

        //when
        for (int i = 0; i < 10; ++i) {
            invoice.getItems().add(InvoiceItem.builder().build());
        }

        //then
        assertEquals(10, invoice.getItems().size());
    }


    @Test
    void removeItemsFromInvoiceCorrectly() {
        //given
        var invoice = Invoice.create(generatorMock, selectorMock);
        for (int i = 0; i < 10; ++i) {
            invoice.getItems().add(InvoiceItem.builder()
                            .name("TEST "+i)
                            .build());
        }

        //when
        invoice.getItems().remove(InvoiceItem.builder()
                .name("TEST 5")
                .build());

        //then
        assertEquals(9, invoice.getItems().size());
    }

    private Company prepareSeller() {
        return Company.builder()
                .address(prepareAddress())
                .build();
    }

    private Address prepareAddress() {
        return Address.builder()
                .city(CITY)
                .build();
    }
}