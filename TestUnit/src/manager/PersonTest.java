/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

/**
 *
 * @author Guga
 */
public class PersonTest {
    @Test
        public void test(){
        
            Person person = new Person("alina",15); 
           Person person1 = Mockito.spy(person);
            Mockito.doReturn(true).when(person1).travel("alina");
            Assert.assertEquals(true, person.holiday());
            
        }
}

