package repository;

import domain.Stone;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

public class StoneRepositoryImpl implements StoneRepository {
    private static final AtomicLong SEQUENCE = new AtomicLong(1);
    private static Map<Long, Stone>


    @Override
    public Stone save(Stone stone) {
        return null;
    }
    @Override
    public void update(Stone stone) {

    }

    @Override
    public Optional<Stone> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Stone deleteById(Long id) {
        return null;
    }
}
