/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.bmicalc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author NITRO5
 */
public class PrimaryController{
    @FXML private TextField beratField;
    @FXML private TextField tinggiField;
    @FXML private Label hasilLabel;

    @FXML
    private void hitung() {
        try {
            int tinggi = Integer.parseInt(tinggiField.getText().trim());
            int berat = Integer.parseInt(beratField.getText().trim());
            
            if (tinggi  <= 0|| berat <= 0) {
                throw new IllegalArgumentException("tinggi atau berat harus lebih dari 0");
            }
            
            tinggi /= 100.0f;
            
            float hasil = berat / (tinggi * tinggi);
            
            hasilLabel.setStyle("-fx-text-fill: #166534;");
            hasilLabel.setText("BMI score: " + hasil);
            
        } catch (NumberFormatException e) {
            tampilkanError("tinggi atau berat harus bilangan bulat dalam rentang 1–2147483647.");
        } catch (IllegalArgumentException e) {
            tampilkanError(e.getMessage());
        }
            
    }
    
    private void tampilkanError(String msg){
        hasilLabel.setStyle("-fx-text-fill: #b91c1c;");
        hasilLabel.setText(msg);
    }
    
}
