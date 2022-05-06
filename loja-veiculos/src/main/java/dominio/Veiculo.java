package dominio;

import java.math.BigDecimal;
import java.time.LocalDate;
//import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_veiculo")
public class Veiculo {

//	@EmbeddedId	
//	private VeiculoId codigo;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

	@Column(length = 60, nullable = false)
	private String fabricante;

	@Column(length = 60, nullable = false)
	private String modelo;

	@Column(name = "ano_fabricacao", nullable = false)
	private Integer anoFabricacao;

	@Column(name = "ano_modelo", nullable = false)
	private Integer anoModelo;

	@Column(precision = 10, scale = 2, nullable = true)
	private BigDecimal valor;

	@Column(name = "tipo_combustivel", nullable = false)
	@Enumerated(EnumType.STRING)
	private TipoCombustivel tipoCombustivel;

//	@Temporal(TemporalType.DATE)
	@Column(name = "data_cadastro", nullable = false)
	private LocalDate dataCadastro;
//	
//	@Transient
//	private String descricaoCompleta;

	public Veiculo() {

	}

	public Veiculo(Long codigo, String fabricante, String modelo, Integer anoFabricacao, Integer anoModelo,
			BigDecimal valor, TipoCombustivel tipoCombustivel, LocalDate dataCadastro) {
		super();
		this.codigo = codigo;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.valor = valor;
		this.tipoCombustivel = tipoCombustivel;
		this.dataCadastro = dataCadastro;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Integer getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public TipoCombustivel getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

//	public VeiculoId getCodigo() {
//		return codigo;
//	}
//
//	public void setCodigo(VeiculoId codigo) {
//		this.codigo = codigo;
//	}

}
