package com.example.demo2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    TableView _tableView;
    @FXML
    TableColumn _idColumn;
    @FXML
    TableColumn _textColumn;

    @FXML
    private void handlebuttonaction(ActionEvent ae)
    {
        //Эти две строки были порождены IDE, для демонстрации исправности обработчика.
        //System.out.println("You clicked me!");
        //label.setText("Hello World!");

        //Такой код добавляет запись в ObservableList, но прямая запись работает не хуже
        //FInsertableData.add(new Person("1", "2", "3"));

        //Это полноценная запись в таблицу.
        //Так как существует сборщик мусора, специальный деструктор не нужен.
        _tableView.getItems().add(new Person("1", "2", "3"));
    }
    @FXML
    void onAddBtnClicked (ActionEvent ae)

    {
        _tableView.getItems().add(new Person("1", "2", "3"));
    }
    @FXML
    void onClearAllBtnClicked (ActionEvent ae) {
        _tableView.getItems().clear();
    }
    @FXML
    void onClearSelectedBtnClicked (ActionEvent ae) {

    }
    @FXML
    void onOneBtnSelected (ActionEvent ae) {}
    @FXML
    void onTwoBtnSelected (ActionEvent ae) {}

    //Инициализация модуля.
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Столбцам назначаются зависимости
        _idColumn.setCellValueFactory(
                new PropertyValueFactory<>("firstName")
        );
        _textColumn.setCellValueFactory(
                new PropertyValueFactory<>("lastName")
        );
//        emailCol.setCellValueFactory(
//                new PropertyValueFactory<>("email")
//        );
    }
}