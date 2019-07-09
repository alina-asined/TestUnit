/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

/**
 *
 * @author Guga
 */
public class Person {
    
    private String name;
    private int age;
    private int id;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
   
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    public boolean travel(String name){
        if(name.equals("alina")){
            System.out.print(this.name + " is travelling" );
            return true;
            
        }else{System.out.print(this.name + " isn't travelling");
            return false;}
    
    }
    
    public  boolean holiday(){
        if(this.equals("alina")){
            
            System.out.print( this.name + "favorite location is the sea  ");
            return true;
            
        }else{System.out.print(this.name + "doesn't like the sea");
            return false;}
    }
}
