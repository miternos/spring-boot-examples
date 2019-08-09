package com.miternos.sbexample.demo.cassandra;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CassandraRepository<UserEntity,String> {
    List<UserEntity> findByUser(final String user);

}
