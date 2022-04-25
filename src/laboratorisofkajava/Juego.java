package laboratorisofkajava;

import javax.swing.JOptionPane;

public class Juego {
    //Creamos los arreglos para las preguntas

    private Pregunta arrUno[];
    private Pregunta arrDos[];
    private Pregunta arrTres[];
    private Pregunta arrCuatro[];
    private Pregunta arrCinco[];

    //Variables
    int score = 0;
    //Metodo Juego inicializar los arreglos

    public void Juego() {
        arrUno = new Pregunta[5];
        arrDos = new Pregunta[5];
        arrTres = new Pregunta[5];
        arrCuatro = new Pregunta[5];
        arrCinco = new Pregunta[5];
    }

    //Metodo para llenar el arreglo de forma automatica
    public Pregunta[] llenarArreglo() {

        arrUno[0] = new Pregunta("¿Cuál es el nombre del río más largo del mundo?", "Río Nilo", "Río Amazonas", "Río Danubio", "Río Uruguay", "optionB");
        arrUno[1] = new Pregunta("¿Cuál es el océano más grande del mundo?", "Océano Antártico", "Océano Atlántico", "Océano Índico", "Océano Pacífico", "optionD");
        arrUno[2] = new Pregunta("¿Cuál es el océano más grande del mundo?", "Océano Antártico", "Océano Atlántico", "Océano Índico", "Océano Pacífico", "optionD");
        arrUno[3] = new Pregunta("¿Cuál es el océano más grande del mundo?", "Océano Antártico", "Océano Atlántico", "Océano Índico", "Océano Pacífico", "optionD");
        arrUno[4] = new Pregunta("¿Cuál es el océano más grande del mundo?", "Océano Antártico", "Océano Atlántico", "Océano Índico", "Océano Pacífico", "optionD");

        return arrUno;
    }

    //Metodo para ConfirarPregunta
    public void configurarPregunta() {
        Pregunta pre = new Pregunta();
        int i = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion que desea modificar"));

        arrUno[i] = new Pregunta(
                
                JOptionPane.showInputDialog("Ingrese el codigo del proyecto:"),
                JOptionPane.showInputDialog("Ingrese el codigo del proyecto:"),
                JOptionPane.showInputDialog("Ingrese el codigo del proyecto:"),
                JOptionPane.showInputDialog("Ingrese el codigo del proyecto:"),
                JOptionPane.showInputDialog("Ingrese el codigo del proyecto:"),
                JOptionPane.showInputDialog("Ingrese el codigo del proyecto:")
        );

//        for (int i = 0; i < arrUno.length; i++) {
//
//        }
    }

    //Metodo para comenzar el juego
    public void iniciarJuego() {
        
        /*
        do{
        Mostrarpregunta
        OpA
        OpB
        OpC
        OPD
        
        PedirRespuesta
        GuardaRespuesta
        
        ValidarRespuesta
        ifResTrue(++score)
        }while(RespuestaValida)
         */
        int i=0;
        
        do {
            System.out.println("");
        } while (true);
    }

    public void iniciarJuegoVentana() {

        for (int i = 0; i < arrUno.length; i++) {
            //Arreglo de opciones de respuesa
            String[] arreglo = {arrUno[i].getOpcionA(), arrUno[i].getOpcionB(), arrUno[i].getOpcionC(), arrUno[i].getOpcionD()};
            JOptionPane.showInputDialog(null, arrUno[i].getQuestion(),
                    "Mi titulo personalizado", JOptionPane.OK_CANCEL_OPTION,
                    null, arreglo, "Escribe...");
        }
    }
    public void ingresarArreglo(int n, int m) {

        if (n == 1) {
            int aux = 1;
            for (int i = 0; i < 5; i++) {
                try {
                    Connection conec = Conexiones.connect();
                    PreparedStatement pst = conec.prepareCall(
                            "select * from preguntas where id_pregunta ='" + aux + "'");
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        id = rs.getInt("id_pregunta");

                        pregunta = rs.getString("pregunta");
                        respuesta = rs.getString("op_verdadera");
                        falsaUno = rs.getString("op_falsa_uno");
                        falsados = rs.getString("op_falsa_dos");
                        falsaTres = rs.getString("op_falsa_tres");
                        categoria = rs.getString("categoria");
                        ronda = rs.getString("ronda");

                    }
                    conec.close();
                } catch (SQLException e) {
                    System.err.println("Error en cargar usuario. " + e);
                    JOptionPane.showMessageDialog(null, "Error al cargar contacte al Administrador. ");
                }

                RondaUno[i] = new PreguntaDate(id, pregunta, respuesta, falsaUno, falsados, falsaTres, categoria, ronda);
                aux++;
            }

        } else if (n == 2) {
            int aux = 6;
            for (int i = 0; i < 5; i++) {
                try {
                    Connection conec = Conexiones.connect();
                    PreparedStatement pst = conec.prepareCall(
                            "select * from preguntas where id_pregunta ='" + aux + "'");
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        id = rs.getInt("id_pregunta");
                        pregunta = rs.getString("pregunta");
                        respuesta = rs.getString("op_verdadera");
                        falsaUno = rs.getString("op_falsa_uno");
                        falsados = rs.getString("op_falsa_dos");
                        falsaTres = rs.getString("op_falsa_tres");
                        categoria = rs.getString("categoria");
                        ronda = rs.getString("ronda");
                    }
                    conec.close();
                } catch (SQLException e) {
                    System.err.println("Error en cargar usuario. " + e);
                    JOptionPane.showMessageDialog(null, "Error al cargar contacte al Administrador. ");
                }

                RondaDos[i] = new PreguntaDate(id, pregunta, ronda, falsaUno, falsaUno, falsaTres, categoria, ronda);
                aux++;
            }
        } else if (n == 3) {
            int aux = 11;
            for (int i = 0; i < 5; i++) {
                try {
                    Connection conec = Conexiones.connect();
                    PreparedStatement pst = conec.prepareCall(
                            "select * from preguntas where id_pregunta ='" + aux + "'");
                    ResultSet rs = pst.executeQuery();

                    if (rs.next()) {
                        id = rs.getInt("id_pregunta");
                        pregunta = rs.getString("pregunta");
                        respuesta = rs.getString("op_verdadera");
                        falsaUno = rs.getString("op_falsa_uno");
                        falsados = rs.getString("op_falsa_dos");
                        falsaTres = rs.getString("op_falsa_tres");
                        categoria = rs.getString("categoria");
                        ronda = rs.getString("ronda");
                    }
                    conec.close();
                } catch (SQLException e) {
                    System.err.println("Error en cargar usuario. " + e);
                    JOptionPane.showMessageDialog(null, "Error al cargar contacte al Administrador. ");
                }

                RondaTres[i] = new PreguntaDate(id, pregunta, ronda, falsaUno, falsaUno, falsaTres, categoria, ronda);
                aux++;
            }
        }
        //Variable de prueba 

    }

    public void obtenerPreguntas() {
        int aux = 1;
        boolean bandera = false;

        
            try {
                Connection conec = Conexiones.connect();
                PreparedStatement pst = conec.prepareCall(
                        "select * from preguntas where id_pregunta ='" + aux + "'");
                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    id = rs.getInt("id_pregunta");
                    pregunta = rs.getString("pregunta");
                    respuesta = rs.getString("op_verdadera");
                    falsaUno = rs.getString("op_falsa_uno");
                    falsados = rs.getString("op_falsa_dos");
                    falsaTres = rs.getString("op_falsa_tres");
                    categoria = rs.getString("categoria");
                    ronda = rs.getString("ronda");
                    

                } 
                while (rs.next()) {  
                    PreguntaDate nuevo = new PreguntaDate(id, pregunta, respuesta, falsaUno, falsados, falsaTres, categoria, ronda);
                    totalPreguntas.add(nuevo);
                    JOptionPane.showMessageDialog(null, nuevo.getPregunta());
                } 
                
                conec.close();
            } catch (SQLException e) {
                System.err.println("Error en cargar usuario. " + e);
                JOptionPane.showMessageDialog(null, "Error al cargar contacte al Administrador. ");
            }
           
            aux++;

    }

    public void mostra() {
//
//        for (int i = 0; i < RondaUno.length; i++) {
//            PreguntaDate preguntaDate = RondaUno[i];
//            text += (1 + i) + "Id pregunta" + preguntaDate.getCont() + "  -  pregunta " + preguntaDate.getPregunta() + "  ***" + preguntaDate.getOpVer();
//        }
//
//        System.out.println(" " + text);

        for (int i = 1; i < totalPreguntas.size(); i++) {
JOptionPane.showMessageDialog(null, "Titulo" );
        }
    }
}
