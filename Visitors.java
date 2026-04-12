/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package project;

/**
 *
 * @author yana
 */
public class Visitors extends User{

    public Visitors(String username, String pass)
    {
        super(username, pass);
    }

    @Override
    public void displayinfo() {
        System.out.print("Visitor: " + username);
    }
}
