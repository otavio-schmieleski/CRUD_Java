package com.unimater.dao;

import com.unimater.model.ProductType;
import com.unimater.model.Sale;

import java.sql.*;
import java.util.List;
import java.util.function.Supplier;

public class SaleDAO extends GenericDAOImpl<Sale> implements GenericDAO<Sale> {
    private Connection connection;
    private final String TABLE_NAME = "sale";

    private final List<String> COLUMNS = List.of("description");

    public SaleDAO(Connection connection) {
        super(Sale::new, connection);
        super.tableName = TABLE_NAME;
        super.columns = COLUMNS;
    }
}
