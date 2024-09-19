package ru.work.store.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.work.store.model.Order;


@Repository
public interface StoreRepository extends CrudRepository<Order, Integer> {
}
