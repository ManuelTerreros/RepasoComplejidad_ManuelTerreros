package co.edu.unbosque.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import co.edu.unbosque.controller.Controller;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 * Clase destinada a la creación de la interfaz gráfica
 * @author Manue
 *
 */
public class View extends JFrame {

	private JPanel contentPane;
	private JTextField nombreArea, nacimientoArea;
	private JTextArea listaNormal, listaAux;
	public static final String AGREGAR = "Agregar";
	public static final String SALIR = "Salir" ; 
	public static final String ORDENAR = "Ordenar por Fecha";
	public static final String LISTAR = "Listar";


	
	/**
	 * Constructor de la clase View
	 * 
	 * @param control Recibe este parámetro para 
	 * poder realizar los actionsComand de los botones y interactuar 
	 * con la lógica principal del negocio.
	 * Al igual que ejecutará los componentes de la vista.
	 */
	public View(Controller control) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Listado");
		setResizable(false);
		setLocationRelativeTo(null);
		setBounds(100, 100, 685, 453);
		crearComponentes(control);
		
	}
	
	
	/**
	 * Metodo que mantendrá los componentes de vista.
	 * 
	 * @param c Recibe un parametro de tipo controller
	 * para asi realizar ciertas funciones.
	 */
	public void crearComponentes(Controller c) {
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton botnAgregar = new JButton("Agregar");
		botnAgregar.setBounds(253, 354, 89, 23);
		contentPane.add(botnAgregar);
		botnAgregar.setActionCommand(AGREGAR);
		
		JButton ordenarLista = new JButton("Ordenar por Fecha");
		ordenarLista.setBounds(402, 239, 135, 23);
		contentPane.add(ordenarLista);
		ordenarLista.setActionCommand(ORDENAR);
		
		JButton salir = new JButton("Salir");
		salir.setBounds(448, 307, 89, 23);
		contentPane.add(salir);
		salir.setActionCommand(SALIR);
		
		JLabel titulo = new JLabel("Lista de Personas");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 30));
		titulo.setBounds(150, 11, 363, 50);
		contentPane.add(titulo);
		
		listaAux = new JTextArea();
		listaAux.setBounds(402, 72, 230, 156);
		contentPane.add(listaAux);

		JScrollPane scrollAux = new JScrollPane(listaAux);
		scrollAux.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollAux.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollAux.setBounds(402, 72, 230, 156);
		contentPane.add(scrollAux);

		listaNormal = new JTextArea();
		listaNormal.setBounds(53, 72, 230, 156);
		contentPane.add(listaNormal);

		JScrollPane scrollLista = new JScrollPane(listaNormal);
		scrollLista.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollLista.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollLista.setBounds(53, 72, 230, 156);
		contentPane.add(scrollLista);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(53, 255, 126, 23);
		contentPane.add(lblNewLabel);
		
		JLabel fecha = new JLabel("Fecha Nacimiento:");
		fecha.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD | Font.ITALIC, 18));
		fecha.setBounds(53, 307, 157, 23);
		contentPane.add(fecha);
		
		nombreArea = new JTextField();
		nombreArea.setBounds(220, 260, 151, 20);
		contentPane.add(nombreArea);
		nombreArea.setColumns(10);
		
		nacimientoArea = new JTextField();
		nacimientoArea.setColumns(10);
		nacimientoArea.setBounds(220, 312, 151, 20);
		contentPane.add(nacimientoArea);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setActionCommand(LISTAR);
		btnListar.setBounds(448, 273, 89, 23);
		contentPane.add(btnListar);
		
		botnAgregar.addActionListener(c);
		salir.addActionListener(c);
		ordenarLista.addActionListener(c);
		btnListar.addActionListener(c);
	}
	
	 /**
     * Solicita un valor de tipo double al usuario mediante un cuadro de diálogo.
     *
     * @param msg Mensaje a mostrar al usuario para solicitar el valor.
     * @return El valor de tipo double ingresado por el usuario.
     */
    public double pedirDouble(String msg) {
        try {
            double x;
            x = Double.parseDouble(JOptionPane.showInputDialog(msg));
            return x;
        } catch (NullPointerException e) {
            System.out.println("Error controlado");
        }
        return 0;
    }
    
    /**
     * Solicita un valor de tipo int al usuario mediante un cuadro de diálogo.
     *
     * @param msg Mensaje a mostrar al usuario para solicitar el valor.
     * @return El valor de tipo int ingresado por el usuario.
     */
    public int pedirInt(String msg) {
        try {
            int x;
            x = Integer.parseInt(JOptionPane.showInputDialog(msg));
            return x;
        } catch (NullPointerException e) {
            System.out.println("Error controlado");
        }
        return 0;
    }
    
    // Método para mostrar resultados en cuadros de diálogo
    
    /**
     * Muestra un mensaje al usuario en un cuadro de diálogo.
     *
     * @param mensaje El mensaje a mostrar al usuario.
     */
    public void mostrarResultados(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Resultados", JOptionPane.INFORMATION_MESSAGE);
    }
    
    // Propiedades con sus respectivos getters y setters
    
    /**
     * Obtiene el área de texto correspondiente al nombre.
     *
     * @return El área de texto correspondiente al nombre.
     */
    public JTextField getNombreArea() {
        return nombreArea;
    }
    
    /**
     * Establece el área de texto correspondiente al nombre.
     *
     * @param nombreArea El área de texto correspondiente al nombre.
     */
    public void setNombreArea(JTextField nombreArea) {
        this.nombreArea = nombreArea;
    }
    
    /**
     * Obtiene el área de texto correspondiente a la fecha de nacimiento.
     *
     * @return El área de texto correspondiente a la fecha de nacimiento.
     */
    public JTextField getNacimientoArea() {
        return nacimientoArea;
    }
    
    /**
     * Establece el área de texto correspondiente a la fecha de nacimiento.
     *
     * @param nacimientoArea El área de texto correspondiente a la fecha de nacimiento.
     */
    public void setNacimientoArea(JTextField nacimientoArea) {
        this.nacimientoArea = nacimientoArea;
    }
    
    /**
     * Obtiene el área de texto correspondiente a la lista normal.
     *
     * @return El área de texto correspondiente a la lista normal.
     */
    public JTextArea getListaNormal() {
        return listaNormal;
    }
    
    /**
     * Establece el área de texto correspondiente a la lista normal.
     *
     * @param listaNormal El área de texto correspondiente a la lista normal.
     */
    public void setListaNormal(JTextArea listaNormal) {
        this.listaNormal = listaNormal;
    }
    
    /**
     * Obtiene el área de texto correspondiente a la lista auxiliar.
     *
     * @return El área de texto correspondiente a la lista auxiliar.
     */
    public JTextArea getListaAux() {
        return listaAux;
    }
    
    /**
     * Establece el área de texto correspondiente a la lista auxiliar.
     *
     * @param listaAux El área de texto correspondiente a la lista auxiliar.
     */
    public void setListaAux(JTextArea listaAux) {
        this.listaAux = listaAux;
    }
}
