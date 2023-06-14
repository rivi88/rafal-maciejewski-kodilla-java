package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.InvoiceItem;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Test
    public void testInvoiceDaoSave() {
        // given
        Invoice invoice = new Invoice("123");

        // when
        invoiceRepository.save(invoice);
        int invoiceId = invoice.getId();

        // then
        assertNotNull(invoiceId);

        // clean-up
        invoiceRepository.deleteById(invoiceId);
    }

    @Test
    public void testInvoiceDaoFindByNumber() {
        // given
        Invoice invoice = new Invoice("123");
        invoiceRepository.save(invoice);

        // when
        Invoice retrievedInvoice = invoiceRepository.findByNumber("123");

        // then
        assertNotNull(retrievedInvoice);
        assertEquals("123", retrievedInvoice.getNumber());

        // clean-up
        invoiceRepository.deleteById(retrievedInvoice.getId());
    }

    @Test
    public void testInvoiceDaoTotalValue() {
        // given
        Invoice invoice = new Invoice("123");
        invoice.getItems().add(new InvoiceItem("Item 1", new BigDecimal("100"), 2));
        invoice.getItems().add(new InvoiceItem("Item 2", new BigDecimal("50"), 4));
        invoiceRepository.save(invoice);

        // when
        BigDecimal totalValue = invoiceRepository.totalValue(invoice.getId());

        // then
        assertEquals(new BigDecimal("300"), totalValue);

        // clean-up
        invoiceRepository.deleteById(invoice.getId());
    }
}
