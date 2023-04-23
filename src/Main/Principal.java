/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author 10722126729
 */
public class Principal {
public static void main(String args[]) {
Trabalhador severino = new Trabalhador("sapato", 500);
Trabalhador raimundo = new Trabalhador("bota", 500);
Trabalhador josevaldo = new Trabalhador ("tenis", 500);
severino.start();
raimundo.start();
josevaldo.start();
}
}
