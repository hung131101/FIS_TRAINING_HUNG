package dao;

import core.Storage;

import java.util.List;

public interface StorageDAO {
    Storage addStorage(Storage storage);

    Storage findStorageById(Long storageId);

    List<Storage> findAll();

    Storage update(Storage storage);

    void remove(Long storageId);
}
