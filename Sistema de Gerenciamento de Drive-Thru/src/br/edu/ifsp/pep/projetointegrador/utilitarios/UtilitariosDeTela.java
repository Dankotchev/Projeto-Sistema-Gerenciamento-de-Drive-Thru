package br.edu.ifsp.pep.projetointegrador.utilitarios;

public interface UtilitariosDeTela<T> {
    
    public void setEstadoBotoes(boolean estado);

    public void setEstadoCamposTexto(boolean estado);
    
    public void setVisibilidadeCamposTextos(boolean estado);

    public void limparCampos();

    public void setCampos(T entity);
}
