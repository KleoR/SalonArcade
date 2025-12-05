package model;

public class SalaRecreativa {
    private String[] listJugadores;
    private String[] listMaquinas;

    //------------------------------------------ GETTER/SETTER --------------------------------------------

    public SalaRecreativa(String[] listJugadores, String[] listMaquinas) {
        this.listJugadores = listJugadores;
        this.listMaquinas = listMaquinas;
    }

    public String[] getListJugadores() {
        return listJugadores;
    }

    public void setListJugadores(String[] listJugadores) {
        this.listJugadores = listJugadores;
    }

    public String[] getListMaquinas() {
        return listMaquinas;
    }

    public void setListMaquinas(String[] listMaquinas) {
        this.listMaquinas = listMaquinas;
    }

    //------------------------------------------ FUNCIONALIDADES --------------------------------------------

    /**
     * Registrar nuevos jugadores
     */
    public void RegistJugador(){ //ToDo

    }

    /**
     * Registrar nuevas máquinas
     */
    public void RegistMaquina(){ //ToDo

    }

    /**
     * Buscar un jugador por ID
     */
    public void BuscarJugador(){

    }

    /**
     * Buscar una máquina por nombre
     */
    public void BuscarMaquina(){

    }


}
