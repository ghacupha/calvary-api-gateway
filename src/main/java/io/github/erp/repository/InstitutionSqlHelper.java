package io.github.erp.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.relational.core.sql.Column;
import org.springframework.data.relational.core.sql.Expression;
import org.springframework.data.relational.core.sql.Table;

public class InstitutionSqlHelper {

    public static List<Expression> getColumns(Table table, String columnPrefix) {
        List<Expression> columns = new ArrayList<>();
        columns.add(Column.aliased("id", table, columnPrefix + "_id"));
        columns.add(Column.aliased("institution_name", table, columnPrefix + "_institution_name"));

        columns.add(Column.aliased("parent_institution_id", table, columnPrefix + "_parent_institution_id"));
        return columns;
    }
}
