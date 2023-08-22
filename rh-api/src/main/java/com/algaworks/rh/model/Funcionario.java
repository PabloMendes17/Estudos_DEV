package com.algaworks.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Funcionario {
    
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)    
        private Long id;
        private String nome;
        private String email;
        private BigDecimal salario;
        private LocalDate dataAdmissao;
        private StatusFuncionario status;
        
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
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public BigDecimal getSalario() {
            return salario;
        }
        public void setSalario(BigDecimal salario) {
            this.salario = salario;
        }
        public LocalDate getDataAdmissao() {
            return dataAdmissao;
        }
        public void setDataAdmissao(LocalDate dataAdmissao) {
            this.dataAdmissao = dataAdmissao;
        }
        public StatusFuncionario getStatus() {
            return status;
        }
        public void setStatus(StatusFuncionario status) {
            this.status = status;
        }
        @Override
        public String toString() {
            return "Funcionario [id=" + id + ", nome=" + nome + ", email=" + email + ", salario=" + salario
                    + ", dataAdmissao=" + dataAdmissao + ", status=" + status + "]";
        }
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((id == null) ? 0 : id.hashCode());
            return result;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Funcionario other = (Funcionario) obj;
            if (id == null) {
                if (other.id != null)
                    return false;
            } else if (!id.equals(other.id))
                return false;
            return true;
        }    

        
}
