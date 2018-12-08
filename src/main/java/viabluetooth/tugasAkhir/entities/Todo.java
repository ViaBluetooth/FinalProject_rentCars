/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viabluetooth.tugasAkhir.entities;

/**
 *
 * @author aflah brilli
 */
public class Todo {
    private Integer id;
    private Login user;
    private String todo;
    private boolean done;
    
    public Todo(){
        
    }

    public Todo(Integer id, Login user, String todo, boolean done) {
        this.id = id;
        this.user = user;
        this.todo = todo;
        this.done = done;
    }
}
