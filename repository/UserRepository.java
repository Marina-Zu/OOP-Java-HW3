package repository;
/** - Создать интерфейс UserRepository<U extends User,I> унаследовав его от Repository<E, I>
 - В интерфейс UserRepository<E,I> задать абстрактный метод E findByFio (String fio)*/

import data.User;

import java.util.Collection;

public interface UserRepository<E extends User, I> extends Repository<E,I>{
    E findByFio (String fio);
    boolean deleteByLastName(String lastName);
    Collection<E> findAll();

}
