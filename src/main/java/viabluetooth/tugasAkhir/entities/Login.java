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
public class Login {
    private Integer id;
    private String username;
    private String password;
    
    public Login(){
        
    }
    
    public Login(String username, String password){
        this(null, username, password);
    }

    public Login(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    
    
}
