package service;

import model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.EmployeeRepository;

import java.util.Optional;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    public Employee save(Employee employee){
        return employeeRepository.save(employee);
    }
    public Optional<Employee> findByEmail(String email){
        return employeeRepository.findByEmail(email);
    }
    public Optional<Employee> findByUsername(String username){
        return employeeRepository.findByUsername(username);
    }
    public Optional<Employee> findByUsernameOrEmail(String username,String email){
        return employeeRepository.findByUsernameOrEmail(username,email);
    }

    public boolean existsByEmail(String email){
        return employeeRepository.existsByEmail(email);
    }
    public boolean existsByUsername(String username){
        return employeeRepository.existsByUsername(username);
    }

}
