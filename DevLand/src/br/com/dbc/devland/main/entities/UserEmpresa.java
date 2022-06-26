package br.com.dbc.devland.main.entities;

import br.com.dbc.devland.main.interfaces.Impressao;
import br.com.dbc.devland.main.interfaces.Manipulacao;

public class UserEmpresa extends User implements Manipulacao<UserEmpresa> {

    private String cnpj;

    public UserEmpresa(Integer id, String nome, String email, String telefone) {
        super(id, nome, email, telefone);
    }

    public UserEmpresa() {

    }

    @Override
    public void adicionar(UserEmpresa objeto) {
        getListaDeUser().add(objeto);
    }

    @Override
    public void editar(Integer indice, UserEmpresa objeto) {
        UserEmpresa empresaProcurada = (UserEmpresa) getListaDeUser().get(indice);
        empresaProcurada.setNome(objeto.getNome());
        empresaProcurada.setTelefone(objeto.getTelefone());
        empresaProcurada.setEmail(objeto.getEmail());
    }

    @Override
    public void remover(Integer indice) {
        getListaDeUser().remove(indice.intValue());
    }

    @Override
    public void listar() {
        for (int i = 0; i < getListaDeUser().size(); i++){
            System.out.println(getListaDeUser().get(i));
        }
    }
    /*@Override
    public void imprimir() {
        System.out.println("Nome: " + getNome() + "\n" +
                "CNPJ: " + cnpj + "\n" +
                "Endere�o: " + getEmail() + "\n" +
                "Telefone: " + getTelefone() + "\n");
    }*/

    @Override
    public String toString() {

        return "Nome: " + getNome() + '\'' + " | " +
                "E-Mail: " + getEmail() + '\'' + " | " +
                "Telefone: " + getTelefone() + '\'' + " | " +
                "CNPJ: " + getCnpj() + '\'' + " | ";
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
