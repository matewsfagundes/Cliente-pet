package br.com.petz.cliente.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {
	private UUID idCliente;
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	private String celular;
	private String teefone;
	private sexo sexo;
	@NotNull
	private LocalDate dataNascimento;
	@CPF
	private String cpf;
	@NotNull
	private boolean aceitaTermos;

	private LocalDateTime dataEHoraDoCadastro;
	private LocalDateTime dataHoraUltimaAlteracao;

	public Cliente(@NotBlank String nomeCompleto, @NotBlank @Email String email, @NotBlank String celular,
			String teefone, br.com.petz.cliente.domain.sexo sexo, @NotNull LocalDate dataNascimento, @CPF String cpf,
			@NotNull boolean aceitaTermos) {
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.celular = celular;
		this.teefone = teefone;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.aceitaTermos = aceitaTermos;
		this.dataEHoraDoCadastro = LocalDateTime.now();
		this.dataHoraUltimaAlteracao = LocalDateTime.now();
	}
}