package repository;

import model.person.Employee;

import java.util.List;

public interface IRepository {
    void addrepo(List<Employee> employees);
    void displayRepo();
    void eidtRepo();
}
