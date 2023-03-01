package com.example.exampractice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

    public class PhoneController implements Initializable {

        @FXML
        private Button button;

        @FXML
        private ImageView image;

        @FXML
        private Label nameLabel;

        private Phone phones[];

        private int index;

        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
            phones = new Phone[]{
                    new Phone(new Image(Phone.class.getResourceAsStream("images/apple-14-blue-pos1.png")), "Apple Iphone"),
                    new Phone(new Image(Phone.class.getResourceAsStream("images/google-pixel-6a-front-en.png")), "Google Pixel"),
                    new Phone(new Image(Phone.class.getResourceAsStream("images/samsung-galaxy-s23-cream-front.png")), "Samsung Galaxy")
            };

            index = 0;
            showPhone();
        }

        @FXML
        void next(ActionEvent event) {
            if(index == 3)
            {
                index = 0;
            }
            else
            {
                showPhone();
                index++;
            }
        }

        private void showPhone(){
            Phone displayPhone = phones[index];
            image.setImage(displayPhone.getPhoneImage());
            nameLabel.setText(displayPhone.getPhoneName());
        }
    }

