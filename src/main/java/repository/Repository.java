package repository;

import java.util.Optional;

public interface Repository<T> {
    T save(T t);

    void update(T t );

    Optional<T> findById(Long id);

    T deleteById(Long id);
}
