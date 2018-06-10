/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treetableview;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.util.Callback;

/**
 *
 * @author dany
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TreeTableView<String> tableView;
    
    @FXML
    private TreeTableColumn<String,String> col1;
    
    TreeItem<String> item_l1 = new TreeItem<>("NASM");
    TreeItem<String> item_l2 = new TreeItem<>("ASSMEBLY");
    TreeItem<String> parent1 = new TreeItem<>("LOW LEVEL LANGUAGES");
    
    TreeItem<String> item_h1 = new TreeItem<>("C++");
    TreeItem<String> item_h2 = new TreeItem<>("Java");
    TreeItem<String> item_h3 = new TreeItem<>("Python");
    TreeItem<String> parent2 = new TreeItem<>("HIGH LEVEL LANGUAGES");
    
    TreeItem<String> root = new TreeItem<>("Programming Languages");
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        parent1.getChildren().setAll(item_l1,item_l2);
        parent2.getChildren().setAll(item_h1,item_h2,item_h3);
        root.getChildren().setAll(parent1, parent2);
        
        col1.setCellValueFactory((TreeTableColumn.CellDataFeatures<String,String> param) -> 
            {
            return new SimpleStringProperty(param.getValue().getValue());
        }
        );
        
        tableView.setRoot(root);
    }    
    
}
