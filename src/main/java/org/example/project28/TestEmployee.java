package org.example.project28;

import org.example.project28.Entity.Department;
import org.example.project28.Entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestEmployee {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();

        Session session = null;

        try {

//            session = factory.getCurrentSession();
//
//            Department dep = new Department("IT", 300, 1500);
//            Employee emp1 = new Employee("Ivan", "Ivanov", 800);
//            Employee emp2 = new Employee("Petr", "Chernyuh", 1000);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//
//            session.beginTransaction();
//            session.persist(dep);
//            session.getTransaction().commit();
//
//            System.out.println("Успешно!");

            /////////////////////////////

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Department department = session.get(Department.class, 1);
//
//            System.out.println(department);
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();
//
//            System.out.println("Успешно!");

            //////////////////////////////

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//
//            System.out.println("Успешно!");

            /////////////////////////////////////

            session = factory.getCurrentSession();

            session.beginTransaction();

            Employee employee = session.get(Employee.class, 2);

            session.remove(employee);

            session.getTransaction().commit();

            System.out.println("Успешно!");

        }
        finally {
            session.close();
            factory.close();
        }
    }
}
