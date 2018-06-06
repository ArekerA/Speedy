/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Marlena
 */
package magazyn;

import javafx.geometry.Insets;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public abstract class Menu {

    static void menu(BorderPane root, Stage primaryStage) {

        ///////// IMAGE VIEW
        ImageView logo = new ImageView("file:SpeedyMagazyn.png");
        logo.setLayoutX(0);
        logo.setLayoutY(10);
        logo.setFitHeight(100);
        logo.setFitWidth(200);

        ImageView ramka1 = new ImageView("file:ramka.png");
        ramka1.setLayoutX(20);
        ramka1.setLayoutY(305);
        ramka1.setFitHeight(35);
        ramka1.setFitWidth(125);
        ramka1.setVisible(false);

        ImageView ramka2 = new ImageView("file:ramka.png");
        ramka2.setLayoutX(20);
        ramka2.setLayoutY(355);
        ramka2.setFitHeight(35);
        ramka2.setFitWidth(125);
        ramka2.setVisible(false);

        ImageView ramka3 = new ImageView("file:ramka.png");
        ramka3.setLayoutX(20);
        ramka3.setLayoutY(405);
        ramka3.setFitHeight(35);
        ramka3.setFitWidth(125);
        ramka3.setVisible(false);

        ImageView ramka4 = new ImageView("file:ramka.png");
        ramka4.setLayoutX(20);
        ramka4.setLayoutY(480);
        ramka4.setFitHeight(35);
        ramka4.setFitWidth(125);
        ramka4.setVisible(false);
        ///////// TEXT
        Text Lista = new Text("Lista Zamówień");
        Lista.setStyle("-fx-font-size: 40pt;");
        Lista.setFill(Color.WHITE);
        Lista.setLayoutY(70);
        Lista.setLayoutX(525);

        Text Towary = new Text("Lista Towarów");
        Towary.setStyle("-fx-font-size: 40pt;");
        Towary.setFill(Color.WHITE);
        Towary.setLayoutY(70);
        Towary.setLayoutX(525);
        Towary.setVisible(false);

        Text Info = new Text("Informacje");
        Info.setStyle("-fx-font-size: 40pt;");
        Info.setFill(Color.WHITE);
        Info.setLayoutY(70);
        Info.setLayoutX(525);
        Info.setVisible(false);
        //----------------------------

        Text Listam = new Text("Lista Zamówień");
        Listam.setStyle("-fx-font-size: 12pt;");
        Listam.setFill(Color.WHITE);
        Listam.setLayoutY(325);
        Listam.setLayoutX(30);
        Listam.setPickOnBounds(true);

        Text Towarym = new Text("Lista Towarów");
        Towarym.setStyle("-fx-font-size: 12pt;");
        Towarym.setFill(Color.WHITE);
        Towarym.setLayoutY(375);
        Towarym.setLayoutX(30);
        Towarym.setPickOnBounds(true);

        Text Infom = new Text("Informacje");
        Infom.setStyle("-fx-font-size: 12pt;");
        Infom.setFill(Color.WHITE);
        Infom.setLayoutY(425);
        Infom.setLayoutX(30);
        Infom.setPickOnBounds(true);

        Text Wylogujm = new Text("Wyloguj");
        Wylogujm.setStyle("-fx-font-size: 12pt;");
        Wylogujm.setFill(Color.WHITE);
        Wylogujm.setLayoutY(500);
        Wylogujm.setLayoutX(30);
        Wylogujm.setPickOnBounds(true);

        Text cb = new Text("Aplication Speedy create by: AL && BŻ");
        cb.setStyle("-fx-font-size: 10pt;");
        cb.setFill(Color.WHITE);
        cb.setLayoutY(600);
        cb.setLayoutX(1000);
        ///////// TABLE

        TableView tabela1 = new TableView();
        tabela1.setEditable(true);

        TableColumn tab1 = new TableColumn("Lista Zamówień");
        tab1.setPrefWidth(900);
        TableColumn ID = new TableColumn("Zamówienie ID");
        ID.setPrefWidth(900 / 4);
        TableColumn Towar = new TableColumn("Towar");
        Towar.setPrefWidth(900 / 4);
        TableColumn Ilosc = new TableColumn("Ilość");
        Ilosc.setPrefWidth(900 / 4);
        TableColumn Kierowca = new TableColumn("Kierowca");
        Kierowca.setPrefWidth(900 / 4);

        tab1.getColumns().addAll(ID, Towar, Ilosc, Kierowca);
        tabela1.getColumns().addAll(tab1);
        //  -------------------------------

        TableView tabela2 = new TableView();
        tabela2.setEditable(true);

        TableColumn tab2 = new TableColumn("Informacje");
        tab2.setPrefWidth(900);
        TableColumn ID_tab2 = new TableColumn("ID");
        ID_tab2.setPrefWidth(900 / 3);
        TableColumn Magazyn_nazwa = new TableColumn("Nazwa");
        Magazyn_nazwa.setPrefWidth(900 / 3);
        TableColumn Status_wartosc = new TableColumn("Wartość");
        Status_wartosc.setPrefWidth(900 / 3);

        tab2.getColumns().addAll(ID_tab2, Magazyn_nazwa, Status_wartosc);
        tabela2.getColumns().addAll(tab2);

        //  -------------------------------
        TableView tabela3 = new TableView();
        tabela3.setEditable(true);

        TableColumn tab3 = new TableColumn("Towary");
        tab3.setPrefWidth(900);
        TableColumn IdTowaru = new TableColumn("Id Towaru");
        IdTowaru.setPrefWidth(900 / 4);
        TableColumn Nazwa = new TableColumn("Nazwa");
        Nazwa.setPrefWidth(900 / 4);
        TableColumn Regał = new TableColumn("Regał");
        Regał.setPrefWidth(900 / 4);
        TableColumn Ilość = new TableColumn("Ilość");
        Ilość.setPrefWidth(900 / 4);

        tab3.getColumns().addAll(IdTowaru, Nazwa, Regał, Ilość);
        tabela3.getColumns().addAll(tab3);

        ///////// ROOOT
        final VBox vbox = new VBox();
        vbox.setLayoutY(100);
        vbox.setLayoutX(210);
        vbox.resize(900, 550);
        vbox.setSpacing(5);
        vbox.setPadding(new Insets(10, 0, 0, 10));
        vbox.getChildren().add(tabela1);

        //////////////////////////////////////////// 
        root.getChildren().add(Lista);
        root.getChildren().add(Towary);
        root.getChildren().add(Info);
        root.getChildren().add(Listam);
        root.getChildren().add(Towarym);
        root.getChildren().add(Infom);
        root.getChildren().add(Wylogujm);
        root.getChildren().add(cb);
        root.getChildren().add(logo);
        root.getChildren().add(ramka1);
        root.getChildren().add(ramka2);
        root.getChildren().add(ramka3);
        root.getChildren().add(ramka4);
        root.getChildren().add(vbox);
        //////// WYKONANIE

        Listam.setOnMouseClicked((MouseEvent e) -> { // Po kliknieciu wykonaj
            Info.setVisible(false);
            Towary.setVisible(false);
            Lista.setVisible(true);
            vbox.getChildren().clear();
            vbox.getChildren().add(tabela1);

        });
        Listam.setOnMouseExited((MouseEvent e) -> { // Po zjechaniu wykonaj
            ramka1.setVisible(false);

        });
        Listam.setOnMouseEntered((MouseEvent e) -> { // Po najechaniu wykonaj
            ramka1.setVisible(true);

        });

        Towarym.setOnMouseClicked((MouseEvent e) -> { // Po kliknieciu wykonaj
            Info.setVisible(false);
            Towary.setVisible(true);
            Lista.setVisible(false);
            vbox.getChildren().clear();
            vbox.getChildren().add(tabela3);
        });
        Towarym.setOnMouseExited((MouseEvent e) -> { // Po zjechaniu wykonaj
            ramka2.setVisible(false);

        });
        Towarym.setOnMouseEntered((MouseEvent e) -> { // Po najechaniu wykonaj
            ramka2.setVisible(true);

        });

        Infom.setOnMouseClicked((MouseEvent e) -> { // Po kliknieciu wykonaj

            Info.setVisible(true);
            Towary.setVisible(false);
            Lista.setVisible(false);
            vbox.getChildren().clear();
            vbox.getChildren().add(tabela2);
        });
        Infom.setOnMouseExited((MouseEvent e) -> { // Po zjechaniu wykonaj
            ramka3.setVisible(false);

        });
        Infom.setOnMouseEntered((MouseEvent e) -> { // Po najechaniu wykonaj
            ramka3.setVisible(true);

        });

        Wylogujm.setOnMouseClicked((MouseEvent e) -> { // Po kliknieciu wykonaj
            root.getChildren().clear();
            Logowanie.menu(root, primaryStage);
        });
        Wylogujm.setOnMouseExited((MouseEvent e) -> { // Po zjechaniu wykonaj
            ramka4.setVisible(false);

        });
        Wylogujm.setOnMouseEntered((MouseEvent e) -> { // Po najechaniu wykonaj
            ramka4.setVisible(true);

        });
    }

}
