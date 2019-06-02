package com.evanson.requests.dataobject;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface RequestRepository extends CrudRepository<Request, Long> {
    List<Request> findByRequestor(String requestor);
}