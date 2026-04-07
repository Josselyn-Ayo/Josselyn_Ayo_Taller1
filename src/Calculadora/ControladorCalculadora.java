package Calculadora;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControladorCalculadora {
    @FXML private TextField txtN1;
    @FXML private TextField txtN2;
    @FXML private Label lblSalida;
    private ModeloCalculadora modelo = new ModeloCalculadora();
    private Double getNumero(TextField txtN1){
    try{
        return Double.parseDouble(txtN1.getText());
    } catch (Exception e){
        lblSalida.setText("Error: Ingrese solo números");
        return null;
    }
    }
    @FXML private void sumar(){
        Double N1 = getNumero(txtN1);
        Double N2 = getNumero(txtN2);
        if(N1 == null || N2 == null) return;
        double resultado = modelo.sumar(N1, N2);
        lblSalida.setText(String.valueOf(resultado));
    }
    @FXML private void restar(){
        Double N1 = getNumero(txtN1);
        Double N2 = getNumero(txtN2);
        if(N1 == null || N2 == null) return;
        double resultado = modelo.restar(N1, N2);
        lblSalida.setText(String.valueOf(resultado));
    }
    @FXML private void multiplicar(){
        Double N1 = getNumero(txtN1);
        Double N2 = getNumero(txtN2);
        if(N1 == null || N2 == null) return;
        double resultado = modelo.multiplicar(N1, N2);
        lblSalida.setText(String.valueOf(resultado));
    }
    @FXML private void dividir(){
        Double N1 = getNumero(txtN1);
        Double N2 = getNumero(txtN2);
        if(N1 == null || N2 == null) return;
        if (N2 == 0){
            lblSalida.setText("Error: No se puede dividir entre 0");
        }else{
            double resultado = modelo.dividir(N1, N2);
            lblSalida.setText(String.valueOf(resultado));
        }
    }
}
