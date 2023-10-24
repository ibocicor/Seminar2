package src.repository;

import src.domain.Identifiable;

public interface IRepository<T extends Identifiable, U > {

    public void addItem(T item);

    public boolean removeItem(T item);

    public T findItem(U id);

    //public getALlItems()
}
