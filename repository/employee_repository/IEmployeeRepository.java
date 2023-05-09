package repository.employee_repository;

import model.person.Employee;
import model.person.Person;
import repository.IRepository;

import java.util.List;

public interface IEmployeeRepository{
    void addrepo(Employee employees);
    void displayRepo();
    void eidtRepo(String edit);
}
