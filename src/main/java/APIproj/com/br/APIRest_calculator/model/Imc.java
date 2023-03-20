package APIproj.com.br.APIRest_calculator.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name="TB_IMC")
public class Imc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_IMC")
    private Integer id;
    @Column(name = "CD_FUNC")
    private Integer codFuncionario;
    @Column(name = "NM_FUNC")
    private String nomeFuncionario;
    @Column(name = "IDADE_FUNC")
    private Integer idade;
    @Column(name = "SEXO_FUNC")
    private String sexo;
    @Column(name = "PESO_FUNC")
    private BigDecimal peso;
    @Column(name = "ALTURA_FUNC")
    private BigDecimal altura;
    @Column(name = "RESULT_IMC")
    private BigDecimal resultadoImc;
    @Column(name = "DESC_RSLTD_IMC")
    private String descricaoResultadoImc;
    @Column(name = "DT_RSLTD_IMC")
    private LocalDateTime dtResultadoImc = LocalDateTime.now();
    @Column(name = "ID_OPERADOR")
    private Integer idOperador;
    @Column(name = "DT_ALTERACAO")
    private Date dtAlteracao;
    @Column(name = "DT_EXCLUSAO")
    private Date dtExclusao;
}
