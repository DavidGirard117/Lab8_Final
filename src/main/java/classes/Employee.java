package main.java.classes;

/**
 * Employee
 */
import java.util.Date;

public class Employee extends Person {

    private String jobTitle;
    private Date hireDate;

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Employee( int id, String firstName, String lastName, Date hireDate, String jobTitle) {
        setId(id);
        setFirstName(firstName);
        setLastName(lastName);
        setJobTitle(jobTitle);
        setHireDate(hireDate);
       
    
    }

}