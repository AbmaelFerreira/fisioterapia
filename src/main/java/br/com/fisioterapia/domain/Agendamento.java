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
import java.util.Objects;

@Entity
@Table(name="agendamento")
public class Agendamento implements Serializable{
    private static final long serialVersionUID = -7941769011539363185L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne //Leitura Muitos agendamentos para 1 paciente
    @JoinColumn(name = "paciente")
    private Paciente paciente;


    @Column(name = "agendamento_data")
    @NotNull(message = "Informe a data do agendamento")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Calendar data;

    @NotNull
    @Column(nullable = false)
    private String controle;


    @NotBlank
    @Column(nullable = false)
    private String situacao;

    @NotNull
    @Column(nullable = false)
    private String tipopaciente;

    @NotNull
    @Column(name = "plano_saude", nullable = false)
    private String planosaude;









    //Metodo gettes e settes


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }


    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getPlanosaude() {
        return planosaude;
    }

    public void setPlanosaude(String planosaude) {
        this.planosaude = planosaude;
    }

    public String getTipopaciente() {
        return tipopaciente;
    }

    public void setTipopaciente(String tipopaciente) {
        this.tipopaciente = tipopaciente;
    }

    public String getControle() {
        return controle;
    }

    public void setControle(String controle) {
        this.controle = controle;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Agendamento)) return false;
        Agendamento that = (Agendamento) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Agendamento{" +
                "id=" + id +
                '}';
    }
}
