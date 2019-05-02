package br.com.fisioterapia.domain;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="agendamento")
public class Agendamento implements Serializable{
    private static final long serialVersionUID = -7941769011539363185L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    @Column(nullable = false)
    private int id_pacientes;


    @Column(name = "agendamento_data")
    @NotNull(message = "Informe a data do agendamento")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Calendar data;


//
//    @Column(name = "agendamento_data", columnDefinition = "DATE")
//    @NotNull(message = "Informe a data do agendamento.")
//    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
//    private LocalDate data;

    @NotNull
    @Column(nullable = false)
    private int controle;

    @NotBlank
    @Column(nullable = false)
    private String situacao;

    @NotNull
    @Column(nullable = false)
    private int tipopaciente;

    @NotNull
    @Column(name = "plano_saude", nullable = false)
    private int planoSaude;









    //Metodo gettes e settes


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getId_pacientes() {
        return id_pacientes;
    }

    public void setId_pacientes(int id_pacientes) {
        this.id_pacientes = id_pacientes;
    }

//    public LocalDate getData() {
//        return data;
//    }
//
//    public void setData(LocalDate data) {
//        this.data = data;
//    }

        public Calendar getData() {
        return data;
    }

        public void setData(Calendar data) {
        this.data = data;
    }

    public int getTipopaciente() {
        return tipopaciente;
    }

    public void setTipopaciente(int tipopaciente) {
        this.tipopaciente = tipopaciente;
    }

    public int getControle() {
        return controle;
    }

    public void setControle(int controle) {
        this.controle = controle;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public int getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(int planoSaude) {
        this.planoSaude = planoSaude;
    }
}
