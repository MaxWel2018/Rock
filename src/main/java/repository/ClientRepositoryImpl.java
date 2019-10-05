package repository;

import domain.Client;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class ClientRepositoryImpl implements ClientRepository{
    private static final AtomicLong SEQUENCE = new AtomicLong(1);
    private static Map<Long, Client> idToClient = new HashMap<>();
    private static Map<String, List<Client>> bySurName = Collections.emptyMap();



    @Override
    public Client save(Client client) {
        Long id = client.getId();
        if (id == null) {
            id = SEQUENCE.getAndIncrement();
            client.setId(id);
        }
        idToClient.put(id, client);
        updateIndices();
        return idToClient.get(id);
    }

    @Override
    public void update(Client client) {
        save(client);
    }

    @Override
    public Optional<Client> findById(Long id) {
        return Optional.ofNullable(idToClient.get(id));
    }

    @Override
    public Client deleteById(Long id) {
        Client client = idToClient.remove(id);
        updateIndices();
        return client;
    }

    private void updateIndices() {
        bySurName = idToClient.values().stream().collect(Collectors.groupingBy(Client::getSurName));

    }

}
