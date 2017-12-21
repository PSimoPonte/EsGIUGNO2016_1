//esercizio con varie tipologie di pulsanti

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.ToolBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Simone.Pontalti
 */
public class EsGIUGNO2016_1 extends Application {
    
    @Override
    public void start(Stage finestra) {
        Button btn = new Button();
        
        Label lbl1 = new Label("Che marca preferisci?");
        
        ChoiceBox cbx = new ChoiceBox();
        cbx.getItems().addAll("Scegli","Ducati","Yamaha", "Suzuki","Honda","Triumph","Moto Guzzi","Gilera","Husqvarna","Ktm","Bmw","Kawasaki");
        cbx.setValue("Scegli");
        Label lbl2 = new Label("Usata o nuova?");
        
        ToggleGroup grp1 = new ToggleGroup(); //ToggleGroup è una classe che serve per raggruppare i radiobutton
        
        RadioButton rdn1 = new RadioButton();
        rdn1.setText("Nuova");
        rdn1.setToggleGroup(grp1); // .setToggleGroup è un metodo della classe RadioButton che mi serve per dire al radiobutton specifico
                                    //a quale gruppo appartiene
        
        RadioButton rdn2 = new RadioButton();
        rdn2.setText("Usata");
        rdn2.setToggleGroup(grp1);
                                    
        Label lbl3 = new Label("Quale modello?");
        
        ToggleGroup grp2 = new ToggleGroup(); //ToggleGroup è una classe che serve per raggruppare i radiobutton
        
        RadioButton rdn3 = new RadioButton(); //checkBox è una classe
        rdn3.setText("Sport"); //.setText è un metodo della classe CheckBox che serve per inserire il testo a fianco della casella
        rdn3.setToggleGroup(grp2);
        
        RadioButton rdn4 = new RadioButton(); //checkBox è una classe
        rdn4.setText("Cross/Enduro"); //.setText è un metodo della classe CheckBox che serve per inserire il testo a fianco della casella
        rdn4.setToggleGroup(grp2);
        
        RadioButton rdn5 = new RadioButton(); //checkBox è una classe
        rdn5.setText("Turismo"); //.setText è un metodo della classe CheckBox che serve per inserire il testo a fianco della casellaox();
        rdn5.setToggleGroup(grp2);
        
        RadioButton rdn6 = new RadioButton(); //checkBox è una classe
        rdn6.setText("Custom"); //.setText è un metodo della classe CheckBox che serve per inserire il testo a fianco della casellaox();
        rdn6.setToggleGroup(grp2);
        
        RadioButton rdn7 = new RadioButton(); //checkBox è una classe
        rdn7.setText("Quad"); //.setText è un metodo della classe CheckBox che serve per inserire il testo a fianco della casellaox();
        rdn7.setToggleGroup(grp2);
        
        RadioButton rdn8 = new RadioButton(); //checkBox è una classe
        rdn8.setText("Epoca"); //.setText è un metodo della classe CheckBox che serve per inserire il testo a fianco della casellaox();
        rdn8.setToggleGroup(grp2);
        
        RadioButton rdn9 = new RadioButton(); //checkBox è una classe
        rdn9.setText("Scooter"); //.setText è un metodo della classe CheckBox che serve per inserire il testo a fianco della casellaox();
        rdn9.setToggleGroup(grp2);
        
        RadioButton rdn10 = new RadioButton(); //checkBox è una classe
        rdn10.setText("Altro"); //.setText è un metodo della classe CheckBox che serve per inserire il testo a fianco della casellaox();
        rdn10.setToggleGroup(grp2);
        
        Label lbl4 = new Label("Di quale anno?");
        
        ChoiceBox cbx1 = new ChoiceBox();
        cbx1.getItems().addAll("Scegli","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016");
        cbx1.setValue("Scegli");
        
        Label lbl5 = new Label("Km?");
        
        ChoiceBox cbx2 = new ChoiceBox();
        cbx2.getItems().addAll("Scegli","km 0","0-5000","5000-10000","10000-20000");
        cbx2.setValue("Scegli");
        
        Label lbl6 = new Label("Cilindrata");
        
        ChoiceBox cbx3 = new ChoiceBox();
        cbx3.getItems().addAll("Scegli","50","125","150","250","350","600","750","900");
        cbx3.setValue("Scegli");
        
        Label lbl7 = new Label("Prezzo");
        
        TextArea txt = new TextArea();
       
        txt.setMaxHeight(900);
        txt.setMaxWidth(360);
        txt.setPrefSize(360, 280);
        txt.setEditable(false);
        
        final ImageView selectedImage = new ImageView();   
        selectedImage.setFitWidth(360);
        selectedImage.setFitHeight(280);
        
         rdn3.setOnAction(new EventHandler<ActionEvent>() {
            
          @Override
        public void handle(ActionEvent event) {
            
            if(rdn3.isSelected()){
                 Image image1 = new Image(EsGIUGNO2016_1.class.getResourceAsStream("sport.png"));
                 selectedImage.setImage(image1);
            selectedImage.setVisible(true);
            }  
            
           }
        });
         
         rdn4.setOnAction(new EventHandler<ActionEvent>() {
            
          @Override
        public void handle(ActionEvent event) {
            
            if(rdn4.isSelected()){
                 Image image1 = new Image(EsGIUGNO2016_1.class.getResourceAsStream("cross.png"));
                 selectedImage.setImage(image1);
            selectedImage.setVisible(true);
            }  
            
           }
        });
         
         rdn5.setOnAction(new EventHandler<ActionEvent>() {
            
          @Override
        public void handle(ActionEvent event) {
            
            if(rdn5.isSelected()){
                 Image image1 = new Image(EsGIUGNO2016_1.class.getResourceAsStream("turismo.png"));
                 selectedImage.setImage(image1);
            selectedImage.setVisible(true);
            }  
            
           }
        });
         
        rdn6.setOnAction(new EventHandler<ActionEvent>() {
            
          @Override
        public void handle(ActionEvent event) {
            
            if(rdn6.isSelected()){
                 Image image1 = new Image(EsGIUGNO2016_1.class.getResourceAsStream("custom.png"));
                 selectedImage.setImage(image1);
            selectedImage.setVisible(true);
            }  
            
           }
        });
        
        rdn7.setOnAction(new EventHandler<ActionEvent>() {
            
          @Override
        public void handle(ActionEvent event) {
            
            if(rdn7.isSelected()){
                 Image image1 = new Image(EsGIUGNO2016_1.class.getResourceAsStream("quod.png"));
                 selectedImage.setImage(image1);
            selectedImage.setVisible(true);
            }  
            
           }
        });
        
        rdn8.setOnAction(new EventHandler<ActionEvent>() {
            
          @Override
        public void handle(ActionEvent event) {
            
            if(rdn8.isSelected()){
                 Image image1 = new Image(EsGIUGNO2016_1.class.getResourceAsStream("epoca.png"));
                 selectedImage.setImage(image1);
            selectedImage.setVisible(true);
            }  
            
           }
        });
         
        rdn9.setOnAction(new EventHandler<ActionEvent>() {
            
          @Override
        public void handle(ActionEvent event) {
            
            if(rdn9.isSelected()){
                 Image image1 = new Image(EsGIUGNO2016_1.class.getResourceAsStream("scooter.png"));
                 selectedImage.setImage(image1);
            selectedImage.setVisible(true);
            }  
            
           }
        });
        
        rdn10.setOnAction(new EventHandler<ActionEvent>() {
            
          @Override
        public void handle(ActionEvent event) {
            
            if(rdn10.isSelected()){
                 Image image1 = new Image(EsGIUGNO2016_1.class.getResourceAsStream("altro.png"));
                 selectedImage.setImage(image1);
            selectedImage.setVisible(true);
            }  
            
           }
        });
        
        final Slider slider = new Slider(0, 1, 1);    
        final Label opacityCaption = new Label("Euro:");
        final Label opacityValue = new Label(Double.toString(slider.getValue()));
        
        
        Button btn2 = new Button();
        btn2.setText("Invio");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                String testo = "\nBuongiorno \n";
               
                //String x = txt1.getText(); // .getText prende il testo inserito dall'utente e lo assegna ad x
                
                String y = (String)cbx.getSelectionModel().getSelectedItem().toString(); 
                //assegno a y il valore del combobox
      
                //testo = testo+ "\nNome del cliente: "+x;            // testo=testo+"".. -> modo per aggiungere testo in coda!
                testo = testo+"\nLa marca scelta è: "+y;
                
            
                
                   if(rdn1.isSelected()){
                    testo = testo+"\n\nMoto: Nuova"; 
                }
                  if(rdn2.isSelected()){
                    testo = testo+"\n\nMoto: Usata"; 
                }
                if(rdn3.isSelected()){
                    testo = testo+"\n\nIl modello scelto dal cliente è: Sport"; 
                }
                if(rdn4.isSelected()){
                    testo = testo+"\n\nIl modello scelto dal cliente è: Cross"; 
                }
                if(rdn5.isSelected()){
                    testo = testo+"\n\nIl modello scelto dal cliente è: Turismo\n"; 
                }
                if(rdn6.isSelected()){
                    testo = testo+"\n\nIl modello scelto dal cliente è: Custom\n";
                }
                if(rdn7.isSelected()){
                    testo = testo+"\n\nIl modello scelto dal cliente è: Quod\n"; 
                }
                if(rdn8.isSelected()){
                    testo = testo+"\n\nIl modello scelto dal cliente è: Epoca\n"; 
                }
                if(rdn9.isSelected()){
                    testo = testo+"\n\nIl modello scelto dal cliente è: Scooter\n"; 
                }
                if(rdn10.isSelected()){
                    testo = testo+"\n\nIl modello scelto dal cliente è: Altro\n"; 
                }
                
                String u = (String)cbx1.getSelectionModel().getSelectedItem().toString(); 
                testo = testo+"\nL'anno scelto è: "+u;
              
                String p = (String)cbx2.getSelectionModel().getSelectedItem().toString(); 
                testo = testo+"\nI Km selezionati sono: "+p;
                
                String t = (String)cbx3.getSelectionModel().getSelectedItem().toString(); 
                testo = testo+"\nLa cilindrata desiderata è: "+t;
                
                
                String s = opacityValue.getText();
                testo = testo+"\nIl prezzo scelto è: "+s;
                
                txt.setText(testo);
           }
        });
        
         Button btn3 = new Button ("Reset");
        
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                rdn1.setSelected(false); //.setSelected è un metodo della classe checkbox / radiobutton ma non solo che serve per azzarare (false)
                rdn1.setDisable(false);
                rdn2.setSelected(false);
                rdn2.setDisable(false);
                rdn3.setSelected(false);
                rdn3.setDisable(false);
                rdn4.setSelected(false);
                rdn4.setDisable(false);
                rdn5.setSelected(false);
                rdn5.setDisable(false);
                rdn6.setSelected(false);
                rdn6.setDisable(false);
                rdn7.setSelected(false);
                rdn7.setDisable(false);
                rdn8.setSelected(false);
                rdn8.setDisable(false);
                
                /*
                cbx.getSelectionModel().clearSelection();
                cbx1.getSelectionModel().clearSelection(); //per azzerare un combobox
                cbx2.getSelectionModel().clearSelection();
                cbx3.getSelectionModel().clearSelection();
                */
                
                cbx.setValue("Scegli");
                cbx1.setValue("Scegli");
                cbx2.setValue("Scegli");
                cbx3.setValue("Scegli");
                
                selectedImage.setVisible(false);
         
                
                        
                txt.setText(" ");
                
            }
        });
        
        
        
        //ToolBar toolbar = new ToolBar();
        VBox statusbar = new VBox(30);
        statusbar.setAlignment(Pos.TOP_RIGHT);
        //statusbar.getChildren().add(txt);
        statusbar.getChildren().add(selectedImage);
        statusbar.getChildren().add(txt);
        
        
        //Slider classe per inserire una slider bar
        
        
        slider.setMin(0);
        slider.setMax(20000);
        slider.setValue(40);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(10000);
        slider.setMinorTickCount(5);
        slider.setBlockIncrement(10);
        
           slider.valueProperty().addListener(new ChangeListener<Number>() {
             @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue)
            {
                    opacityValue.setText(String.format("%.2f", newValue));
            }
        });
       
        
        
        RadioButton rdn11 = new RadioButton();
        rdn11.setText("Mostra\nimmagine");
        
        HBox root1 = new HBox(20);        /////////////// layout 2
        root1.setPadding(new Insets (10,10,20,10));
        root1.getChildren().add(lbl1);
        root1.getChildren().add(cbx);
        root1.getChildren().add(lbl2);
        root1.getChildren().add(rdn1);
        root1.getChildren().add(rdn2);
        
        GridPane root2 = new GridPane();        ////////// layout 3
        root2.setAlignment(Pos.TOP_LEFT);
        root2.setHgap(20);
        root2.setVgap(60);
        root2.setPadding(new Insets(10, 10, 10, 10));
        
        
        root2.add(lbl3, 0, 0);
        root2.add(rdn3, 1, 0);
        root2.add(rdn4, 1, 1);
        root2.add(rdn5, 1, 2);
        root2.add(rdn6, 2, 0);
        root2.add(rdn7, 2, 1);
        root2.add(rdn8, 2, 2);
        root2.add(rdn9, 3, 0);
        root2.add(rdn10, 3, 1);
        root2.add(lbl4, 0, 3);
        root2.add(cbx1, 1, 3);
        root2.add(lbl5, 2, 3);
        root2.add(cbx2, 3, 3);
        root2.add(lbl6, 0, 4);
        root2.add(cbx3, 1, 4);
        root2.add(lbl7, 2, 4);
        root2.add(slider, 3, 4);
        root2.add(opacityCaption,4,4);
        root2.add(opacityValue,5,4);
        root2.add(btn2, 1, 6);
        root2.add(btn3, 2, 6);
        
     
        
        /*
         root2.add(lbl5, 0, 4);
        root2.add(cbx2, 1, 4);
        */ 
        
        btn.setText("Invio'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Fatto!");
            }
        });
        
        BorderPane root = new BorderPane();         ////////////layout 1
        
        root.setTop(root1);
        root.setLeft(root2);
        //root.getChildren().add(btn);
        root.setPadding(new Insets(20, 20, 20, 20)); 
        root.setCenter(statusbar);
        
        Scene scene = new Scene(root, 300, 250);
        
        finestra.setTitle("Scegli la tua moto");
        finestra.setScene(scene);
        finestra.setWidth(1030);
        finestra.setHeight(700);
        finestra.setResizable(false);
        finestra.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
