package br.com.fiap.jpa.entity;

import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TB_MUSICA")
@SequenceGenerator(name="musica", sequenceName = "SQ_TB_MUSICA", allocationSize = 1)
public class Musica {
	
	//Atributos
	@Id
	@Column(name="cd_musica")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "musica")
	private Integer codigo;
	
	@Column(name="nm_musica", nullable=false, length = 50)
	private String nome;
	
	@Enumerated(EnumType.STRING)
	@Column(name="ds_genero", length = 20)
	private Genero genero;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_lancamento")
	private Calendar dataLancamento;
	
	@Column(name="ds_duracao", length = 4)
	private String duracao;
	
	@Column(name="nm_artista", nullable=false, length = 50)
	private String nomeArtista;

	@Column(name="ds_tamanho")
	private Integer tamanho;
	
	//Construtores
	private Musica() {}
	
	public Musica(Integer codigo, String nome, Genero genero, Calendar dataLancamento, String duracao,
			String nomeArtista, Integer tamanho) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.genero = genero;
		this.dataLancamento = dataLancamento;
		this.duracao = duracao;
		this.nomeArtista = nomeArtista;
		this.tamanho = tamanho;
	}
	
	//Getters e Setters
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Calendar getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Calendar dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getNomeArtista() {
		return nomeArtista;
	}

	public void setNomeArtista(String nomeArtista) {
		this.nomeArtista = nomeArtista;
	}

	public Integer getTamanho() {
		return tamanho;
	}

	public void setTamanho(Integer tamanho) {
		this.tamanho = tamanho;
	}
	
}
