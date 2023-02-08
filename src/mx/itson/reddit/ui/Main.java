/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.reddit.ui;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import mx.itson.reddit.entidades.Usuario;
import mx.itson.reddit.entidades.Post;
import mx.itson.reddit.entidades.Comunidad;
import mx.itson.reddit.entidades.Comentario;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emmanuel
 */
public class Main {
    
    public static void main(String[] args) throws ParseException{
        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        // Usuarios
        Usuario u = new Usuario();
        u.setNombre("Gustavo Calderon");
        u.setCorreo("gustavo.enmail@gmail.com");
        
        Usuario u2 = new Usuario();
        u.setNombre("Diego Hernandez");
        u.setCorreo("diego.herny@gmail.com");
        
        Usuario u3 = new Usuario();
        u.setNombre("xXMasterGamerPro31Xx");
        u.setCorreo("elgamermaspro@outlook.es");
        
        Usuario u4 = new Usuario();
        u.setNombre("Martin Flores");
        u.setCorreo("titobarbacoa72@outlook.es");
        
        Usuario u5 = new Usuario();
        u.setNombre("Titi Mepregunto");
        u.setCorreo("sitengomuchasnovias@outlook.es");
             
        // Posts
        Post p = new Post();
        p.setTitulo("¿Qué opinan de las chips moradas?");
        p.setFecha(formato.parse("01/02/2023"));
        p.setPuntos(7);
        p.setUsuario(u);
        p.setContenido("A mi me gustan mucho son las mejores papas estan muy buenas mm q rico ya se me antojaron ahorita voy por unas");
        
        // Comentarios
        // Post chips moradas
        List<Comentario> comentarios = new ArrayList<Comentario>();
                
        Comentario c = new Comentario();
        c.setCuerpo("no loco estas mal las mejores papas son los doritos nacho");
        c.setFecha(formato.parse("02/02/2023"));
        c.setPuntos(-1);
        c.setUsuario(u2);
        comentarios.add(c);
         
        Comentario c1 = new Comentario();
        c1.setCuerpo("JAJAJA no saben que rollo bastardos las mejores son las papatias adobadas");
        c1.setFecha(formato.parse("01/02/2023"));
        c1.setPuntos(2);
        c1.setUsuario(u3);
        comentarios.add(c1);
        
        Comentario c2 = new Comentario();
        c2.setCuerpo("a mi tambien me gustan mucho y mas con valentina");
        c2.setFecha(formato.parse("01/02/2023"));
        c2.setPuntos(1);
        c2.setUsuario(u4);
        comentarios.add(c2);
        
        Comentario c3 = new Comentario();
        c3.setCuerpo("yo me como 2 bolsas diarias");
        c3.setFecha(formato.parse("02/02/2023"));
        c3.setPuntos(0);
        c3.setUsuario(u5);
        comentarios.add(c3);
        
        p.setComentarios(comentarios);
    }
    
    
    
}
