package igf.g6.defuncionesservice.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "defuncion")
public class Defuncion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) private long id;

    @Column(name = "primer_nombre") private String primer_nombre;
    @Column(name = "segundo_nombre") private String segundo_nombre;
    @Column(name = "primer_apellido") private String primer_apellido;
    @Column(name = "segundo_apellido") private String segundo_apellido;
    @Column(name = "apellido_casada") private String apellido_casada;
    @Column(name = "sexo") private String sexo;
    @Column(name = "libro") private Integer libro;
    @Column(name = "folio") private Integer folio;
    @Column(name = "edad") private Integer edad;
    @Column(name = "estado_civil") private String estado_civil;
    @Column(name = "lugar_fallecimiento") private String lugar_fallecimiento;
    @Column(name = "motivo") private String motivo;
    @Column(name = "fecha") private Date fecha;
    @Column(name = "hora") private Time hora;
    @Column(name = "nombre_forense") private String nombre_forense;
    @Column(name = "jvpm_forense") private String jvpm_forense;
    @Column(name = "fecha_registro") private Date fecha_registro;

    public Defuncion() {
    }

    public Defuncion(long id, String primer_nombre, String segundo_nombre, String primer_apellido, String segundo_apellido, String apellido_casada, String sexo, Integer libro, Integer folio, Integer edad, String estado_civil, String lugar_fallecimiento, String motivo, Date fecha, Time hora, String nombre_forense, String jvpm_forense, Date fecha_registro) {
        this.id = id;
        this.primer_nombre = primer_nombre;
        this.segundo_nombre = segundo_nombre;
        this.primer_apellido = primer_apellido;
        this.segundo_apellido = segundo_apellido;
        this.apellido_casada = apellido_casada;
        this.sexo = sexo;
        this.libro = libro;
        this.folio = folio;
        this.edad = edad;
        this.estado_civil = estado_civil;
        this.lugar_fallecimiento = lugar_fallecimiento;
        this.motivo = motivo;
        this.fecha = fecha;
        this.hora = hora;
        this.nombre_forense = nombre_forense;
        this.jvpm_forense = jvpm_forense;
        this.fecha_registro = fecha_registro;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getSegundo_nombre() {
        return segundo_nombre;
    }

    public void setSegundo_nombre(String segundo_nombre) {
        this.segundo_nombre = segundo_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getSegundo_apellido() {
        return segundo_apellido;
    }

    public void setSegundo_apellido(String segundo_apellido) {
        this.segundo_apellido = segundo_apellido;
    }

    public String getApellido_casada() {
        return apellido_casada;
    }

    public void setApellido_casada(String apellido_casada) {
        this.apellido_casada = apellido_casada;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getLibro() {
        return libro;
    }

    public void setLibro(Integer libro) {
        this.libro = libro;
    }

    public Integer getFolio() {
        return folio;
    }

    public void setFolio(Integer folio) {
        this.folio = folio;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getLugar_fallecimiento() {
        return lugar_fallecimiento;
    }

    public void setLugar_fallecimiento(String lugar_fallecimiento) {
        this.lugar_fallecimiento = lugar_fallecimiento;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getNombre_forense() {
        return nombre_forense;
    }

    public void setNombre_forense(String nombre_forense) {
        this.nombre_forense = nombre_forense;
    }

    public String getJvpm_forense() {
        return jvpm_forense;
    }

    public void setJvpm_forense(String jvpm_forense) {
        this.jvpm_forense = jvpm_forense;
    }

    public Date getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(Date fecha_registro) {
        this.fecha_registro = fecha_registro;
    }
}
