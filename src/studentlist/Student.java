package studentlist;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *fetch
 * @author shaim
 */
public class Student {
 
    private String name;
    private int id;
    private String Dob;
   
    public Student()
    {
           this.name = "Not Set";
           this.id =0;
    }
    public Student(String givenName, int givenId)
    {
        this.name = givenName;
        this.id = givenId;
    }
    public void setName(String givenName)
    {
        this.name = givenName;
    }
    public String getName()
    {
           return this.name;
    }
    
    public void setId(int givenId)
    {
        this.id = givenId;
    }
    public int getId()
    {
           return this.id;
    }

    /**
     * @return the Dob
     */
    public String getDob() {
        return Dob;
    }

    /**
     * @param Dob the Dob to set
     */
    public void setDob(String Dob) {
        this.Dob = Dob;
    }
            
    
}
