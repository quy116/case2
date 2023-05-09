package repository.customer_repository;

import model.person.Customer;
import model.person.Employee;
import repository.IRepository;

public interface ICustomerRepository {
    void addrepo(Customer customer);
    void displayRepo();
    void eidtRepo(String edit);
}
