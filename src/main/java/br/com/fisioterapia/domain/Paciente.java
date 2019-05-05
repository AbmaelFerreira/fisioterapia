package br.com.fisioterapia.domain;

//import jdk.internal.org.objectweb.asm.tree.MethodInsnNode;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Calendar;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "paciente")
public class Paciente  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 2, max = 40)
    @Column(nullable = false, length = 40)
    private String nome;

    @NotBlank
    @Size(min = 2, max = 60)
    @Column(name = "plano_saude", nullable = false, length = 60)
    private String planosaude;

    @Column(name = "dt_nascimento")
    @NotNull(message = "Informe a data de Nascimento")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Calendar dtNascimento;


    @Size(min = 2, max = 60)
    @Column(nullable = false, length = 60)
    private String telefone;


    @Size(min = 2, max = 60)
    @Column(length = 60)
    private String profissao;

    @NotBlank
    @Size(min = 2, max = 60)
    @Column(nullable = false, length = 60)
    private String diagnostico;

    @OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL)
    private List<Agendamento> agendamentos;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlanosaude() {
        return planosaude;
    }

    public void setPlanosaude(String planosaude) {
        this.planosaude = planosaude;
    }

    public Calendar getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Calendar dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public List<Agendamento> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(List<Agendamento> agendamentos) {
        this.agendamentos = agendamentos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paciente)) return false;
        Paciente paciente = (Paciente) o;
        return Objects.equals(getId(), paciente.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                '}';
    }
}
