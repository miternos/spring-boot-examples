
package com.miternos.sbexample.demo.cassandra;

import lombok.Data;
import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("users")
@Data
public class UserEntity {
    @PrimaryKeyColumn(
            type = PrimaryKeyType.PARTITIONED,
            ordering = Ordering.DESCENDING)
    private String user;

    @Column
    private String password ;

    @Column
    private String role ;

}
