/* This file was generated by SableCC (http://www.sablecc.org/). */

package analysis;

import java.util.*;
import node.*;

public class AnalysisAdapter implements Analysis
{
    private Hashtable<Node,Object> in;
    private Hashtable<Node,Object> out;

    public Object getIn(Node node)
    {
        if(this.in == null)
        {
            return null;
        }

        return this.in.get(node);
    }

    public void setIn(Node node, Object o)
    {
        if(this.in == null)
        {
            this.in = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.in.put(node, o);
        }
        else
        {
            this.in.remove(node);
        }
    }

    public Object getOut(Node node)
    {
        if(this.out == null)
        {
            return null;
        }

        return this.out.get(node);
    }

    public void setOut(Node node, Object o)
    {
        if(this.out == null)
        {
            this.out = new Hashtable<Node,Object>(1);
        }

        if(o != null)
        {
            this.out.put(node, o);
        }
        else
        {
            this.out.remove(node);
        }
    }

    public void caseStart(Start node)
    {
        defaultCase(node);
    }

    public void caseAProgram(AProgram node)
    {
        defaultCase(node);
    }

    public void caseAUnicaVarDeclaracao(AUnicaVarDeclaracao node)
    {
        defaultCase(node);
    }

    public void caseAMultiplaVarDeclaracao(AMultiplaVarDeclaracao node)
    {
        defaultCase(node);
    }

    public void caseAConstantesDeclaracao(AConstantesDeclaracao node)
    {
        defaultCase(node);
    }

    public void caseATipoRealTipo(ATipoRealTipo node)
    {
        defaultCase(node);
    }

    public void caseATipoInteiroTipo(ATipoInteiroTipo node)
    {
        defaultCase(node);
    }

    public void caseATipoCaractereTipo(ATipoCaractereTipo node)
    {
        defaultCase(node);
    }

    public void caseAIdentificadorVar(AIdentificadorVar node)
    {
        defaultCase(node);
    }

    public void caseAVetorVar(AVetorVar node)
    {
        defaultCase(node);
    }

    public void caseARealValor(ARealValor node)
    {
        defaultCase(node);
    }

    public void caseAInteiroValor(AInteiroValor node)
    {
        defaultCase(node);
    }

    public void caseAStringValor(AStringValor node)
    {
        defaultCase(node);
    }

    public void caseAVariableComando(AVariableComando node)
    {
        defaultCase(node);
    }

    public void caseAUnicaLeituraComando(AUnicaLeituraComando node)
    {
        defaultCase(node);
    }

    public void caseAUnicaEscritaComando(AUnicaEscritaComando node)
    {
        defaultCase(node);
    }

    public void caseAMultiplaLeituraComando(AMultiplaLeituraComando node)
    {
        defaultCase(node);
    }

    public void caseAMultiplaEscritaComando(AMultiplaEscritaComando node)
    {
        defaultCase(node);
    }

    public void caseAEnquantoComandosComando(AEnquantoComandosComando node)
    {
        defaultCase(node);
    }

    public void caseAEnquantoComandoComando(AEnquantoComandoComando node)
    {
        defaultCase(node);
    }

    public void caseARepitaComandosComando(ARepitaComandosComando node)
    {
        defaultCase(node);
    }

    public void caseARepitaComandoComando(ARepitaComandoComando node)
    {
        defaultCase(node);
    }

    public void caseAParaAteComandosComando(AParaAteComandosComando node)
    {
        defaultCase(node);
    }

    public void caseAParaAteComandoComando(AParaAteComandoComando node)
    {
        defaultCase(node);
    }

    public void caseAParaPassoComandosComando(AParaPassoComandosComando node)
    {
        defaultCase(node);
    }

    public void caseAParaPassoComandoComando(AParaPassoComandoComando node)
    {
        defaultCase(node);
    }

    public void caseAValorExp(AValorExp node)
    {
        defaultCase(node);
    }

    public void caseAVarExp(AVarExp node)
    {
        defaultCase(node);
    }

    public void caseAExpParExp(AExpParExp node)
    {
        defaultCase(node);
    }

    public void caseAMenosExpExp(AMenosExpExp node)
    {
        defaultCase(node);
    }

    public void caseAAdicaoExpExp(AAdicaoExpExp node)
    {
        defaultCase(node);
    }

    public void caseASubtracaoExpExp(ASubtracaoExpExp node)
    {
        defaultCase(node);
    }

    public void caseAMultiplicacaoExpExp(AMultiplicacaoExpExp node)
    {
        defaultCase(node);
    }

    public void caseADivisaoExpExp(ADivisaoExpExp node)
    {
        defaultCase(node);
    }

    public void caseAExp(AExp node)
    {
        defaultCase(node);
    }

    public void caseAIgualExpLogica(AIgualExpLogica node)
    {
        defaultCase(node);
    }

    public void caseADiferenteExpLogica(ADiferenteExpLogica node)
    {
        defaultCase(node);
    }

    public void caseAMenorIgualExpLogica(AMenorIgualExpLogica node)
    {
        defaultCase(node);
    }

    public void caseAMaiorIgualExpLogica(AMaiorIgualExpLogica node)
    {
        defaultCase(node);
    }

    public void caseAMenorExpLogica(AMenorExpLogica node)
    {
        defaultCase(node);
    }

    public void caseAMaiorExpLogica(AMaiorExpLogica node)
    {
        defaultCase(node);
    }

    public void caseANaoExpLogica(ANaoExpLogica node)
    {
        defaultCase(node);
    }

    public void caseAEExpLogica(AEExpLogica node)
    {
        defaultCase(node);
    }

    public void caseAOuExpLogica(AOuExpLogica node)
    {
        defaultCase(node);
    }

    public void caseAXouExpLogica(AXouExpLogica node)
    {
        defaultCase(node);
    }

    public void caseTNumInteiro(TNumInteiro node)
    {
        defaultCase(node);
    }

    public void caseTNumReal(TNumReal node)
    {
        defaultCase(node);
    }

    public void caseTString(TString node)
    {
        defaultCase(node);
    }

    public void caseTConstante(TConstante node)
    {
        defaultCase(node);
    }

    public void caseTAspasSimples(TAspasSimples node)
    {
        defaultCase(node);
    }

    public void caseTVirgula(TVirgula node)
    {
        defaultCase(node);
    }

    public void caseTPonto(TPonto node)
    {
        defaultCase(node);
    }

    public void caseTDoisPontos(TDoisPontos node)
    {
        defaultCase(node);
    }

    public void caseTPontoVirgula(TPontoVirgula node)
    {
        defaultCase(node);
    }

    public void caseTLPar(TLPar node)
    {
        defaultCase(node);
    }

    public void caseTRPar(TRPar node)
    {
        defaultCase(node);
    }

    public void caseTLColc(TLColc node)
    {
        defaultCase(node);
    }

    public void caseTRColc(TRColc node)
    {
        defaultCase(node);
    }

    public void caseTMult(TMult node)
    {
        defaultCase(node);
    }

    public void caseTDiv(TDiv node)
    {
        defaultCase(node);
    }

    public void caseTMais(TMais node)
    {
        defaultCase(node);
    }

    public void caseTMenos(TMenos node)
    {
        defaultCase(node);
    }

    public void caseTAtribuicao(TAtribuicao node)
    {
        defaultCase(node);
    }

    public void caseTIgual(TIgual node)
    {
        defaultCase(node);
    }

    public void caseTIgualLog(TIgualLog node)
    {
        defaultCase(node);
    }

    public void caseTDiferente(TDiferente node)
    {
        defaultCase(node);
    }

    public void caseTMenor(TMenor node)
    {
        defaultCase(node);
    }

    public void caseTMenorIgual(TMenorIgual node)
    {
        defaultCase(node);
    }

    public void caseTMaior(TMaior node)
    {
        defaultCase(node);
    }

    public void caseTMaiorIgual(TMaiorIgual node)
    {
        defaultCase(node);
    }

    public void caseTE(TE node)
    {
        defaultCase(node);
    }

    public void caseTOu(TOu node)
    {
        defaultCase(node);
    }

    public void caseTXou(TXou node)
    {
        defaultCase(node);
    }

    public void caseTNao(TNao node)
    {
        defaultCase(node);
    }

    public void caseTPrograma(TPrograma node)
    {
        defaultCase(node);
    }

    public void caseTVariavel(TVariavel node)
    {
        defaultCase(node);
    }

    public void caseTInicio(TInicio node)
    {
        defaultCase(node);
    }

    public void caseTFim(TFim node)
    {
        defaultCase(node);
    }

    public void caseTFimPara(TFimPara node)
    {
        defaultCase(node);
    }

    public void caseTFimEnquanto(TFimEnquanto node)
    {
        defaultCase(node);
    }

    public void caseTFimSe(TFimSe node)
    {
        defaultCase(node);
    }

    public void caseTSe(TSe node)
    {
        defaultCase(node);
    }

    public void caseTEnquanto(TEnquanto node)
    {
        defaultCase(node);
    }

    public void caseTPara(TPara node)
    {
        defaultCase(node);
    }

    public void caseTDe(TDe node)
    {
        defaultCase(node);
    }

    public void caseTEntao(TEntao node)
    {
        defaultCase(node);
    }

    public void caseTFaca(TFaca node)
    {
        defaultCase(node);
    }

    public void caseTSenao(TSenao node)
    {
        defaultCase(node);
    }

    public void caseTRepita(TRepita node)
    {
        defaultCase(node);
    }

    public void caseTAte(TAte node)
    {
        defaultCase(node);
    }

    public void caseTPasso(TPasso node)
    {
        defaultCase(node);
    }

    public void caseTEscreva(TEscreva node)
    {
        defaultCase(node);
    }

    public void caseTLeia(TLeia node)
    {
        defaultCase(node);
    }

    public void caseTAvalie(TAvalie node)
    {
        defaultCase(node);
    }

    public void caseTCaso(TCaso node)
    {
        defaultCase(node);
    }

    public void caseTCaractere(TCaractere node)
    {
        defaultCase(node);
    }

    public void caseTInteiro(TInteiro node)
    {
        defaultCase(node);
    }

    public void caseTReal(TReal node)
    {
        defaultCase(node);
    }

    public void caseTBranco(TBranco node)
    {
        defaultCase(node);
    }

    public void caseTId(TId node)
    {
        defaultCase(node);
    }

    public void caseTComentario(TComentario node)
    {
        defaultCase(node);
    }

    public void caseEOF(EOF node)
    {
        defaultCase(node);
    }

    public void defaultCase(@SuppressWarnings("unused") Node node)
    {
        // do nothing
    }
}
