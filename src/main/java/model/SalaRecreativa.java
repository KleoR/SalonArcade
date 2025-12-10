package model;

public class SalaRecreativa {
    private String[] listaJugadores = new String[50];
    private String[] listaMaquinas;

    public SalaRecreativa(String[] listaJugadores, String[] listMaquinas, int numJugadores, int numMaquinas) {
        this.listaJugadores = listaJugadores;
        this.listaMaquinas = listMaquinas;
//        this.numJugadores = numJugadores;
//        this.numMaquinas = numMaquinas;
    }

    //------------------------------------------ GETTER/SETTER --------------------------------------------

    public String[] getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(String[] listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public String[] getListaMaquinas() {
        return listaMaquinas;
    }

    public void setListaMaquinas(String[] listaMaquinas) {
        this.listaMaquinas = listaMaquinas;
    }


//------------------------------------------ FUNCIONALIDADES --------------------------------------------


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
