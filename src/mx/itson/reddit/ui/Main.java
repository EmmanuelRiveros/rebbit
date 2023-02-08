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
        
        Usuario u6 = new Usuario();
        u.setNombre("MrFrankTv");
        u.setCorreo("mrfr4nktv@gmail.com");
        
        Usuario u7 = new Usuario();
        u.setNombre("LuckyDuck69");
        u.setCorreo("TheLucky96@gmail.com");
        
        Usuario u8 = new Usuario();
        u.setNombre("RodriguezGF");
        u.setCorreo("FedericoRodri12@gmail.com");
        
        Usuario u9 = new Usuario();
        u.setNombre("Cerdito31");
        u.setCorreo("ivan56_cdo@yahoo.com");
        
        Usuario u10 = new Usuario();
        u.setNombre("lizard455");
        u.setCorreo("MasonMount45@outlook.com");
        
        Usuario u11 = new Usuario();
        u.setNombre("MickMarcyy");
        u.setCorreo("MickMars__@outlook.com");
        
        Usuario u12 = new Usuario();
        u.setNombre("BocchiSimp");
        u.setCorreo("joel_reyes@outlook.com");
        
        Usuario u13 = new Usuario();
        u.setNombre("LoLEnjoyer31");
        u.setCorreo("Frank31ag@outlook.com");
        
        Usuario u14 = new Usuario();
        u.setNombre("EnzoSebastianEz");
        u.setCorreo("EnzoSennez@gmail.com");
        
        Usuario u15 = new Usuario();
        u.setNombre("EightDaysWeek");
        u.setCorreo("BeatlesFan78@outlook.com");
        
        // Posts
        Post p = new Post();
        p.setTitulo("¿Qué opinan de las chips moradas?");
        p.setFecha(formato.parse("01/02/2023"));
        p.setPuntos(7);
        p.setUsuario(u);
        p.setContenido("A mi me gustan mucho son las mejores papas estan muy buenas mm q rico ya se me antojaron ahorita voy por unas");
        
        Post p2 = new Post();
        p.setTitulo("¿El Call Of Duty Black Ops 2, es el mejor cod?");
        p.setFecha(formato.parse("05/02/2023"));
        p.setPuntos(10);
        p.setUsuario(u6);
        p.setContenido("La neta si y quien piense lo contrario que venga conmigo a debatirlo y ya vera lo que le pasa");
        
        Post p3 = new Post();
        p.setTitulo("¿Es vegetta777 el mejor youtuber español?");
        p.setFecha(formato.parse("11/01/2023"));
        p.setPuntos(10);
        p.setUsuario(u11);
        p.setContenido("Considerando la trayectoria de vegetta, el hecho de que se ha esforzado por subir practicamente 2 videos diarios todos los dias y no se mete en polemica, lo hace el besto youtuber");
        
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
        
        // Comentarios2
        // Post2 Call of duty black ops
        List<Comentario> comentarios2 = new ArrayList<Comentario>();
                
        Comentario c4 = new Comentario();
        c4.setCuerpo("Depende de si estas hablando de todo el cod en general, contando el modo historia y zombies, pero otra buena opcion es el black ops 3");
        c4.setFecha(formato.parse("05/02/2023"));
        c4.setPuntos(4);
        c4.setUsuario(u7);
        comentarios.add(c4);
         
        Comentario c5 = new Comentario();
        c5.setCuerpo("La verdad, este vato tiene toda la razon");
        c5.setFecha(formato.parse("05/02/2023"));
        c5.setPuntos(3);
        c5.setUsuario(u8);
        comentarios.add(c5);
        
        Comentario c6 = new Comentario();
        c6.setCuerpo("A mi me gusta mas el Cold War");
        c6.setFecha(formato.parse("06/02/2023"));
        c6.setPuntos(-2);
        c6.setUsuario(u9);
        comentarios.add(c6);
        
        Comentario c7 = new Comentario();
        c7.setCuerpo("Denle un premio a este wey por decir algo tan basado");
        c7.setFecha(formato.parse("06/02/2023"));
        c7.setPuntos(0);
        c7.setUsuario(u10);
        comentarios.add(c7);
        
        p2.setComentarios(comentarios2);
        
        // Comentarios3
        // Post3 Vegetta777
        List<Comentario> comentarios3 = new ArrayList<Comentario>();
                
        Comentario c8 = new Comentario();
        c8.setCuerpo("Nmms ni que estuvieras chiquito, ya madura vegetta es para niños");
        c8.setFecha(formato.parse("12/01/2023"));
        c8.setPuntos(-1);
        c8.setUsuario(u12);
        comentarios.add(c8);
         
        Comentario c9 = new Comentario();
        c9.setCuerpo("A ver tal vez si sea infancia pero es un contenido muy basico sin editar, que han logrado trascender por la personalidad agradable de vegetta");
        c9.setFecha(formato.parse("12/01/2023"));
        c9.setPuntos(2);
        c9.setUsuario(u13);
        comentarios.add(c9);
        
        Comentario c10 = new Comentario();
        c10.setCuerpo("no c a mi si me gusta");
        c10.setFecha(formato.parse("13/01/2023"));
        c10.setPuntos(1);
        c10.setUsuario(u14);
        comentarios.add(c10);
        
        Comentario c11 = new Comentario();
        c10.setCuerpo("Digan lo que quieran pero vegetta esta bien guapo");
        c10.setFecha(formato.parse("14/01/2023"));
        c10.setPuntos(0);
        c10.setUsuario(u15);
        comentarios.add(c11);
        
        p3.setComentarios(comentarios3);
       
        
        
    }
    
    
    
}
