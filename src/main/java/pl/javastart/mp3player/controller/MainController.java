package pl.javastart.mp3player.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;

public class MainController {

    @FXML
    private MenuItem fileMenuItem;

    @FXML
    private MenuItem dirMenuItem;

    @FXML
    private MenuItem closeMenuItem;

    @FXML
    private MenuItem aboutMenuItem;

    @FXML
    private TableView<?> contentTable;

    @FXML
    private Button previousButton;

    @FXML
    private ToggleButton playButton;

    @FXML
    private Button nextButton;

    @FXML
    private Slider volumeSlider;

    @FXML
    private Slider progressSlider;

    public void initialize() {
        configureButtons();
        configureVolume();
    }

    private void configureVolume() {
        volumeSlider.addEventFilter(MouseEvent.MOUSE_PRESSED, event ->
        System.out.println("Wciśnięto przycisk na suwaku głośności")
        );
    }

    private void configureButtons() {
        previousButton.setOnAction(actionEvent -> System.out.println("Poprzednia piosenka"));
        nextButton.setOnAction(actionEvent -> System.out.println("Poprzednia piosenka"));
        playButton.setOnAction(actionEvent -> {
            if (playButton.isSelected()) {
                System.out.println("Play");
            } else {
                System.out.println("Stop");
            }
        });
    }
}