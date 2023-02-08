/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.reddit.entidades;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Emmanuel
 */
public class Post {
    private String titulo;
    private Usuario usuario;
    private String contenido;
    private Date fecha;
    private int puntos;
    private List<Comentario> comentarios;
    private Comunidad comunidad;
}
