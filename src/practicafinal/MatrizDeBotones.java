package practicafinal;

import InterfacesGraficas.Inicio;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Bladimir
 */
public class MatrizDeBotones {
    // declaracion de variables
    private JButton[][] MatrizBotones;  
    private int Tamx=0;
    private int Tamy=0;
    static final int tablerox=500;
    static final int tableroy=500;
    // metodo para colocar los botones en el panel
    public void ColocarBotones(int x,int y,JPanel panel){
        int posx,posy;
        posx=x;
        posy=y;
        MatrizBotones=new JButton[x][y];
        // se obtiene el tamaño del panel del tablero
        panel.setLayout(new GridLayout(x,y));
        //se obtiene el tamaño de los botones acorde a su cantidad
        ObtenerTamañoBotones(x, y);
        //Se recorre la dimension X desde 0 hasta DimensionX
        for (int i = 0; i < x; i++){
            //Se recorre la dimension Y desde 0 hasta DimensionY
            for (int j = 0; j < y; j++){
                //Se crea un nuevo objeto de tipo JButton
                JButton btnNuevo = new JButton();
                //Se le asignan sus dimensiones (ancho, alto)
                btnNuevo.setSize(Tamx, Tamy);
                //Se asigna un texto con la posición del botón en la matriz al botón, al tooltip del botón
                btnNuevo.setToolTipText(Integer.toString(x) + "," + Integer.toString(y));
                //Se agrega a la matriz el botón recien creado
                MatrizBotones[i][j] = btnNuevo;
                //Se agrega un nuevo evento que maneje la acción clic sobre el botón creado
                MatrizBotones[i][j].addActionListener(new ActionListener(){ 
                    public void actionPerformed(ActionEvent e) { 
                    //   Click(btnNuevo); escapar de la vida es 
                    }});
                // pintar boton
                
                //Se agrega al panel 
                panel.add(MatrizBotones[i][j]);
                
                //Se redibuja el panel
                //RedibujarTablero();
                panel.validate();
                //Se redibuja el elemento pnlTablero y sus componentes hijos
                panel.repaint();              
            }
        }  
        
        if(posx==4 && posy==4){
            Pintar1();
        }else if(posx==6 && posy==4){
            Pintar2();
        }else if(posx==8 && posy==9){
            Pintar3();
        }
        
    }
    private void ObtenerTamañoBotones(int cantx,int canty){
        Tamx=tablerox/cantx;
        Tamy=tableroy/canty;
    }
    private void Pintar1(){
        MatrizBotones[1][1].setBackground(Color.GREEN);
        MatrizBotones[0][0].setBackground(Color.GREEN);
//        MatrizBotones[1][0].setBackground(Color.GREEN);
//        MatrizBotones[0][1].setBackground(Color.BLUE);
        MatrizBotones[3][3].setBackground(Color.BLUE);
        MatrizBotones[1][1].setEnabled(false);
        MatrizBotones[0][0].setEnabled(false);
//        MatrizBotones[1][0].setEnabled(false);
//        MatrizBotones[0][1].setEnabled(false);
        MatrizBotones[3][3].setEnabled(false);
    }
    private void Pintar2(){
        
    }
    private void Pintar3(){
        
    }
            
}
