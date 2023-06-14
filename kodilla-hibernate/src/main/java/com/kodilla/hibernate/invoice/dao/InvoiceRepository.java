package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public interface InvoiceRepository extends CrudRepository<Invoice, Integer> {
    Invoice findByNumber(String number);

    BigDecimal totalValue(int invoiceId);
}
