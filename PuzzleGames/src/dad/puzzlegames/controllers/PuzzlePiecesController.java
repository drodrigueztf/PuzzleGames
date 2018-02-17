package dad.puzzlegames.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class PuzzlePiecesController implements Initializable {
	
	@FXML
    private BorderPane vista;

    @FXML
    private Label tituloPartidaLabel;

    @FXML
    private Label nombreLabel;

    @FXML
    private Label tiempoLabel;

    @FXML
    private Label rondaLabel;

    @FXML
    private ImageView imagen1Tab;

    @FXML
    private ImageView imagen2Tab;

    @FXML
    private ImageView imagen3Tab;

    @FXML
    private ImageView imagen4Tab;

    @FXML
    private ImageView imagen5Tab;

    @FXML
    private ImageView imagen6Tab;

    @FXML
    private ImageView imagen7Tab;

    @FXML
    private ImageView imagen8Tab;

    @FXML
    private ImageView imagen9Tab;

    @FXML
    private ImageView imagen1Ficha;

    @FXML
    private ImageView imagen2Ficha;

    @FXML
    private ImageView imagen3Ficha;

    @FXML
    private ImageView imagen4Ficha;

    @FXML
    private ImageView imagen5Ficha;

    @FXML
    private ImageView imagen6Ficha;

    @FXML
    private ImageView imagen7Ficha;

    @FXML
    private ImageView imagen8Ficha;

    @FXML
    private ImageView imagen9Ficha;

	
	

	public PuzzlePiecesController() throws IOException {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/dad/puzzlegames/views/PuzzlePiecesView.fxml"));
		loader.setController(this);
		loader.load();
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		

	}

	public BorderPane getVista() {
		return vista;
	}

	public void setVista(BorderPane vista) {
		this.vista = vista;
	}



	public ImageView getImagen1Tab() {
		return imagen1Tab;
	}

	public void setImagen1Tab(ImageView imagen1Tab) {
		this.imagen1Tab = imagen1Tab;
	}

	public ImageView getImagen2Tab() {
		return imagen2Tab;
	}

	public void setImagen2Tab(ImageView imagen2Tab) {
		this.imagen2Tab = imagen2Tab;
	}

	public ImageView getImagen3Tab() {
		return imagen3Tab;
	}

	public void setImagen3Tab(ImageView imagen3Tab) {
		this.imagen3Tab = imagen3Tab;
	}

	public ImageView getImagen4Tab() {
		return imagen4Tab;
	}

	public void setImagen4Tab(ImageView imagen4Tab) {
		this.imagen4Tab = imagen4Tab;
	}

	public ImageView getImagen5Tab() {
		return imagen5Tab;
	}

	public void setImagen5Tab(ImageView imagen5Tab) {
		this.imagen5Tab = imagen5Tab;
	}

	public ImageView getImagen6Tab() {
		return imagen6Tab;
	}

	public void setImagen6Tab(ImageView imagen6Tab) {
		this.imagen6Tab = imagen6Tab;
	}

	public ImageView getImagen7Tab() {
		return imagen7Tab;
	}

	public void setImagen7Tab(ImageView imagen7Tab) {
		this.imagen7Tab = imagen7Tab;
	}

	public ImageView getImagen8Tab() {
		return imagen8Tab;
	}

	public void setImagen8Tab(ImageView imagen8Tab) {
		this.imagen8Tab = imagen8Tab;
	}

	public ImageView getImagen9Tab() {
		return imagen9Tab;
	}

	public void setImagen9Tab(ImageView imagen9Tab) {
		this.imagen9Tab = imagen9Tab;
	}

	public ImageView getImagen1Ficha() {
		return imagen1Ficha;
	}

	public void setImagen1Ficha(ImageView imagen1Ficha) {
		this.imagen1Ficha = imagen1Ficha;
	}

	public ImageView getImagen2Ficha() {
		return imagen2Ficha;
	}

	public void setImagen2Ficha(ImageView imagen2Ficha) {
		this.imagen2Ficha = imagen2Ficha;
	}

	public ImageView getImagen3Ficha() {
		return imagen3Ficha;
	}

	public void setImagen3Ficha(ImageView imagen3Ficha) {
		this.imagen3Ficha = imagen3Ficha;
	}

	public ImageView getImagen4Ficha() {
		return imagen4Ficha;
	}

	public void setImagen4Ficha(ImageView imagen4Ficha) {
		this.imagen4Ficha = imagen4Ficha;
	}

	public ImageView getImagen5Ficha() {
		return imagen5Ficha;
	}

	public void setImagen5Ficha(ImageView imagen5Ficha) {
		this.imagen5Ficha = imagen5Ficha;
	}

	public ImageView getImagen6Ficha() {
		return imagen6Ficha;
	}

	public void setImagen6Ficha(ImageView imagen6Ficha) {
		this.imagen6Ficha = imagen6Ficha;
	}

	public ImageView getImagen7Ficha() {
		return imagen7Ficha;
	}

	public void setImagen7Ficha(ImageView imagen7Ficha) {
		this.imagen7Ficha = imagen7Ficha;
	}

	public ImageView getImagen8Ficha() {
		return imagen8Ficha;
	}

	public void setImagen8Ficha(ImageView imagen8Ficha) {
		this.imagen8Ficha = imagen8Ficha;
	}

	public ImageView getImagen9Ficha() {
		return imagen9Ficha;
	}

	public void setImagen9Ficha(ImageView imagen9Ficha) {
		this.imagen9Ficha = imagen9Ficha;
	}

	public Label getTituloPartidaLabel() {
		return tituloPartidaLabel;
	}

	public void setTituloPartidaLabel(Label tituloPartidaLabel) {
		this.tituloPartidaLabel = tituloPartidaLabel;
	}

	public Label getNombreLabel() {
		return nombreLabel;
	}

	public void setNombreLabel(String contenidoLabel) {
		nombreLabel.setText(contenidoLabel);
	}

	public Label getTiempoLabel() {
		return tiempoLabel;
	}

	public void setTiempoLabel(Label tiempoLabel) {
		this.tiempoLabel = tiempoLabel;
	}

	public Label getRondaLabel() {
		return rondaLabel;
	}

	public void setRondaLabel(Label rondaLabel) {
		this.rondaLabel = rondaLabel;
	}
	
	
	


	
	
}