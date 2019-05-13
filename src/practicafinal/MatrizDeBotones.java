package practicafinal;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Bladimir
 */
public class MatrizDeBotones implements Serializable{
    // declaracion de variables
    private JButton[][] MatrizBotones;  
    private int Tamx=0;
    private int Tamy=0;
    static final int tablerox=500;
    static final int tableroy=500;
    private String vehiculo;
    int posx,posy;
    public int PAx,PAy;
    // metodo para colocar los botones en el panel
    public void ColocarBotones(int x,int y,JPanel panel,String Tipo){
        posx=x;
        posy=y;
        vehiculo=Tipo;
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
                        Click(btnNuevo);
                    }

                    private void Click(JButton btnNuevo) {
                        String[] posicion = btnNuevo.getToolTipText().split(",");
                        PAx=Integer.parseInt(posicion[0]);
                        PAy=Integer.parseInt(posicion[1]);
                        System.out.println(""+PAx+","+PAy);
                    }
                });
                // pintar boton
                
                //Se agrega al panel 
                panel.add(MatrizBotones[i][j]);                
                //Se redibuja el panel
                RedibujarTablero(panel);
            }
        }  
        
        if(posx==4 && posy==4){
            Pintar1();
        }else if(posx==6 && posy==4){
            Pintar2();
        }else if(posx==8 && posy==9){
            Pintar3();
        }
        enemigos();
        img();
    }
    
    private void RedibujarTablero(JPanel panel){
        //RedibujarTablero();
        panel.validate();
        //Se redibuja el elemento pnlTablero y sus componentes hijos
        panel.repaint();
    }
    
    private void ObtenerTamañoBotones(int cantx,int canty){
        Tamx=tablerox/cantx;
        Tamy=tableroy/canty;
    }
    private void Pintar1(){
        MatrizBotones[1][1].setBackground(Color.GREEN);
        MatrizBotones[0][0].setBackground(Color.GREEN);
        MatrizBotones[3][3].setBackground(Color.BLUE);
        MatrizBotones[1][1].setEnabled(false);
        MatrizBotones[0][0].setEnabled(false);
        MatrizBotones[3][3].setEnabled(false);
    }
    private void Pintar2(){
        MatrizBotones[1][1].setBackground(Color.GREEN);
        MatrizBotones[0][0].setBackground(Color.GREEN);
        MatrizBotones[1][0].setBackground(Color.GREEN);
        MatrizBotones[1][1].setEnabled(false);
        MatrizBotones[0][0].setEnabled(false);
        MatrizBotones[1][0].setEnabled(false);        
        MatrizBotones[1][3].setBackground(Color.GREEN);
        MatrizBotones[0][3].setBackground(Color.GREEN);
        MatrizBotones[4][0].setBackground(Color.GREEN);
        MatrizBotones[1][3].setEnabled(false);
        MatrizBotones[0][3].setEnabled(false);
        MatrizBotones[4][0].setEnabled(false);
        MatrizBotones[0][1].setBackground(Color.BLUE);
        MatrizBotones[3][3].setBackground(Color.BLUE);
        MatrizBotones[0][1].setEnabled(false);
        MatrizBotones[3][3].setEnabled(false);
        MatrizBotones[0][3].setBackground(Color.BLUE);
        MatrizBotones[3][3].setBackground(Color.BLUE);
        MatrizBotones[0][3].setEnabled(false);
        MatrizBotones[3][3].setEnabled(false);        
    }
    private void Pintar3(){
        MatrizBotones[1][1].setBackground(Color.GREEN);
        MatrizBotones[0][0].setBackground(Color.GREEN);
        MatrizBotones[1][0].setBackground(Color.GREEN);
        MatrizBotones[0][1].setBackground(Color.BLUE);
        MatrizBotones[3][3].setBackground(Color.BLUE);
        MatrizBotones[1][1].setEnabled(false);
        MatrizBotones[0][0].setEnabled(false);
        MatrizBotones[1][0].setEnabled(false);
        MatrizBotones[0][1].setEnabled(false);
        MatrizBotones[3][3].setEnabled(false);
        
    }
    // datos para las pocisones de los todo en la matriz
    //variables
    int posxv,posyv,posxe1,posye1,posxe2,posye2,posxe3,posye3;
    private void Posiciones(){
        Random aleatorio=new Random();
        if(posx==4 && posy==4){
            posxv=aleatorio.nextInt(posx-1)+1;
            posyv=aleatorio.nextInt(posy-1)+1;
            posxe1=aleatorio.nextInt(posx-1)+1;
            posye1=aleatorio.nextInt(posy-1)+1;
            posxe2=aleatorio.nextInt(posx-1)+1;
            posye2=aleatorio.nextInt(posy-1)+1;
            posxe3=aleatorio.nextInt(posx-1)+1;
            posye3=aleatorio.nextInt(posy-1)+1;
        }else if(posx==6 && posy==4){
            posxv=aleatorio.nextInt(posx-1)+1;
            posyv=aleatorio.nextInt(posy-1)+1;
            posxe1=aleatorio.nextInt(posx-1)+1;
            posye1=aleatorio.nextInt(posy-1)+1;
            posxe2=aleatorio.nextInt(posx-1)+1;
            posye2=aleatorio.nextInt(posy-1)+1;
            posxe3=aleatorio.nextInt(posx-1)+1;
            posye3=aleatorio.nextInt(posy-1)+1;
        }else if(posx==8 && posy==9){
            posxv=aleatorio.nextInt(posx-1)+1;
            posyv=aleatorio.nextInt(posy-1)+1;
            posxe1=aleatorio.nextInt(posx-1)+1;
            posye1=aleatorio.nextInt(posy-1)+1;
            posxe2=aleatorio.nextInt(posx-1)+1;
            posye2=aleatorio.nextInt(posy-1)+1;
            posxe3=aleatorio.nextInt(posx-1)+1;
            posye3=aleatorio.nextInt(posy-1)+1;
        }
    }
    private void img(){
        Posiciones();
        switch(vehiculo){      
            case "Avion":
                MatrizBotones[posxv][posyv].setIcon(new ImageIcon(getClass().getResource("/Imagenes/A.jpg")));
            break;
            case "Tanque":
                MatrizBotones[posxv][posyv].setIcon(new ImageIcon(getClass().getResource("/Imagenes/T.png")));
            break;
        }
        
    }
    public void Movimiento(String Direccion){
        int dato;
        dato=(int)(Math.random()*(6)+1);
        MatrizBotones[posxv][posyv].setIcon(null);
        if(vehiculo.equals("Avion")){
            switch(Direccion){
                case "a":
                    
                    MatrizBotones[posxv-dato][posyv].setIcon(new ImageIcon(getClass().getResource("/Imagenes/A.jpg")));    
                    posxv=posxv-dato;
                    break;
                case "s":
                    MatrizBotones[posxv][posyv+dato].setIcon(new ImageIcon(getClass().getResource("/Imagenes/A.jpg")));    
                    posyv=posyv+dato;
                    break;
                case "d":
                    MatrizBotones[posxv+dato][posyv].setIcon(new ImageIcon(getClass().getResource("/Imagenes/A.jpg")));    
                    posxv=posxv+dato;
                    break;
                case "w":
                    MatrizBotones[posxv][posyv-dato].setIcon(new ImageIcon(getClass().getResource("/Imagenes/A.jpg")));    
                    posyv=posyv-dato;
                    break;
            }
        }else{
            switch(Direccion){
                case "a":
                    MatrizBotones[posxv-dato][posyv].setIcon(null);
                    MatrizBotones[posxv-dato][posyv].setIcon(new ImageIcon(getClass().getResource("/Imagenes/T.png")));    
                    break;
                case "s":
                    MatrizBotones[posxv][posyv+dato].setIcon(new ImageIcon(getClass().getResource("/Imagenes/T.png")));    
                    MatrizBotones[posxv-dato][posyv].setIcon(null);
                    break;
                case "d":
                    MatrizBotones[posxv+dato][posyv].setIcon(new ImageIcon(getClass().getResource("/Imagenes/T.png")));    
                    MatrizBotones[posxv-dato][posyv].setIcon(null);
                    break;
                case "w":
                    MatrizBotones[posxv][posyv-dato].setIcon(new ImageIcon(getClass().getResource("/Imagenes/T.png")));    
                    MatrizBotones[posxv-dato][posyv].setIcon(null);
                    break;
            
            }
        }
    }    
    private void enemigos(){
        Posiciones();
        MatrizBotones[posxe1][posye1].setIcon(new ImageIcon(getClass().getResource("/Imagenes/M1.jpg")));
        MatrizBotones[posxe2][posye2].setIcon(new ImageIcon(getClass().getResource("/Imagenes/M2.jpg")));
        MatrizBotones[posxe3][posye3].setIcon(new ImageIcon(getClass().getResource("/Imagenes/M3.png")));
    }
    int vida1=200,vida2=200,vida3=200;
    public void Ataque(int Ataque){
        int porcentage,daño;
        porcentage=(int)(Math.random()*(100)+1);
        daño=Ataque*(porcentage/100);
        
        if((posxe1==PAx) && (posye1==PAy)){
            vida1=vida1-daño;
            System.out.println(""+vida1);
            if (vida1<1){
                MatrizBotones[posxe1][posye1].setIcon(null);
            }
        }else{
            if ((posxe2==PAx) && (posye2==PAy)) {
                if (vida2<1){
                MatrizBotones[posxe2][posye2].setIcon(null);
                System.out.println(""+vida2);
                }
            }else{
                if ((posxe3==PAx) && (posye3==PAy)) {
                    if (vida3<1){
                        MatrizBotones[posxe3][posye3].setIcon(null);
                        System.out.println(""+vida3);
                    }
                }
            }
                
        }
        if ((vida1<0)&&(vida2<0)&&(vida3<0)){
            
        }
    }
    
}
