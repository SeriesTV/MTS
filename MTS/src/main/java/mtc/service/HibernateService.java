package mtc.service;

/**
 * Created by Michal Czarnecki on 12.07.2016.
 */
public interface HibernateService<T> {

    void saveEntity(T entity);
}
